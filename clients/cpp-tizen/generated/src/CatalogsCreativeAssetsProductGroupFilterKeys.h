/*
 * CatalogsCreativeAssetsProductGroupFilterKeys.h
 *
 * 
 */

#ifndef _CatalogsCreativeAssetsProductGroupFilterKeys_H_
#define _CatalogsCreativeAssetsProductGroupFilterKeys_H_


#include <string>
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
#include "MediaTypeFilter.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class CatalogsCreativeAssetsProductGroupFilterKeys : public Object {
public:
	/*! \brief Constructor.
	 */
	CatalogsCreativeAssetsProductGroupFilterKeys();
	CatalogsCreativeAssetsProductGroupFilterKeys(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CatalogsCreativeAssetsProductGroupFilterKeys();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	CatalogsProductGroupMultipleStringCriteria getCREATIVEASSETSID();

	/*! \brief Set 
	 */
	void setCREATIVEASSETSID(CatalogsProductGroupMultipleStringCriteria  cREATIVE_ASSETS_ID);
	/*! \brief Get 
	 */
	CatalogsProductGroupMultipleStringCriteria getCUSTOMLABEL0();

	/*! \brief Set 
	 */
	void setCUSTOMLABEL0(CatalogsProductGroupMultipleStringCriteria  cUSTOM_LABEL_0);
	/*! \brief Get 
	 */
	CatalogsProductGroupMultipleStringCriteria getCUSTOMLABEL1();

	/*! \brief Set 
	 */
	void setCUSTOMLABEL1(CatalogsProductGroupMultipleStringCriteria  cUSTOM_LABEL_1);
	/*! \brief Get 
	 */
	CatalogsProductGroupMultipleStringCriteria getCUSTOMLABEL2();

	/*! \brief Set 
	 */
	void setCUSTOMLABEL2(CatalogsProductGroupMultipleStringCriteria  cUSTOM_LABEL_2);
	/*! \brief Get 
	 */
	CatalogsProductGroupMultipleStringCriteria getCUSTOMLABEL3();

	/*! \brief Set 
	 */
	void setCUSTOMLABEL3(CatalogsProductGroupMultipleStringCriteria  cUSTOM_LABEL_3);
	/*! \brief Get 
	 */
	CatalogsProductGroupMultipleStringCriteria getCUSTOMLABEL4();

	/*! \brief Set 
	 */
	void setCUSTOMLABEL4(CatalogsProductGroupMultipleStringCriteria  cUSTOM_LABEL_4);
	/*! \brief Get 
	 */
	CatalogsProductGroupMultipleStringListCriteria getGOOGLEPRODUCTCATEGORY6();

	/*! \brief Set 
	 */
	void setGOOGLEPRODUCTCATEGORY6(CatalogsProductGroupMultipleStringListCriteria  gOOGLE_PRODUCT_CATEGORY_6);
	/*! \brief Get 
	 */
	CatalogsProductGroupMultipleStringListCriteria getGOOGLEPRODUCTCATEGORY5();

	/*! \brief Set 
	 */
	void setGOOGLEPRODUCTCATEGORY5(CatalogsProductGroupMultipleStringListCriteria  gOOGLE_PRODUCT_CATEGORY_5);
	/*! \brief Get 
	 */
	CatalogsProductGroupMultipleStringListCriteria getGOOGLEPRODUCTCATEGORY4();

	/*! \brief Set 
	 */
	void setGOOGLEPRODUCTCATEGORY4(CatalogsProductGroupMultipleStringListCriteria  gOOGLE_PRODUCT_CATEGORY_4);
	/*! \brief Get 
	 */
	CatalogsProductGroupMultipleStringListCriteria getGOOGLEPRODUCTCATEGORY3();

	/*! \brief Set 
	 */
	void setGOOGLEPRODUCTCATEGORY3(CatalogsProductGroupMultipleStringListCriteria  gOOGLE_PRODUCT_CATEGORY_3);
	/*! \brief Get 
	 */
	CatalogsProductGroupMultipleStringListCriteria getGOOGLEPRODUCTCATEGORY2();

	/*! \brief Set 
	 */
	void setGOOGLEPRODUCTCATEGORY2(CatalogsProductGroupMultipleStringListCriteria  gOOGLE_PRODUCT_CATEGORY_2);
	/*! \brief Get 
	 */
	CatalogsProductGroupMultipleStringListCriteria getGOOGLEPRODUCTCATEGORY1();

	/*! \brief Set 
	 */
	void setGOOGLEPRODUCTCATEGORY1(CatalogsProductGroupMultipleStringListCriteria  gOOGLE_PRODUCT_CATEGORY_1);
	/*! \brief Get 
	 */
	CatalogsProductGroupMultipleStringListCriteria getGOOGLEPRODUCTCATEGORY0();

	/*! \brief Set 
	 */
	void setGOOGLEPRODUCTCATEGORY0(CatalogsProductGroupMultipleStringListCriteria  gOOGLE_PRODUCT_CATEGORY_0);
	/*! \brief Get 
	 */
	CatalogsProductGroupMultipleMediaTypesCriteria getMEDIATYPE();

	/*! \brief Set 
	 */
	void setMEDIATYPE(CatalogsProductGroupMultipleMediaTypesCriteria  mEDIA_TYPE);

private:
	CatalogsProductGroupMultipleStringCriteria cREATIVE_ASSETS_ID;
	CatalogsProductGroupMultipleStringCriteria cUSTOM_LABEL_0;
	CatalogsProductGroupMultipleStringCriteria cUSTOM_LABEL_1;
	CatalogsProductGroupMultipleStringCriteria cUSTOM_LABEL_2;
	CatalogsProductGroupMultipleStringCriteria cUSTOM_LABEL_3;
	CatalogsProductGroupMultipleStringCriteria cUSTOM_LABEL_4;
	CatalogsProductGroupMultipleStringListCriteria gOOGLE_PRODUCT_CATEGORY_6;
	CatalogsProductGroupMultipleStringListCriteria gOOGLE_PRODUCT_CATEGORY_5;
	CatalogsProductGroupMultipleStringListCriteria gOOGLE_PRODUCT_CATEGORY_4;
	CatalogsProductGroupMultipleStringListCriteria gOOGLE_PRODUCT_CATEGORY_3;
	CatalogsProductGroupMultipleStringListCriteria gOOGLE_PRODUCT_CATEGORY_2;
	CatalogsProductGroupMultipleStringListCriteria gOOGLE_PRODUCT_CATEGORY_1;
	CatalogsProductGroupMultipleStringListCriteria gOOGLE_PRODUCT_CATEGORY_0;
	CatalogsProductGroupMultipleMediaTypesCriteria mEDIA_TYPE;
	void __init();
	void __cleanup();

};
}
}

#endif /* _CatalogsCreativeAssetsProductGroupFilterKeys_H_ */
