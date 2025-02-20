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
 * Catalogs_product_group_pricing_currency_criteria.h
 *
 * 
 */

#ifndef ORG_OPENAPITOOLS_CLIENT_MODEL_Catalogs_product_group_pricing_currency_criteria_H_
#define ORG_OPENAPITOOLS_CLIENT_MODEL_Catalogs_product_group_pricing_currency_criteria_H_


#include "CppRestOpenAPIClient/ModelBase.h"

#include "CppRestOpenAPIClient/model/NonNullableCatalogsCurrency.h"
#include <cpprest/details/basic_types.h>

namespace org {
namespace openapitools {
namespace client {
namespace model {



/// <summary>
/// 
/// </summary>
class  Catalogs_product_group_pricing_currency_criteria
    : public ModelBase
{
public:
    Catalogs_product_group_pricing_currency_criteria();
    virtual ~Catalogs_product_group_pricing_currency_criteria();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    web::json::value toJson() const override;
    bool fromJson(const web::json::value& json) override;

    void toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) const override;
    bool fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) override;

    /////////////////////////////////////////////
    /// Catalogs_product_group_pricing_currency_criteria members

    /// <summary>
    /// 
    /// </summary>
    utility::string_t getROperator() const;
    bool rOperatorIsSet() const;
    void unsetr_operator();

    void setROperator(const utility::string_t& value);

    /// <summary>
    /// 
    /// </summary>
    double getValue() const;
    bool valueIsSet() const;
    void unsetValue();

    void setValue(double value);

    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<NonNullableCatalogsCurrency> getCurrency() const;
    bool currencyIsSet() const;
    void unsetCurrency();

    void setCurrency(const std::shared_ptr<NonNullableCatalogsCurrency>& value);

    /// <summary>
    /// 
    /// </summary>
    bool isNegated() const;
    bool negatedIsSet() const;
    void unsetNegated();

    void setNegated(bool value);


protected:
    utility::string_t m_r_operator;
    bool m_r_operatorIsSet;
    double m_Value;
    bool m_ValueIsSet;
    std::shared_ptr<NonNullableCatalogsCurrency> m_Currency;
    bool m_CurrencyIsSet;
    bool m_Negated;
    bool m_NegatedIsSet;
};


}
}
}
}

#endif /* ORG_OPENAPITOOLS_CLIENT_MODEL_Catalogs_product_group_pricing_currency_criteria_H_ */
