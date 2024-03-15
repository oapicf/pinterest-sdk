/*
 * CatalogsProductGroupFilterKeys.h
 *
 * 
 */

#ifndef _CatalogsProductGroupFilterKeys_H_
#define _CatalogsProductGroupFilterKeys_H_


#include <string>
#include "AvailabilityFilter.h"
#include "BrandFilter.h"
#include "CatalogsProductGroupCurrencyCriteria.h"
#include "CatalogsProductGroupMultipleGenderCriteria.h"
#include "CatalogsProductGroupMultipleStringCriteria.h"
#include "CatalogsProductGroupMultipleStringListCriteria.h"
#include "CatalogsProductGroupPricingCriteria.h"
#include "ConditionFilter.h"
#include "CurrencyFilter.h"
#include "CustomLabel0Filter.h"
#include "CustomLabel1Filter.h"
#include "CustomLabel2Filter.h"
#include "CustomLabel3Filter.h"
#include "CustomLabel4Filter.h"
#include "GenderFilter.h"
#include "GoogleProductCategory0Filter.h"
#include "GoogleProductCategory1Filter.h"
#include "GoogleProductCategory2Filter.h"
#include "GoogleProductCategory3Filter.h"
#include "GoogleProductCategory4Filter.h"
#include "GoogleProductCategory5Filter.h"
#include "GoogleProductCategory6Filter.h"
#include "ItemGroupIdFilter.h"
#include "ItemIdFilter.h"
#include "MaxPriceFilter.h"
#include "MinPriceFilter.h"
#include "ProductType0Filter.h"
#include "ProductType1Filter.h"
#include "ProductType2Filter.h"
#include "ProductType3Filter.h"
#include "ProductType4Filter.h"
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

