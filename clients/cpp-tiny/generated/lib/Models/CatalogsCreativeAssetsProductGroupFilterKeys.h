
/*
 * CatalogsCreativeAssetsProductGroupFilterKeys.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_CatalogsCreativeAssetsProductGroupFilterKeys_H_
#define TINY_CPP_CLIENT_CatalogsCreativeAssetsProductGroupFilterKeys_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "CatalogsProductGroupFilterOperatorTypeCriteria.h"
#include "CatalogsProductGroupMultipleMediaTypesCriteria.h"
#include "CatalogsProductGroupMultipleStringCriteria.h"
#include "CatalogsProductGroupMultipleStringListCriteria.h"
#include "CreativeAssetsIdFilter.h"
#include "CustomLabel0Filter.h"
#include "CustomLabel1Filter.h"
#include "CustomLabel2Filter.h"
#include "CustomLabel3Filter.h"
#include "CustomLabel4Filter.h"
#include "GoogleProductCategory0Filter.h"
#include "GoogleProductCategory1Filter.h"
#include "GoogleProductCategory2Filter.h"
#include "GoogleProductCategory3Filter.h"
#include "GoogleProductCategory4Filter.h"
#include "GoogleProductCategory5Filter.h"
#include "GoogleProductCategory6Filter.h"
#include "LinkFilter.h"
#include "MediaTypeFilter.h"
#include "TitleKeywordsFilter.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class CatalogsCreativeAssetsProductGroupFilterKeys{
public:

    /*! \brief Constructor.
	 */
    CatalogsCreativeAssetsProductGroupFilterKeys();
    CatalogsCreativeAssetsProductGroupFilterKeys(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~CatalogsCreativeAssetsProductGroupFilterKeys();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	CatalogsProductGroupMultipleStringCriteria getCREATIVEASSETSID();

	/*! \brief Set 
	 */
	void setCREATIVEASSETSID(CatalogsProductGroupMultipleStringCriteria cREATIVE_ASSETS_ID);
	/*! \brief Get 
	 */
	CatalogsProductGroupFilterOperatorTypeCriteria getCUSTOMLABEL0();

	/*! \brief Set 
	 */
	void setCUSTOMLABEL0(CatalogsProductGroupFilterOperatorTypeCriteria cUSTOM_LABEL_0);
	/*! \brief Get 
	 */
	CatalogsProductGroupFilterOperatorTypeCriteria getCUSTOMLABEL1();

	/*! \brief Set 
	 */
	void setCUSTOMLABEL1(CatalogsProductGroupFilterOperatorTypeCriteria cUSTOM_LABEL_1);
	/*! \brief Get 
	 */
	CatalogsProductGroupFilterOperatorTypeCriteria getCUSTOMLABEL2();

	/*! \brief Set 
	 */
	void setCUSTOMLABEL2(CatalogsProductGroupFilterOperatorTypeCriteria cUSTOM_LABEL_2);
	/*! \brief Get 
	 */
	CatalogsProductGroupFilterOperatorTypeCriteria getCUSTOMLABEL3();

	/*! \brief Set 
	 */
	void setCUSTOMLABEL3(CatalogsProductGroupFilterOperatorTypeCriteria cUSTOM_LABEL_3);
	/*! \brief Get 
	 */
	CatalogsProductGroupFilterOperatorTypeCriteria getCUSTOMLABEL4();

	/*! \brief Set 
	 */
	void setCUSTOMLABEL4(CatalogsProductGroupFilterOperatorTypeCriteria cUSTOM_LABEL_4);
	/*! \brief Get 
	 */
	CatalogsProductGroupMultipleStringListCriteria getGOOGLEPRODUCTCATEGORY6();

	/*! \brief Set 
	 */
	void setGOOGLEPRODUCTCATEGORY6(CatalogsProductGroupMultipleStringListCriteria gOOGLE_PRODUCT_CATEGORY_6);
	/*! \brief Get 
	 */
	CatalogsProductGroupMultipleStringListCriteria getGOOGLEPRODUCTCATEGORY5();

	/*! \brief Set 
	 */
	void setGOOGLEPRODUCTCATEGORY5(CatalogsProductGroupMultipleStringListCriteria gOOGLE_PRODUCT_CATEGORY_5);
	/*! \brief Get 
	 */
	CatalogsProductGroupMultipleStringListCriteria getGOOGLEPRODUCTCATEGORY4();

	/*! \brief Set 
	 */
	void setGOOGLEPRODUCTCATEGORY4(CatalogsProductGroupMultipleStringListCriteria gOOGLE_PRODUCT_CATEGORY_4);
	/*! \brief Get 
	 */
	CatalogsProductGroupMultipleStringListCriteria getGOOGLEPRODUCTCATEGORY3();

	/*! \brief Set 
	 */
	void setGOOGLEPRODUCTCATEGORY3(CatalogsProductGroupMultipleStringListCriteria gOOGLE_PRODUCT_CATEGORY_3);
	/*! \brief Get 
	 */
	CatalogsProductGroupMultipleStringListCriteria getGOOGLEPRODUCTCATEGORY2();

	/*! \brief Set 
	 */
	void setGOOGLEPRODUCTCATEGORY2(CatalogsProductGroupMultipleStringListCriteria gOOGLE_PRODUCT_CATEGORY_2);
	/*! \brief Get 
	 */
	CatalogsProductGroupMultipleStringListCriteria getGOOGLEPRODUCTCATEGORY1();

	/*! \brief Set 
	 */
	void setGOOGLEPRODUCTCATEGORY1(CatalogsProductGroupMultipleStringListCriteria gOOGLE_PRODUCT_CATEGORY_1);
	/*! \brief Get 
	 */
	CatalogsProductGroupMultipleStringListCriteria getGOOGLEPRODUCTCATEGORY0();

	/*! \brief Set 
	 */
	void setGOOGLEPRODUCTCATEGORY0(CatalogsProductGroupMultipleStringListCriteria gOOGLE_PRODUCT_CATEGORY_0);
	/*! \brief Get 
	 */
	CatalogsProductGroupMultipleMediaTypesCriteria getMEDIATYPE();

	/*! \brief Set 
	 */
	void setMEDIATYPE(CatalogsProductGroupMultipleMediaTypesCriteria mEDIA_TYPE);
	/*! \brief Get 
	 */
	CatalogsProductGroupMultipleStringCriteria getTITLEKEYWORDS();

	/*! \brief Set 
	 */
	void setTITLEKEYWORDS(CatalogsProductGroupMultipleStringCriteria tITLE_KEYWORDS);
	/*! \brief Get 
	 */
	CatalogsProductGroupFilterOperatorTypeCriteria getLINK();

	/*! \brief Set 
	 */
	void setLINK(CatalogsProductGroupFilterOperatorTypeCriteria lINK);


    private:
    CatalogsProductGroupMultipleStringCriteria cREATIVE_ASSETS_ID;
    CatalogsProductGroupFilterOperatorTypeCriteria cUSTOM_LABEL_0;
    CatalogsProductGroupFilterOperatorTypeCriteria cUSTOM_LABEL_1;
    CatalogsProductGroupFilterOperatorTypeCriteria cUSTOM_LABEL_2;
    CatalogsProductGroupFilterOperatorTypeCriteria cUSTOM_LABEL_3;
    CatalogsProductGroupFilterOperatorTypeCriteria cUSTOM_LABEL_4;
    CatalogsProductGroupMultipleStringListCriteria gOOGLE_PRODUCT_CATEGORY_6;
    CatalogsProductGroupMultipleStringListCriteria gOOGLE_PRODUCT_CATEGORY_5;
    CatalogsProductGroupMultipleStringListCriteria gOOGLE_PRODUCT_CATEGORY_4;
    CatalogsProductGroupMultipleStringListCriteria gOOGLE_PRODUCT_CATEGORY_3;
    CatalogsProductGroupMultipleStringListCriteria gOOGLE_PRODUCT_CATEGORY_2;
    CatalogsProductGroupMultipleStringListCriteria gOOGLE_PRODUCT_CATEGORY_1;
    CatalogsProductGroupMultipleStringListCriteria gOOGLE_PRODUCT_CATEGORY_0;
    CatalogsProductGroupMultipleMediaTypesCriteria mEDIA_TYPE;
    CatalogsProductGroupMultipleStringCriteria tITLE_KEYWORDS;
    CatalogsProductGroupFilterOperatorTypeCriteria lINK;
};
}

#endif /* TINY_CPP_CLIENT_CatalogsCreativeAssetsProductGroupFilterKeys_H_ */
