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
 * BookClosedResponse.h
 *
 * Creation fields
 */

#ifndef ORG_OPENAPITOOLS_CLIENT_MODEL_BookClosedResponse_H_
#define ORG_OPENAPITOOLS_CLIENT_MODEL_BookClosedResponse_H_


#include "CppRestOpenAPIClient/ModelBase.h"


namespace org {
namespace openapitools {
namespace client {
namespace model {



/// <summary>
/// Creation fields
/// </summary>
class  BookClosedResponse
    : public ModelBase
{
public:
    BookClosedResponse();
    virtual ~BookClosedResponse();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    web::json::value toJson() const override;
    bool fromJson(const web::json::value& json) override;

    void toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) const override;
    bool fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) override;

    /////////////////////////////////////////////
    /// BookClosedResponse members

    /// <summary>
    /// Are conversion metrics ready?
    /// </summary>
    bool isConversionMetricsReady() const;
    bool conversionMetricsReadyIsSet() const;
    void unsetConversion_metrics_ready();

    void setConversionMetricsReady(bool value);

    /// <summary>
    /// Are non-conversion metrics ready?
    /// </summary>
    bool isNonConversionMetricsReady() const;
    bool nonConversionMetricsReadyIsSet() const;
    void unsetNon_conversion_metrics_ready();

    void setNonConversionMetricsReady(bool value);


protected:
    bool m_Conversion_metrics_ready;
    bool m_Conversion_metrics_readyIsSet;
    bool m_Non_conversion_metrics_ready;
    bool m_Non_conversion_metrics_readyIsSet;
};


}
}
}
}

#endif /* ORG_OPENAPITOOLS_CLIENT_MODEL_BookClosedResponse_H_ */