class CatalogsProductGroupFilterKeys : public Object {
public:
	/*! \brief Constructor.
	 */
	CatalogsProductGroupFilterKeys();
	CatalogsProductGroupFilterKeys(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CatalogsProductGroupFilterKeys();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	CatalogsProductGroupPricingCriteria getMINPRICE();

	/*! \brief Set 
	 */
	void setMINPRICE(CatalogsProductGroupPricingCriteria  mIN_PRICE);
	/*! \brief Get 
	 */
	CatalogsProductGroupPricingCriteria getMAXPRICE();

	/*! \brief Set 
	 */
	void setMAXPRICE(CatalogsProductGroupPricingCriteria  mAX_PRICE);
	/*! \brief Get 
	 */
	CatalogsProductGroupCurrencyCriteria getCURRENCY();

	/*! \brief Set 
	 */
	void setCURRENCY(CatalogsProductGroupCurrencyCriteria  cURRENCY);
	/*! \brief Get 
	 */
	CatalogsProductGroupMultipleStringCriteria getITEMID();

	/*! \brief Set 
	 */
	void setITEMID(CatalogsProductGroupMultipleStringCriteria  iTEM_ID);
	/*! \brief Get 
	 */
	CatalogsProductGroupMultipleStringCriteria getAVAILABILITY();

	/*! \brief Set 
	 */
	void setAVAILABILITY(CatalogsProductGroupMultipleStringCriteria  aVAILABILITY);
	/*! \brief Get 
	 */
	CatalogsProductGroupMultipleStringCriteria getBRAND();

	/*! \brief Set 
	 */
	void setBRAND(CatalogsProductGroupMultipleStringCriteria  bRAND);
	/*! \brief Get 
	 */
	CatalogsProductGroupMultipleStringCriteria getCONDITION();

	/*! \brief Set 
	 */
	void setCONDITION(CatalogsProductGroupMultipleStringCriteria  cONDITION);
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
	CatalogsProductGroupMultipleStringCriteria getITEMGROUPID();

	/*! \brief Set 
	 */
	void setITEMGROUPID(CatalogsProductGroupMultipleStringCriteria  iTEM_GROUP_ID);
	/*! \brief Get 
	 */
	CatalogsProductGroupMultipleGenderCriteria getGENDER();

	/*! \brief Set 
	 */
	void setGENDER(CatalogsProductGroupMultipleGenderCriteria  gENDER);
	/*! \brief Get 
	 */
	CatalogsProductGroupMultipleStringListCriteria getPRODUCTTYPE4();

	/*! \brief Set 
	 */
	void setPRODUCTTYPE4(CatalogsProductGroupMultipleStringListCriteria  pRODUCT_TYPE_4);
	/*! \brief Get 
	 */
	CatalogsProductGroupMultipleStringListCriteria getPRODUCTTYPE3();

	/*! \brief Set 
	 */
	void setPRODUCTTYPE3(CatalogsProductGroupMultipleStringListCriteria  pRODUCT_TYPE_3);
	/*! \brief Get 
	 */
	CatalogsProductGroupMultipleStringListCriteria getPRODUCTTYPE2();

	/*! \brief Set 
	 */
	void setPRODUCTTYPE2(CatalogsProductGroupMultipleStringListCriteria  pRODUCT_TYPE_2);
	/*! \brief Get 
	 */
	CatalogsProductGroupMultipleStringListCriteria getPRODUCTTYPE1();

	/*! \brief Set 
	 */
	void setPRODUCTTYPE1(CatalogsProductGroupMultipleStringListCriteria  pRODUCT_TYPE_1);
	/*! \brief Get 
	 */
	CatalogsProductGroupMultipleStringListCriteria getPRODUCTTYPE0();

	/*! \brief Set 
	 */
	void setPRODUCTTYPE0(CatalogsProductGroupMultipleStringListCriteria  pRODUCT_TYPE_0);
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

private:
	CatalogsProductGroupPricingCriteria mIN_PRICE;
	CatalogsProductGroupPricingCriteria mAX_PRICE;
	CatalogsProductGroupCurrencyCriteria cURRENCY;
	CatalogsProductGroupMultipleStringCriteria iTEM_ID;
	CatalogsProductGroupMultipleStringCriteria aVAILABILITY;
	CatalogsProductGroupMultipleStringCriteria bRAND;
	CatalogsProductGroupMultipleStringCriteria cONDITION;
	CatalogsProductGroupMultipleStringCriteria cUSTOM_LABEL_0;
	CatalogsProductGroupMultipleStringCriteria cUSTOM_LABEL_1;
	CatalogsProductGroupMultipleStringCriteria cUSTOM_LABEL_2;
	CatalogsProductGroupMultipleStringCriteria cUSTOM_LABEL_3;
	CatalogsProductGroupMultipleStringCriteria cUSTOM_LABEL_4;
	CatalogsProductGroupMultipleStringCriteria iTEM_GROUP_ID;
	CatalogsProductGroupMultipleGenderCriteria gENDER;
	CatalogsProductGroupMultipleStringListCriteria pRODUCT_TYPE_4;
	CatalogsProductGroupMultipleStringListCriteria pRODUCT_TYPE_3;
	CatalogsProductGroupMultipleStringListCriteria pRODUCT_TYPE_2;
	CatalogsProductGroupMultipleStringListCriteria pRODUCT_TYPE_1;
	CatalogsProductGroupMultipleStringListCriteria pRODUCT_TYPE_0;
	CatalogsProductGroupMultipleStringListCriteria gOOGLE_PRODUCT_CATEGORY_6;
	CatalogsProductGroupMultipleStringListCriteria gOOGLE_PRODUCT_CATEGORY_5;
	CatalogsProductGroupMultipleStringListCriteria gOOGLE_PRODUCT_CATEGORY_4;
	CatalogsProductGroupMultipleStringListCriteria gOOGLE_PRODUCT_CATEGORY_3;
	CatalogsProductGroupMultipleStringListCriteria gOOGLE_PRODUCT_CATEGORY_2;
	CatalogsProductGroupMultipleStringListCriteria gOOGLE_PRODUCT_CATEGORY_1;
	CatalogsProductGroupMultipleStringListCriteria gOOGLE_PRODUCT_CATEGORY_0;
	void __init();
	void __cleanup();

};
}
}

#endif /* _CatalogsProductGroupFilterKeys_H_ */
