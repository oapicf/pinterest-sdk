// tslint:disable
/**
 * Pinterest REST API
 * Pinterest\'s REST API
 *
 * The version of the OpenAPI document: 5.14.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

/**
 * Campaign objective type. If set as one of [\"AWARENESS\", \"CONSIDERATION\", \"WEB_CONVERSION\", \"CATALOG_SALES\", \"VIDEO_COMPLETION\"] the campaign is considered as a Campaign Budget Optimization (CBO) campaign, meaning budget needs to be set at the campaign level rather than at the ad group level. [\"WEB_SESSIONS\"] is DEPRECATED. For update, only draft campaigns may update objective type.
 * @export
 * @enum {string}
 */
export enum ObjectiveType {
    Awareness = 'AWARENESS',
    Consideration = 'CONSIDERATION',
    VideoView = 'VIDEO_VIEW',
    WebConversion = 'WEB_CONVERSION',
    CatalogSales = 'CATALOG_SALES',
    WebSessions = 'WEB_SESSIONS',
    VideoCompletion = 'VIDEO_COMPLETION'
}

