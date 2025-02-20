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
 * CatalogsCreativeAssetsProductGroupFilterKeys.h
 *
 * 
 */

#ifndef ORG_OPENAPITOOLS_CLIENT_MODEL_CatalogsCreativeAssetsProductGroupFilterKeys_H_
#define ORG_OPENAPITOOLS_CLIENT_MODEL_CatalogsCreativeAssetsProductGroupFilterKeys_H_


#include "CppRestOpenAPIClient/ModelBase.h"

#include "CppRestOpenAPIClient/model/GoogleProductCategory6Filter.h"
#include "CppRestOpenAPIClient/model/CatalogsProductGroupMultipleStringCriteria.h"
#include "CppRestOpenAPIClient/model/GoogleProductCategory0Filter.h"
#include "CppRestOpenAPIClient/model/CustomLabel1Filter.h"
#include "CppRestOpenAPIClient/model/CatalogsProductGroupMultipleMediaTypesCriteria.h"
#include "CppRestOpenAPIClient/model/CustomLabel2Filter.h"
#include "CppRestOpenAPIClient/model/GoogleProductCategory3Filter.h"
#include "CppRestOpenAPIClient/model/CustomLabel3Filter.h"
#include "CppRestOpenAPIClient/model/CreativeAssetsIdFilter.h"
#include "CppRestOpenAPIClient/model/GoogleProductCategory4Filter.h"
#include "CppRestOpenAPIClient/model/GoogleProductCategory2Filter.h"
#include "CppRestOpenAPIClient/model/CustomLabel4Filter.h"
#include "CppRestOpenAPIClient/model/MediaTypeFilter.h"
#include "CppRestOpenAPIClient/model/GoogleProductCategory5Filter.h"
#include "CppRestOpenAPIClient/model/CatalogsProductGroupMultipleStringListCriteria.h"
#include "CppRestOpenAPIClient/model/CustomLabel0Filter.h"
#include "CppRestOpenAPIClient/model/GoogleProductCategory1Filter.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {



/// <summary>
/// 
/// </summary>
class  CatalogsCreativeAssetsProductGroupFilterKeys
    : public ModelBase
{
public:
    CatalogsCreativeAssetsProductGroupFilterKeys();
    virtual ~CatalogsCreativeAssetsProductGroupFilterKeys();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    web::json::value toJson() const override;
    bool fromJson(const web::json::value& json) override;

    void toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) const override;
    bool fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) override;

    /////////////////////////////////////////////
    /// CatalogsCreativeAssetsProductGroupFilterKeys members

    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<CatalogsProductGroupMultipleStringCriteria> getCREATIVEASSETSID() const;
    bool cREATIVEASSETSIDIsSet() const;
    void unsetCREATIVE_ASSETS_ID();

    void setCREATIVEASSETSID(const std::shared_ptr<CatalogsProductGroupMultipleStringCriteria>& value);

    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<CatalogsProductGroupMultipleStringCriteria> getCUSTOMLABEL0() const;
    bool cUSTOMLABEL0IsSet() const;
    void unsetCUSTOM_LABEL_0();

    void setCUSTOMLABEL0(const std::shared_ptr<CatalogsProductGroupMultipleStringCriteria>& value);

    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<CatalogsProductGroupMultipleStringCriteria> getCUSTOMLABEL1() const;
    bool cUSTOMLABEL1IsSet() const;
    void unsetCUSTOM_LABEL_1();

    void setCUSTOMLABEL1(const std::shared_ptr<CatalogsProductGroupMultipleStringCriteria>& value);

    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<CatalogsProductGroupMultipleStringCriteria> getCUSTOMLABEL2() const;
    bool cUSTOMLABEL2IsSet() const;
    void unsetCUSTOM_LABEL_2();

    void setCUSTOMLABEL2(const std::shared_ptr<CatalogsProductGroupMultipleStringCriteria>& value);

    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<CatalogsProductGroupMultipleStringCriteria> getCUSTOMLABEL3() const;
    bool cUSTOMLABEL3IsSet() const;
    void unsetCUSTOM_LABEL_3();

    void setCUSTOMLABEL3(const std::shared_ptr<CatalogsProductGroupMultipleStringCriteria>& value);

    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<CatalogsProductGroupMultipleStringCriteria> getCUSTOMLABEL4() const;
    bool cUSTOMLABEL4IsSet() const;
    void unsetCUSTOM_LABEL_4();

    void setCUSTOMLABEL4(const std::shared_ptr<CatalogsProductGroupMultipleStringCriteria>& value);

    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<CatalogsProductGroupMultipleStringListCriteria> getGOOGLEPRODUCTCATEGORY6() const;
    bool gOOGLEPRODUCTCATEGORY6IsSet() const;
    void unsetGOOGLE_PRODUCT_CATEGORY_6();

    void setGOOGLEPRODUCTCATEGORY6(const std::shared_ptr<CatalogsProductGroupMultipleStringListCriteria>& value);

    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<CatalogsProductGroupMultipleStringListCriteria> getGOOGLEPRODUCTCATEGORY5() const;
    bool gOOGLEPRODUCTCATEGORY5IsSet() const;
    void unsetGOOGLE_PRODUCT_CATEGORY_5();

    void setGOOGLEPRODUCTCATEGORY5(const std::shared_ptr<CatalogsProductGroupMultipleStringListCriteria>& value);

    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<CatalogsProductGroupMultipleStringListCriteria> getGOOGLEPRODUCTCATEGORY4() const;
    bool gOOGLEPRODUCTCATEGORY4IsSet() const;
    void unsetGOOGLE_PRODUCT_CATEGORY_4();

    void setGOOGLEPRODUCTCATEGORY4(const std::shared_ptr<CatalogsProductGroupMultipleStringListCriteria>& value);

    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<CatalogsProductGroupMultipleStringListCriteria> getGOOGLEPRODUCTCATEGORY3() const;
    bool gOOGLEPRODUCTCATEGORY3IsSet() const;
    void unsetGOOGLE_PRODUCT_CATEGORY_3();

    void setGOOGLEPRODUCTCATEGORY3(const std::shared_ptr<CatalogsProductGroupMultipleStringListCriteria>& value);

    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<CatalogsProductGroupMultipleStringListCriteria> getGOOGLEPRODUCTCATEGORY2() const;
    bool gOOGLEPRODUCTCATEGORY2IsSet() const;
    void unsetGOOGLE_PRODUCT_CATEGORY_2();

    void setGOOGLEPRODUCTCATEGORY2(const std::shared_ptr<CatalogsProductGroupMultipleStringListCriteria>& value);

    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<CatalogsProductGroupMultipleStringListCriteria> getGOOGLEPRODUCTCATEGORY1() const;
    bool gOOGLEPRODUCTCATEGORY1IsSet() const;
    void unsetGOOGLE_PRODUCT_CATEGORY_1();

    void setGOOGLEPRODUCTCATEGORY1(const std::shared_ptr<CatalogsProductGroupMultipleStringListCriteria>& value);

    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<CatalogsProductGroupMultipleStringListCriteria> getGOOGLEPRODUCTCATEGORY0() const;
    bool gOOGLEPRODUCTCATEGORY0IsSet() const;
    void unsetGOOGLE_PRODUCT_CATEGORY_0();

    void setGOOGLEPRODUCTCATEGORY0(const std::shared_ptr<CatalogsProductGroupMultipleStringListCriteria>& value);

    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<CatalogsProductGroupMultipleMediaTypesCriteria> getMEDIATYPE() const;
    bool mEDIATYPEIsSet() const;
    void unsetMEDIA_TYPE();

    void setMEDIATYPE(const std::shared_ptr<CatalogsProductGroupMultipleMediaTypesCriteria>& value);


