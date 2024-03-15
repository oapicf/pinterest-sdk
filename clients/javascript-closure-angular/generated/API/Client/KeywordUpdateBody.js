goog.provide('API.Client.KeywordUpdateBody');

/**
 * @record
 */
API.Client.KeywordUpdateBody = function() {}

/**
 * Keywords to update. Object array. Each object has 3 possible fields:<br>1. \"id\": (required) keyword ID<br>2. \"archived\": boolean. Should keyword be archived?<br>3. \"bid\": number<br>For example: [{\"id\":\"2886610576653\", \"archived\": false, \"bid\": 20000}, {\"id\":\"2886610576654\",  \"archived\": true, \"bid\": 20000}, ...]
 * @type {!Array<!API.Client.KeywordUpdate>}
 * @export
 */
API.Client.KeywordUpdateBody.prototype.keywords;

