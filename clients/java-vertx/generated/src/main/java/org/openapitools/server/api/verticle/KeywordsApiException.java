package org.openapitools.server.api.verticle;

import org.openapitools.server.api.model.Error;
import org.openapitools.server.api.model.KeywordUpdateBody;
import org.openapitools.server.api.model.KeywordsGet200Response;
import org.openapitools.server.api.model.KeywordsMetricsArrayResponse;
import org.openapitools.server.api.model.KeywordsRequest;
import org.openapitools.server.api.model.KeywordsResponse;
import org.openapitools.server.api.MainApiException;
import org.openapitools.server.api.model.MatchType;
import org.openapitools.server.api.model.TrendType;
import org.openapitools.server.api.model.TrendingKeywordsResponse;
import org.openapitools.server.api.model.TrendsSupportedRegion;

public final class KeywordsApiException extends MainApiException {
    public KeywordsApiException(int statusCode, String statusMessage) {
        super(statusCode, statusMessage);
    }

    public static final KeywordsApiException Keywords_countryKeywordsMetricsGet_200_Exception = new KeywordsApiException(200, "Success");
    public static final KeywordsApiException Keywords_keywordsCreate_200_Exception = new KeywordsApiException(200, "Success");
    public static final KeywordsApiException Keywords_keywordsGet_200_Exception = new KeywordsApiException(200, "Success");
    public static final KeywordsApiException Keywords_keywordsUpdate_200_Exception = new KeywordsApiException(200, "Success");
    public static final KeywordsApiException Keywords_trendingKeywordsList_200_Exception = new KeywordsApiException(200, "Success");
    public static final KeywordsApiException Keywords_trendingKeywordsList_400_Exception = new KeywordsApiException(400, "Invalid trending keywords request parameters");
    

}