protected:
    std::shared_ptr<CatalogsProductGroupMultipleStringCriteria> m_CREATIVE_ASSETS_ID;
    bool m_CREATIVE_ASSETS_IDIsSet;
    std::shared_ptr<CatalogsProductGroupMultipleStringCriteria> m_CUSTOM_LABEL_0;
    bool m_CUSTOM_LABEL_0IsSet;
    std::shared_ptr<CatalogsProductGroupMultipleStringCriteria> m_CUSTOM_LABEL_1;
    bool m_CUSTOM_LABEL_1IsSet;
    std::shared_ptr<CatalogsProductGroupMultipleStringCriteria> m_CUSTOM_LABEL_2;
    bool m_CUSTOM_LABEL_2IsSet;
    std::shared_ptr<CatalogsProductGroupMultipleStringCriteria> m_CUSTOM_LABEL_3;
    bool m_CUSTOM_LABEL_3IsSet;
    std::shared_ptr<CatalogsProductGroupMultipleStringCriteria> m_CUSTOM_LABEL_4;
    bool m_CUSTOM_LABEL_4IsSet;
    std::shared_ptr<CatalogsProductGroupMultipleStringListCriteria> m_GOOGLE_PRODUCT_CATEGORY_6;
    bool m_GOOGLE_PRODUCT_CATEGORY_6IsSet;
    std::shared_ptr<CatalogsProductGroupMultipleStringListCriteria> m_GOOGLE_PRODUCT_CATEGORY_5;
    bool m_GOOGLE_PRODUCT_CATEGORY_5IsSet;
    std::shared_ptr<CatalogsProductGroupMultipleStringListCriteria> m_GOOGLE_PRODUCT_CATEGORY_4;
    bool m_GOOGLE_PRODUCT_CATEGORY_4IsSet;
    std::shared_ptr<CatalogsProductGroupMultipleStringListCriteria> m_GOOGLE_PRODUCT_CATEGORY_3;
    bool m_GOOGLE_PRODUCT_CATEGORY_3IsSet;
    std::shared_ptr<CatalogsProductGroupMultipleStringListCriteria> m_GOOGLE_PRODUCT_CATEGORY_2;
    bool m_GOOGLE_PRODUCT_CATEGORY_2IsSet;
    std::shared_ptr<CatalogsProductGroupMultipleStringListCriteria> m_GOOGLE_PRODUCT_CATEGORY_1;
    bool m_GOOGLE_PRODUCT_CATEGORY_1IsSet;
    std::shared_ptr<CatalogsProductGroupMultipleStringListCriteria> m_GOOGLE_PRODUCT_CATEGORY_0;
    bool m_GOOGLE_PRODUCT_CATEGORY_0IsSet;
    std::shared_ptr<CatalogsProductGroupMultipleMediaTypesCriteria> m_MEDIA_TYPE;
    bool m_MEDIA_TYPEIsSet;
};


}
}
}
}

#endif /* ORG_OPENAPITOOLS_CLIENT_MODEL_CatalogsCreativeAssetsProductGroupFilterKeys_H_ */
