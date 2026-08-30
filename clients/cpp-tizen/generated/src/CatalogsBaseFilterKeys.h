/*
 * CatalogsBaseFilterKeys.h
 *
 * Base filter keys shared across catalog filtering
 */

#ifndef _CatalogsBaseFilterKeys_H_
#define _CatalogsBaseFilterKeys_H_


#include <string>
#include "AvailabilityFilter.h"
#include "BrandFilter.h"
#include "CatalogsProductGroupCurrencyCriteria.h"
#include "CatalogsProductGroupFilterOperatorTypeCriteria.h"
#include "CatalogsProductGroupMultipleGenderCriteria.h"
#include "CatalogsProductGroupMultipleMediaTypesCriteria.h"
#include "CatalogsProductGroupMultiplePinterestProductCategoryCriteria.h"
#include "CatalogsProductGroupMultipleStringCriteria.h"
#include "CatalogsProductGroupMultipleStringListCriteria.h"
#include "CatalogsProductGroupPricingCriteria.h"
#include "CatalogsProductGroupUint32Criteria.h"
#include "ConditionFilter.h"
#include "CurrencyFilter.h"
#include "CustomLabel0Filter.h"
#include "CustomLabel1Filter.h"
#include "CustomLabel2Filter.h"
#include "CustomLabel3Filter.h"
#include "CustomLabel4Filter.h"
#include "CustomNumber0Filter.h"
#include "CustomNumber1Filter.h"
#include "CustomNumber2Filter.h"
#include "CustomNumber3Filter.h"
#include "CustomNumber4Filter.h"
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
#include "MediaTypeFilter.h"
#include "MinPriceFilter.h"
#include "PinterestProductCategoriesFilter.h"
#include "ProductType0Filter.h"
#include "ProductType1Filter.h"
#include "ProductType2Filter.h"
#include "ProductType3Filter.h"
#include "ProductType4Filter.h"
#include "TitleKeywordsFilter.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Base filter keys shared across catalog filtering
 *
 *  \ingroup Models
 *
 */

