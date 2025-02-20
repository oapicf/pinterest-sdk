/**
 * Pinterest REST API
 * Pinterest's REST API
 *
 * The version of the OpenAPI document: 5.14.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI-Generator 7.9.0.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

/*
 * TrendingKeywordsResponse_trends_inner.h
 *
 * 
 */

#ifndef ORG_OPENAPITOOLS_CLIENT_MODEL_TrendingKeywordsResponse_trends_inner_H_
#define ORG_OPENAPITOOLS_CLIENT_MODEL_TrendingKeywordsResponse_trends_inner_H_


#include "CppRestOpenAPIClient/ModelBase.h"

#include <cpprest/details/basic_types.h>
#include "CppRestOpenAPIClient/model/TrendingKeywordsResponse_trends_inner_time_series.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {



/// <summary>
/// 
/// </summary>
class  TrendingKeywordsResponse_trends_inner
    : public ModelBase
{
public:
    TrendingKeywordsResponse_trends_inner();
    virtual ~TrendingKeywordsResponse_trends_inner();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    web::json::value toJson() const override;
    bool fromJson(const web::json::value& json) override;

    void toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) const override;
    bool fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) override;

    /////////////////////////////////////////////
    /// TrendingKeywordsResponse_trends_inner members

    /// <summary>
    /// The keyword that is trending.
    /// </summary>
    utility::string_t getKeyword() const;
    bool keywordIsSet() const;
    void unsetKeyword();

    void setKeyword(const utility::string_t& value);

    /// <summary>
    /// The week-over-week percent change in search volume for this keyword.&lt;br /&gt; For example, a value of \&quot;50\&quot; would represent a 50% increase in searches in the last seven days compared to the week prior.&lt;br /&gt; **Note**: growth rates are rounded, with a maximum of +/- 10000% change.  A value of 10001 indicates that this keyword experienced &gt; 10000% week-over-week growth.
    /// </summary>
    int32_t getPctGrowthWow() const;
    bool pctGrowthWowIsSet() const;
    void unsetPct_growth_wow();

    void setPctGrowthWow(int32_t value);

    /// <summary>
    /// The month-over-month percent change in search volume for this keyword.&lt;br /&gt; For example, a value of \&quot;400\&quot; would represent a 400% increase in searches in the last 30 days compared to the month prior.&lt;br /&gt; **Note**: growth rates are rounded, with a maximum of +/- 10000% change.  A value of 10001 indicates that this keyword experienced &gt; 10000% month-over-month growth.
    /// </summary>
    int32_t getPctGrowthMom() const;
    bool pctGrowthMomIsSet() const;
    void unsetPct_growth_mom();

    void setPctGrowthMom(int32_t value);

    /// <summary>
    /// The year-over-year percent change in search volume for this keyword.&lt;br /&gt; For example, a value of \&quot;-5\&quot; would represent a 5% decrease in searches in the last 365 days compared to the month prior.&lt;br /&gt; **Note**: growth rates are rounded, with a maximum of +/- 10000% change.  A value of 10001 indicates that this keyword experienced &gt; 10000% year-over-year growth.
    /// </summary>
    int32_t getPctGrowthYoy() const;
    bool pctGrowthYoyIsSet() const;
    void unsetPct_growth_yoy();

    void setPctGrowthYoy(int32_t value);

    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<TrendingKeywordsResponse_trends_inner_time_series> getTimeSeries() const;
    bool timeSeriesIsSet() const;
    void unsetTime_series();

    void setTimeSeries(const std::shared_ptr<TrendingKeywordsResponse_trends_inner_time_series>& value);


protected:
    utility::string_t m_Keyword;
    bool m_KeywordIsSet;
    int32_t m_Pct_growth_wow;
    bool m_Pct_growth_wowIsSet;
    int32_t m_Pct_growth_mom;
    bool m_Pct_growth_momIsSet;
    int32_t m_Pct_growth_yoy;
    bool m_Pct_growth_yoyIsSet;
    std::shared_ptr<TrendingKeywordsResponse_trends_inner_time_series> m_Time_series;
    bool m_Time_seriesIsSet;
};


}
}
}
}

#endif /* ORG_OPENAPITOOLS_CLIENT_MODEL_TrendingKeywordsResponse_trends_inner_H_ */
