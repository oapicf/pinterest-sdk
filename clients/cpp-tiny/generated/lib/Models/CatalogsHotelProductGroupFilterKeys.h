
/*
 * CatalogsHotelProductGroupFilterKeys.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_CatalogsHotelProductGroupFilterKeys_H_
#define TINY_CPP_CLIENT_CatalogsHotelProductGroupFilterKeys_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "BrandFilter.h"
#include "CatalogsProductGroupFilterOperatorTypeCriteria.h"
#include "CatalogsProductGroupMultipleCountriesCriteria.h"
#include "CatalogsProductGroupMultipleStringCriteria.h"
#include "CountryFilter.h"
#include "CustomLabel0Filter.h"
#include "CustomLabel1Filter.h"
#include "CustomLabel2Filter.h"
#include "CustomLabel3Filter.h"
#include "CustomLabel4Filter.h"
#include "HotelIdFilter.h"
#include "PriceFilter.h"
#include "PriceFilterPrice.h"
#include "TitleKeywordsFilter.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class CatalogsHotelProductGroupFilterKeys{
public:

    /*! \brief Constructor.
	 */
    CatalogsHotelProductGroupFilterKeys();
    CatalogsHotelProductGroupFilterKeys(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~CatalogsHotelProductGroupFilterKeys();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	PriceFilterPrice getPRICE();

	/*! \brief Set 
	 */
	void setPRICE(PriceFilterPrice pRICE);
	/*! \brief Get 
	 */
	CatalogsProductGroupMultipleStringCriteria getHOTELID();

	/*! \brief Set 
	 */
	void setHOTELID(CatalogsProductGroupMultipleStringCriteria hOTEL_ID);
	/*! \brief Get 
	 */
	CatalogsProductGroupMultipleStringCriteria getBRAND();

	/*! \brief Set 
	 */
	void setBRAND(CatalogsProductGroupMultipleStringCriteria bRAND);
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
	CatalogsProductGroupMultipleCountriesCriteria getCOUNTRY();

	/*! \brief Set 
	 */
	void setCOUNTRY(CatalogsProductGroupMultipleCountriesCriteria cOUNTRY);
	/*! \brief Get 
	 */
	CatalogsProductGroupMultipleStringCriteria getTITLEKEYWORDS();

	/*! \brief Set 
	 */
	void setTITLEKEYWORDS(CatalogsProductGroupMultipleStringCriteria tITLE_KEYWORDS);


    private:
    PriceFilterPrice pRICE;
    CatalogsProductGroupMultipleStringCriteria hOTEL_ID;
    CatalogsProductGroupMultipleStringCriteria bRAND;
    CatalogsProductGroupFilterOperatorTypeCriteria cUSTOM_LABEL_0;
    CatalogsProductGroupFilterOperatorTypeCriteria cUSTOM_LABEL_1;
    CatalogsProductGroupFilterOperatorTypeCriteria cUSTOM_LABEL_2;
    CatalogsProductGroupFilterOperatorTypeCriteria cUSTOM_LABEL_3;
    CatalogsProductGroupFilterOperatorTypeCriteria cUSTOM_LABEL_4;
    CatalogsProductGroupMultipleCountriesCriteria cOUNTRY;
    CatalogsProductGroupMultipleStringCriteria tITLE_KEYWORDS;
};
}

#endif /* TINY_CPP_CLIENT_CatalogsHotelProductGroupFilterKeys_H_ */