class CatalogsBaseFilterKeys : public Object {
public:
	/*! \brief Constructor.
	 */
	CatalogsBaseFilterKeys();
	CatalogsBaseFilterKeys(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CatalogsBaseFilterKeys();

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
	CatalogsProductGroupFilterOperatorTypeCriteria getCUSTOMLABEL0();

	/*! \brief Set 
	 */
	void setCUSTOMLABEL0(CatalogsProductGroupFilterOperatorTypeCriteria  cUSTOM_LABEL_0);
	/*! \brief Get 
	 */
	CatalogsProductGroupFilterOperatorTypeCriteria getCUSTOMLABEL1();

	/*! \brief Set 
	 */
	void setCUSTOMLABEL1(CatalogsProductGroupFilterOperatorTypeCriteria  cUSTOM_LABEL_1);
	/*! \brief Get 
	 */
	CatalogsProductGroupFilterOperatorTypeCriteria getCUSTOMLABEL2();

	/*! \brief Set 
	 */
	void setCUSTOMLABEL2(CatalogsProductGroupFilterOperatorTypeCriteria  cUSTOM_LABEL_2);
	/*! \brief Get 
	 */
	CatalogsProductGroupFilterOperatorTypeCriteria getCUSTOMLABEL3();

	/*! \brief Set 
	 */
	void setCUSTOMLABEL3(CatalogsProductGroupFilterOperatorTypeCriteria  cUSTOM_LABEL_3);
	/*! \brief Get 
	 */
	CatalogsProductGroupFilterOperatorTypeCriteria getCUSTOMLABEL4();

	/*! \brief Set 
	 */
	void setCUSTOMLABEL4(CatalogsProductGroupFilterOperatorTypeCriteria  cUSTOM_LABEL_4);
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
	CatalogsProductGroupMultipleMediaTypesCriteria getMEDIATYPE();

	/*! \brief Set 
	 */
	void setMEDIATYPE(CatalogsProductGroupMultipleMediaTypesCriteria  mEDIA_TYPE);
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
	/*! \brief Get 
	 */
	CatalogsProductGroupUint32Criteria getCUSTOMNUMBER0();

	/*! \brief Set 
	 */
	void setCUSTOMNUMBER0(CatalogsProductGroupUint32Criteria  cUSTOM_NUMBER_0);
	/*! \brief Get 
	 */
	CatalogsProductGroupUint32Criteria getCUSTOMNUMBER1();

	/*! \brief Set 
	 */
	void setCUSTOMNUMBER1(CatalogsProductGroupUint32Criteria  cUSTOM_NUMBER_1);
	/*! \brief Get 
	 */
	CatalogsProductGroupUint32Criteria getCUSTOMNUMBER2();

	/*! \brief Set 
	 */
	void setCUSTOMNUMBER2(CatalogsProductGroupUint32Criteria  cUSTOM_NUMBER_2);
	/*! \brief Get 
	 */
	CatalogsProductGroupUint32Criteria getCUSTOMNUMBER3();

	/*! \brief Set 
	 */
	void setCUSTOMNUMBER3(CatalogsProductGroupUint32Criteria  cUSTOM_NUMBER_3);
	/*! \brief Get 
	 */
	CatalogsProductGroupUint32Criteria getCUSTOMNUMBER4();

	/*! \brief Set 
	 */
	void setCUSTOMNUMBER4(CatalogsProductGroupUint32Criteria  cUSTOM_NUMBER_4);
	/*! \brief Get 
	 */
	CatalogsProductGroupMultipleStringCriteria getTITLEKEYWORDS();

	/*! \brief Set 
	 */
	void setTITLEKEYWORDS(CatalogsProductGroupMultipleStringCriteria  tITLE_KEYWORDS);
	/*! \brief Get 
	 */
	CatalogsProductGroupMultiplePinterestProductCategoryCriteria getPINTERESTPRODUCTCATEGORIES();

	/*! \brief Set 
	 */
	void setPINTERESTPRODUCTCATEGORIES(CatalogsProductGroupMultiplePinterestProductCategoryCriteria  pINTEREST_PRODUCT_CATEGORIES);

private:
	CatalogsProductGroupPricingCriteria mIN_PRICE;
	CatalogsProductGroupPricingCriteria mAX_PRICE;
	CatalogsProductGroupCurrencyCriteria cURRENCY;
	CatalogsProductGroupMultipleStringCriteria iTEM_ID;
	CatalogsProductGroupMultipleStringCriteria aVAILABILITY;
	CatalogsProductGroupMultipleStringCriteria bRAND;
	CatalogsProductGroupMultipleStringCriteria cONDITION;
	CatalogsProductGroupFilterOperatorTypeCriteria cUSTOM_LABEL_0;
	CatalogsProductGroupFilterOperatorTypeCriteria cUSTOM_LABEL_1;
	CatalogsProductGroupFilterOperatorTypeCriteria cUSTOM_LABEL_2;
	CatalogsProductGroupFilterOperatorTypeCriteria cUSTOM_LABEL_3;
	CatalogsProductGroupFilterOperatorTypeCriteria cUSTOM_LABEL_4;
	CatalogsProductGroupMultipleStringCriteria iTEM_GROUP_ID;
	CatalogsProductGroupMultipleGenderCriteria gENDER;
	CatalogsProductGroupMultipleMediaTypesCriteria mEDIA_TYPE;
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
	CatalogsProductGroupUint32Criteria cUSTOM_NUMBER_0;
	CatalogsProductGroupUint32Criteria cUSTOM_NUMBER_1;
	CatalogsProductGroupUint32Criteria cUSTOM_NUMBER_2;
	CatalogsProductGroupUint32Criteria cUSTOM_NUMBER_3;
	CatalogsProductGroupUint32Criteria cUSTOM_NUMBER_4;
	CatalogsProductGroupMultipleStringCriteria tITLE_KEYWORDS;
	CatalogsProductGroupMultiplePinterestProductCategoryCriteria pINTEREST_PRODUCT_CATEGORIES;
	void __init();
	void __cleanup();

};
}
}

#endif /* _CatalogsBaseFilterKeys_H_ */
