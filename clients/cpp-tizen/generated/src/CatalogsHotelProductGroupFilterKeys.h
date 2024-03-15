/*
 * CatalogsHotelProductGroupFilterKeys.h
 *
 * 
 */

#ifndef _CatalogsHotelProductGroupFilterKeys_H_
#define _CatalogsHotelProductGroupFilterKeys_H_


#include <string>
#include "BrandFilter.h"
#include "CatalogsProductGroupMultipleCountriesCriteria.h"
#include "CatalogsProductGroupMultipleStringCriteria.h"
#include "Catalogs_product_group_pricing_currency_criteria.h"
#include "CountryFilter.h"
#include "CustomLabel0Filter.h"
#include "CustomLabel1Filter.h"
#include "CustomLabel2Filter.h"
#include "CustomLabel3Filter.h"
#include "CustomLabel4Filter.h"
#include "HotelIdFilter.h"
#include "PriceFilter.h"
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

class CatalogsHotelProductGroupFilterKeys : public Object {
public:
	/*! \brief Constructor.
	 */
	CatalogsHotelProductGroupFilterKeys();
	CatalogsHotelProductGroupFilterKeys(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CatalogsHotelProductGroupFilterKeys();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	Catalogs_product_group_pricing_currency_criteria getPRICE();

	/*! \brief Set 
	 */
	void setPRICE(Catalogs_product_group_pricing_currency_criteria  pRICE);
	/*! \brief Get 
	 */
	CatalogsProductGroupMultipleStringCriteria getHOTELID();

	/*! \brief Set 
	 */
	void setHOTELID(CatalogsProductGroupMultipleStringCriteria  hOTEL_ID);
	/*! \brief Get 
	 */
	CatalogsProductGroupMultipleStringCriteria getBRAND();

	/*! \brief Set 
	 */
	void setBRAND(CatalogsProductGroupMultipleStringCriteria  bRAND);
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
	CatalogsProductGroupMultipleCountriesCriteria getCOUNTRY();

	/*! \brief Set 
	 */
	void setCOUNTRY(CatalogsProductGroupMultipleCountriesCriteria  cOUNTRY);

private:
	Catalogs_product_group_pricing_currency_criteria pRICE;
	CatalogsProductGroupMultipleStringCriteria hOTEL_ID;
	CatalogsProductGroupMultipleStringCriteria bRAND;
	CatalogsProductGroupMultipleStringCriteria cUSTOM_LABEL_0;
	CatalogsProductGroupMultipleStringCriteria cUSTOM_LABEL_1;
	CatalogsProductGroupMultipleStringCriteria cUSTOM_LABEL_2;
	CatalogsProductGroupMultipleStringCriteria cUSTOM_LABEL_3;
	CatalogsProductGroupMultipleStringCriteria cUSTOM_LABEL_4;
	CatalogsProductGroupMultipleCountriesCriteria cOUNTRY;
	void __init();
	void __cleanup();

};
}
}

#endif /* _CatalogsHotelProductGroupFilterKeys_H_ */
