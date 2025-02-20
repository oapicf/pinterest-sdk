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
 * AdGroupSummaryStatus.h
 *
 * Summary status for ad group
 */

#ifndef ORG_OPENAPITOOLS_CLIENT_MODEL_AdGroupSummaryStatus_H_
#define ORG_OPENAPITOOLS_CLIENT_MODEL_AdGroupSummaryStatus_H_


#include "CppRestOpenAPIClient/ModelBase.h"


namespace org {
namespace openapitools {
namespace client {
namespace model {


class  AdGroupSummaryStatus
    : public ModelBase
{
public:
    AdGroupSummaryStatus();
    virtual ~AdGroupSummaryStatus();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    web::json::value toJson() const override;
    bool fromJson(const web::json::value& json) override;

    void toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) const override;
    bool fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) override;

    enum class eAdGroupSummaryStatus
    {
        AdGroupSummaryStatus_RUNNING,
        AdGroupSummaryStatus_PAUSED,
        AdGroupSummaryStatus_NOT_STARTED,
        AdGroupSummaryStatus_COMPLETED,
        AdGroupSummaryStatus_ADVERTISER_DISABLED,
        AdGroupSummaryStatus_ARCHIVED,
        AdGroupSummaryStatus_DRAFT,
        AdGroupSummaryStatus_DELETED_DRAFT,
    };

    eAdGroupSummaryStatus getValue() const;
    void setValue(eAdGroupSummaryStatus const value);

    protected:
        eAdGroupSummaryStatus m_value;
};

}
}
}
}

#endif /* ORG_OPENAPITOOLS_CLIENT_MODEL_AdGroupSummaryStatus_H_ */
