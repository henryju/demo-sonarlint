function _getXY(node) {
	var scrollLeft, scrollTop, box, doc, clientTop, clientLeft, 
	    round = Math.round,
	xy = false;

	if (Y.Dom._canPosition(node)) {
		box = node[GET_BOUNDING_CLIENT_RECT]();
		doc = node[OWNER_DOCUMENT];
		scrollLeft = Y.Dom.getDocumentScrollLeft(doc);
		scrollTop = Y.Dom.getDocumentScrollTop(doc);
		xy = [ box[LEFT], box[TOP] ];

		// remove IE default documentElement offset (border)
		if (clientTop || clientLeft) {
			xy[0] -= clientLeft;
			xy[1] -= clientTop;
		}

		if ((scrollTop || scrollLeft)) {
			xy[0] += scrollLeft;
			xy[1] += scrollTop;
		}

		// gecko may return sub-pixel (non-int) values
		xy[0] = round(xy[0]);
		xy[1] = round(xy[1]);
	} else {
		YAHOO
				.log(
						'getXY failed: element not positionable (either not in a document or not displayed)',
						'error', 'Dom');
	}

	return xy;
}