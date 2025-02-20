/**
 * Pinterest REST API
 * Pinterest\'s REST API
 *
 * OpenAPI spec version: 5.14.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

import { RelatedTermsRelatedTermsListInner } from '../models/RelatedTermsRelatedTermsListInner';
import { HttpFile } from '../http/http';

export class RelatedTerms {
    /**
    * First input term. For example, if you pass \"?terms=clothes,workout\", then id will be \"clothes\"
    */
    'id'?: string;
    /**
    * Total number of related terms returned
    */
    'relatedTermCount'?: number;
    /**
    * The id of the advertiser.
    */
    'relatedTermsList'?: Array<RelatedTermsRelatedTermsListInner>;

    static readonly discriminator: string | undefined = undefined;

    static readonly mapping: {[index: string]: string} | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "id",
            "baseName": "id",
            "type": "string",
            "format": ""
        },
        {
            "name": "relatedTermCount",
            "baseName": "related_term_count",
            "type": "number",
            "format": ""
        },
        {
            "name": "relatedTermsList",
            "baseName": "related_terms_list",
            "type": "Array<RelatedTermsRelatedTermsListInner>",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return RelatedTerms.attributeTypeMap;
    }

    public constructor() {
    }
}
