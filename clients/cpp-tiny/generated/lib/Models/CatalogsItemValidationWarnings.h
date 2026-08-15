
/*
 * CatalogsItemValidationWarnings.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_CatalogsItemValidationWarnings_H_
#define TINY_CPP_CLIENT_CatalogsItemValidationWarnings_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "CatalogsItemValidationDetails.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class CatalogsItemValidationWarnings{
public:

    /*! \brief Constructor.
	 */
    CatalogsItemValidationWarnings();
    CatalogsItemValidationWarnings(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~CatalogsItemValidationWarnings();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	CatalogsItemValidationDetails getADIMAGE0LINKDUPLICATED();

	/*! \brief Set 
	 */
	void setADIMAGE0LINKDUPLICATED(CatalogsItemValidationDetails  aD_IMAGE_0_LINK_DUPLICATED);
	/*! \brief Get 
	 */
	CatalogsItemValidationDetails getADIMAGE0LINKLENGTHTOOLONG();

	/*! \brief Set 
	 */
	void setADIMAGE0LINKLENGTHTOOLONG(CatalogsItemValidationDetails  aD_IMAGE_0_LINK_LENGTH_TOO_LONG);
	/*! \brief Get 
	 */
	CatalogsItemValidationDetails getADIMAGE0LINKREQUIRED();

	/*! \brief Set 
	 */
	void setADIMAGE0LINKREQUIRED(CatalogsItemValidationDetails  aD_IMAGE_0_LINK_REQUIRED);
	/*! \brief Get 
	 */
	CatalogsItemValidationDetails getADIMAGE0LINKWARNING();

	/*! \brief Set 
	 */
	void setADIMAGE0LINKWARNING(CatalogsItemValidationDetails  aD_IMAGE_0_LINK_WARNING);
	/*! \brief Get 
	 */
	CatalogsItemValidationDetails getADIMAGE0TAGDUPLICATED();

	/*! \brief Set 
	 */
	void setADIMAGE0TAGDUPLICATED(CatalogsItemValidationDetails  aD_IMAGE_0_TAG_DUPLICATED);
	/*! \brief Get 
	 */
	CatalogsItemValidationDetails getADIMAGE0TAGLENGTHTOOLONG();

	/*! \brief Set 
	 */
	void setADIMAGE0TAGLENGTHTOOLONG(CatalogsItemValidationDetails  aD_IMAGE_0_TAG_LENGTH_TOO_LONG);
	/*! \brief Get 
	 */
	CatalogsItemValidationDetails getADIMAGE0TAGREQUIRED();

	/*! \brief Set 
	 */
	void setADIMAGE0TAGREQUIRED(CatalogsItemValidationDetails  aD_IMAGE_0_TAG_REQUIRED);
	/*! \brief Get 
	 */
	CatalogsItemValidationDetails getADIMAGE10LINKDUPLICATED();

	/*! \brief Set 
	 */
	void setADIMAGE10LINKDUPLICATED(CatalogsItemValidationDetails  aD_IMAGE_10_LINK_DUPLICATED);
	/*! \brief Get 
	 */
	CatalogsItemValidationDetails getADIMAGE10LINKLENGTHTOOLONG();

	/*! \brief Set 
	 */
	void setADIMAGE10LINKLENGTHTOOLONG(CatalogsItemValidationDetails  aD_IMAGE_10_LINK_LENGTH_TOO_LONG);
	/*! \brief Get 
	 */
	CatalogsItemValidationDetails getADIMAGE10LINKREQUIRED();

	/*! \brief Set 
	 */
	void setADIMAGE10LINKREQUIRED(CatalogsItemValidationDetails  aD_IMAGE_10_LINK_REQUIRED);
	/*! \brief Get 
	 */
	CatalogsItemValidationDetails getADIMAGE10LINKWARNING();

	/*! \brief Set 
	 */
	void setADIMAGE10LINKWARNING(CatalogsItemValidationDetails  aD_IMAGE_10_LINK_WARNING);
	/*! \brief Get 
	 */
	CatalogsItemValidationDetails getADIMAGE10TAGDUPLICATED();

	/*! \brief Set 
	 */
	void setADIMAGE10TAGDUPLICATED(CatalogsItemValidationDetails  aD_IMAGE_10_TAG_DUPLICATED);
	/*! \brief Get 
	 */
	CatalogsItemValidationDetails getADIMAGE10TAGLENGTHTOOLONG();

	/*! \brief Set 
	 */
	void setADIMAGE10TAGLENGTHTOOLONG(CatalogsItemValidationDetails  aD_IMAGE_10_TAG_LENGTH_TOO_LONG);
	/*! \brief Get 
	 */
	CatalogsItemValidationDetails getADIMAGE10TAGREQUIRED();

	/*! \brief Set 
	 */
	void setADIMAGE10TAGREQUIRED(CatalogsItemValidationDetails  aD_IMAGE_10_TAG_REQUIRED);
	/*! \brief Get 
	 */
	CatalogsItemValidationDetails getADIMAGE11LINKDUPLICATED();

	/*! \brief Set 
	 */
	void setADIMAGE11LINKDUPLICATED(CatalogsItemValidationDetails  aD_IMAGE_11_LINK_DUPLICATED);
	/*! \brief Get 
	 */
	CatalogsItemValidationDetails getADIMAGE11LINKLENGTHTOOLONG();

	/*! \brief Set 
	 */
	void setADIMAGE11LINKLENGTHTOOLONG(CatalogsItemValidationDetails  aD_IMAGE_11_LINK_LENGTH_TOO_LONG);
	/*! \brief Get 
	 */
	CatalogsItemValidationDetails getADIMAGE11LINKREQUIRED();

	/*! \brief Set 
	 */
	void setADIMAGE11LINKREQUIRED(CatalogsItemValidationDetails  aD_IMAGE_11_LINK_REQUIRED);
	/*! \brief Get 
	 */
	CatalogsItemValidationDetails getADIMAGE11LINKWARNING();

	/*! \brief Set 
	 */
	void setADIMAGE11LINKWARNING(CatalogsItemValidationDetails  aD_IMAGE_11_LINK_WARNING);
	/*! \brief Get 
	 */
	CatalogsItemValidationDetails getADIMAGE11TAGDUPLICATED();

	/*! \brief Set 
	 */
	void setADIMAGE11TAGDUPLICATED(CatalogsItemValidationDetails  aD_IMAGE_11_TAG_DUPLICATED);
	/*! \brief Get 
	 */
	CatalogsItemValidationDetails getADIMAGE11TAGLENGTHTOOLONG();

	/*! \brief Set 
	 */
	void setADIMAGE11TAGLENGTHTOOLONG(CatalogsItemValidationDetails  aD_IMAGE_11_TAG_LENGTH_TOO_LONG);
	/*! \brief Get 
	 */
	CatalogsItemValidationDetails getADIMAGE11TAGREQUIRED();

	/*! \brief Set 
	 */
	void setADIMAGE11TAGREQUIRED(CatalogsItemValidationDetails  aD_IMAGE_11_TAG_REQUIRED);
	/*! \brief Get 
	 */
	CatalogsItemValidationDetails getADIMAGE12LINKDUPLICATED();

	/*! \brief Set 
	 */
	void setADIMAGE12LINKDUPLICATED(CatalogsItemValidationDetails  aD_IMAGE_12_LINK_DUPLICATED);
	/*! \brief Get 
	 */
	CatalogsItemValidationDetails getADIMAGE12LINKLENGTHTOOLONG();

	/*! \brief Set 
	 */
	void setADIMAGE12LINKLENGTHTOOLONG(CatalogsItemValidationDetails  aD_IMAGE_12_LINK_LENGTH_TOO_LONG);
	/*! \brief Get 
	 */
	CatalogsItemValidationDetails getADIMAGE12LINKREQUIRED();

	/*! \brief Set 
	 */
	void setADIMAGE12LINKREQUIRED(CatalogsItemValidationDetails  aD_IMAGE_12_LINK_REQUIRED);
	/*! \brief Get 
	 */
	CatalogsItemValidationDetails getADIMAGE12LINKWARNING();

	/*! \brief Set 
	 */
	void setADIMAGE12LINKWARNING(CatalogsItemValidationDetails  aD_IMAGE_12_LINK_WARNING);
	/*! \brief Get 
	 */
	CatalogsItemValidationDetails getADIMAGE12TAGDUPLICATED();

	/*! \brief Set 
	 */
	void setADIMAGE12TAGDUPLICATED(CatalogsItemValidationDetails  aD_IMAGE_12_TAG_DUPLICATED);
	/*! \brief Get 
	 */
	CatalogsItemValidationDetails getADIMAGE12TAGLENGTHTOOLONG();

	/*! \brief Set 
	 */
	void setADIMAGE12TAGLENGTHTOOLONG(CatalogsItemValidationDetails  aD_IMAGE_12_TAG_LENGTH_TOO_LONG);
	/*! \brief Get 
	 */
	CatalogsItemValidationDetails getADIMAGE12TAGREQUIRED();

	/*! \brief Set 
	 */
	void setADIMAGE12TAGREQUIRED(CatalogsItemValidationDetails  aD_IMAGE_12_TAG_REQUIRED);
	/*! \brief Get 
	 */
	CatalogsItemValidationDetails getADIMAGE13LINKDUPLICATED();

	/*! \brief Set 
	 */
	void setADIMAGE13LINKDUPLICATED(CatalogsItemValidationDetails  aD_IMAGE_13_LINK_DUPLICATED);
	/*! \brief Get 
	 */
	CatalogsItemValidationDetails getADIMAGE13LINKLENGTHTOOLONG();

	/*! \brief Set 
	 */
	void setADIMAGE13LINKLENGTHTOOLONG(CatalogsItemValidationDetails  aD_IMAGE_13_LINK_LENGTH_TOO_LONG);
	/*! \brief Get 
	 */
	CatalogsItemValidationDetails getADIMAGE13LINKREQUIRED();

	/*! \brief Set 
	 */
	void setADIMAGE13LINKREQUIRED(CatalogsItemValidationDetails  aD_IMAGE_13_LINK_REQUIRED);
	/*! \brief Get 
	 */
	CatalogsItemValidationDetails getADIMAGE13LINKWARNING();

	/*! \brief Set 
	 */
	void setADIMAGE13LINKWARNING(CatalogsItemValidationDetails  aD_IMAGE_13_LINK_WARNING);
	/*! \brief Get 
	 */
	CatalogsItemValidationDetails getADIMAGE13TAGDUPLICATED();

	/*! \brief Set 
	 */
	void setADIMAGE13TAGDUPLICATED(CatalogsItemValidationDetails  aD_IMAGE_13_TAG_DUPLICATED);
	/*! \brief Get 
	 */
	CatalogsItemValidationDetails getADIMAGE13TAGLENGTHTOOLONG();

	/*! \brief Set 
	 */
	void setADIMAGE13TAGLENGTHTOOLONG(CatalogsItemValidationDetails  aD_IMAGE_13_TAG_LENGTH_TOO_LONG);
	/*! \brief Get 
	 */
	CatalogsItemValidationDetails getADIMAGE13TAGREQUIRED();

	/*! \brief Set 
	 */
	void setADIMAGE13TAGREQUIRED(CatalogsItemValidationDetails  aD_IMAGE_13_TAG_REQUIRED);
	/*! \brief Get 
	 */
	CatalogsItemValidationDetails getADIMAGE14LINKDUPLICATED();

	/*! \brief Set 
	 */
	void setADIMAGE14LINKDUPLICATED(CatalogsItemValidationDetails  aD_IMAGE_14_LINK_DUPLICATED);
	/*! \brief Get 
	 */
	CatalogsItemValidationDetails getADIMAGE14LINKLENGTHTOOLONG();

	/*! \brief Set 
	 */
	void setADIMAGE14LINKLENGTHTOOLONG(CatalogsItemValidationDetails  aD_IMAGE_14_LINK_LENGTH_TOO_LONG);
	/*! \brief Get 
	 */
	CatalogsItemValidationDetails getADIMAGE14LINKREQUIRED();

	/*! \brief Set 
	 */
	void setADIMAGE14LINKREQUIRED(CatalogsItemValidationDetails  aD_IMAGE_14_LINK_REQUIRED);
	/*! \brief Get 
	 */
	CatalogsItemValidationDetails getADIMAGE14LINKWARNING();

	/*! \brief Set 
	 */
	void setADIMAGE14LINKWARNING(CatalogsItemValidationDetails  aD_IMAGE_14_LINK_WARNING);
	/*! \brief Get 
	 */
	CatalogsItemValidationDetails getADIMAGE14TAGDUPLICATED();

	/*! \brief Set 
	 */
	void setADIMAGE14TAGDUPLICATED(CatalogsItemValidationDetails  aD_IMAGE_14_TAG_DUPLICATED);
	/*! \brief Get 
	 */
	CatalogsItemValidationDetails getADIMAGE14TAGLENGTHTOOLONG();

	/*! \brief Set 
	 */
	void setADIMAGE14TAGLENGTHTOOLONG(CatalogsItemValidationDetails  aD_IMAGE_14_TAG_LENGTH_TOO_LONG);
	/*! \brief Get 
	 */
	CatalogsItemValidationDetails getADIMAGE14TAGREQUIRED();

	/*! \brief Set 
	 */
	void setADIMAGE14TAGREQUIRED(CatalogsItemValidationDetails  aD_IMAGE_14_TAG_REQUIRED);
	/*! \brief Get 
	 */
	CatalogsItemValidationDetails getADIMAGE15LINKDUPLICATED();

	/*! \brief Set 
	 */
	void setADIMAGE15LINKDUPLICATED(CatalogsItemValidationDetails  aD_IMAGE_15_LINK_DUPLICATED);
	/*! \brief Get 
	 */
	CatalogsItemValidationDetails getADIMAGE15LINKLENGTHTOOLONG();

	/*! \brief Set 
	 */
	void setADIMAGE15LINKLENGTHTOOLONG(CatalogsItemValidationDetails  aD_IMAGE_15_LINK_LENGTH_TOO_LONG);
	/*! \brief Get 
	 */
	CatalogsItemValidationDetails getADIMAGE15LINKREQUIRED();

	/*! \brief Set 
	 */
	void setADIMAGE15LINKREQUIRED(CatalogsItemValidationDetails  aD_IMAGE_15_LINK_REQUIRED);
	/*! \brief Get 
	 */
	CatalogsItemValidationDetails getADIMAGE15LINKWARNING();

	/*! \brief Set 
	 */
	void setADIMAGE15LINKWARNING(CatalogsItemValidationDetails  aD_IMAGE_15_LINK_WARNING);
	/*! \brief Get 
	 */
	CatalogsItemValidationDetails getADIMAGE15TAGDUPLICATED();

	/*! \brief Set 
	 */
	void setADIMAGE15TAGDUPLICATED(CatalogsItemValidationDetails  aD_IMAGE_15_TAG_DUPLICATED);
	/*! \brief Get 
	 */
	CatalogsItemValidationDetails getADIMAGE15TAGLENGTHTOOLONG();

	/*! \brief Set 
	 */
	void setADIMAGE15TAGLENGTHTOOLONG(CatalogsItemValidationDetails  aD_IMAGE_15_TAG_LENGTH_TOO_LONG);
	/*! \brief Get 
	 */
	CatalogsItemValidationDetails getADIMAGE15TAGREQUIRED();

	/*! \brief Set 
	 */
	void setADIMAGE15TAGREQUIRED(CatalogsItemValidationDetails  aD_IMAGE_15_TAG_REQUIRED);
	/*! \brief Get 
	 */
	CatalogsItemValidationDetails getADIMAGE16LINKDUPLICATED();

	/*! \brief Set 
	 */
	void setADIMAGE16LINKDUPLICATED(CatalogsItemValidationDetails  aD_IMAGE_16_LINK_DUPLICATED);
	/*! \brief Get 
	 */
	CatalogsItemValidationDetails getADIMAGE16LINKLENGTHTOOLONG();

	/*! \brief Set 
	 */
	void setADIMAGE16LINKLENGTHTOOLONG(CatalogsItemValidationDetails  aD_IMAGE_16_LINK_LENGTH_TOO_LONG);
	/*! \brief Get 
	 */
	CatalogsItemValidationDetails getADIMAGE16LINKREQUIRED();

	/*! \brief Set 
	 */
	void setADIMAGE16LINKREQUIRED(CatalogsItemValidationDetails  aD_IMAGE_16_LINK_REQUIRED);
	/*! \brief Get 
	 */
	CatalogsItemValidationDetails getADIMAGE16LINKWARNING();

	/*! \brief Set 
	 */
	void setADIMAGE16LINKWARNING(CatalogsItemValidationDetails  aD_IMAGE_16_LINK_WARNING);
	/*! \brief Get 
	 */
	CatalogsItemValidationDetails getADIMAGE16TAGDUPLICATED();

	/*! \brief Set 
	 */
	void setADIMAGE16TAGDUPLICATED(CatalogsItemValidationDetails  aD_IMAGE_16_TAG_DUPLICATED);
	/*! \brief Get 
	 */
	CatalogsItemValidationDetails getADIMAGE16TAGLENGTHTOOLONG();

	/*! \brief Set 
	 */
	void setADIMAGE16TAGLENGTHTOOLONG(CatalogsItemValidationDetails  aD_IMAGE_16_TAG_LENGTH_TOO_LONG);
	/*! \brief Get 
	 */
	CatalogsItemValidationDetails getADIMAGE16TAGREQUIRED();

	/*! \brief Set 
	 */
	void setADIMAGE16TAGREQUIRED(CatalogsItemValidationDetails  aD_IMAGE_16_TAG_REQUIRED);
	/*! \brief Get 
	 */
	CatalogsItemValidationDetails getADIMAGE17LINKDUPLICATED();

	/*! \brief Set 
	 */
	void setADIMAGE17LINKDUPLICATED(CatalogsItemValidationDetails  aD_IMAGE_17_LINK_DUPLICATED);
	/*! \brief Get 
	 */
	CatalogsItemValidationDetails getADIMAGE17LINKLENGTHTOOLONG();

	/*! \brief Set 
	 */
	void setADIMAGE17LINKLENGTHTOOLONG(CatalogsItemValidationDetails  aD_IMAGE_17_LINK_LENGTH_TOO_LONG);
	/*! \brief Get 
	 */
	CatalogsItemValidationDetails getADIMAGE17LINKREQUIRED();

	/*! \brief Set 
	 */
	void setADIMAGE17LINKREQUIRED(CatalogsItemValidationDetails  aD_IMAGE_17_LINK_REQUIRED);
	/*! \brief Get 
	 */
	CatalogsItemValidationDetails getADIMAGE17LINKWARNING();

	/*! \brief Set 
	 */
	void setADIMAGE17LINKWARNING(CatalogsItemValidationDetails  aD_IMAGE_17_LINK_WARNING);
	/*! \brief Get 
	 */
	CatalogsItemValidationDetails getADIMAGE17TAGDUPLICATED();

	/*! \brief Set 
	 */
	void setADIMAGE17TAGDUPLICATED(CatalogsItemValidationDetails  aD_IMAGE_17_TAG_DUPLICATED);
	/*! \brief Get 
	 */
	CatalogsItemValidationDetails getADIMAGE17TAGLENGTHTOOLONG();

	/*! \brief Set 
	 */
	void setADIMAGE17TAGLENGTHTOOLONG(CatalogsItemValidationDetails  aD_IMAGE_17_TAG_LENGTH_TOO_LONG);
	/*! \brief Get 
	 */
	CatalogsItemValidationDetails getADIMAGE17TAGREQUIRED();

	/*! \brief Set 
	 */
	void setADIMAGE17TAGREQUIRED(CatalogsItemValidationDetails  aD_IMAGE_17_TAG_REQUIRED);
	/*! \brief Get 
	 */
	CatalogsItemValidationDetails getADIMAGE18LINKDUPLICATED();

	/*! \brief Set 
	 */
	void setADIMAGE18LINKDUPLICATED(CatalogsItemValidationDetails  aD_IMAGE_18_LINK_DUPLICATED);
	/*! \brief Get 
	 */
	CatalogsItemValidationDetails getADIMAGE18LINKLENGTHTOOLONG();

	/*! \brief Set 
	 */
	void setADIMAGE18LINKLENGTHTOOLONG(CatalogsItemValidationDetails  aD_IMAGE_18_LINK_LENGTH_TOO_LONG);
	/*! \brief Get 
	 */
	CatalogsItemValidationDetails getADIMAGE18LINKREQUIRED();

	/*! \brief Set 
	 */
	void setADIMAGE18LINKREQUIRED(CatalogsItemValidationDetails  aD_IMAGE_18_LINK_REQUIRED);
	/*! \brief Get 
	 */
	CatalogsItemValidationDetails getADIMAGE18LINKWARNING();

	/*! \brief Set 
	 */
	void setADIMAGE18LINKWARNING(CatalogsItemValidationDetails  aD_IMAGE_18_LINK_WARNING);
	/*! \brief Get 
	 */
	CatalogsItemValidationDetails getADIMAGE18TAGDUPLICATED();

	/*! \brief Set 
	 */
	void setADIMAGE18TAGDUPLICATED(CatalogsItemValidationDetails  aD_IMAGE_18_TAG_DUPLICATED);
	/*! \brief Get 
	 */
	CatalogsItemValidationDetails getADIMAGE18TAGLENGTHTOOLONG();

	/*! \brief Set 
	 */
	void setADIMAGE18TAGLENGTHTOOLONG(CatalogsItemValidationDetails  aD_IMAGE_18_TAG_LENGTH_TOO_LONG);
	/*! \brief Get 
	 */
	CatalogsItemValidationDetails getADIMAGE18TAGREQUIRED();

	/*! \brief Set 
	 */
	void setADIMAGE18TAGREQUIRED(CatalogsItemValidationDetails  aD_IMAGE_18_TAG_REQUIRED);
	/*! \brief Get 
	 */
	CatalogsItemValidationDetails getADIMAGE19LINKDUPLICATED();

	/*! \brief Set 
	 */
	void setADIMAGE19LINKDUPLICATED(CatalogsItemValidationDetails  aD_IMAGE_19_LINK_DUPLICATED);
	/*! \brief Get 
	 */
	CatalogsItemValidationDetails getADIMAGE19LINKLENGTHTOOLONG();

	/*! \brief Set 
	 */
	void setADIMAGE19LINKLENGTHTOOLONG(CatalogsItemValidationDetails  aD_IMAGE_19_LINK_LENGTH_TOO_LONG);
	/*! \brief Get 
	 */
	CatalogsItemValidationDetails getADIMAGE19LINKREQUIRED();

	/*! \brief Set 
	 */
	void setADIMAGE19LINKREQUIRED(CatalogsItemValidationDetails  aD_IMAGE_19_LINK_REQUIRED);
	/*! \brief Get 
	 */
	CatalogsItemValidationDetails getADIMAGE19LINKWARNING();

	/*! \brief Set 
	 */
	void setADIMAGE19LINKWARNING(CatalogsItemValidationDetails  aD_IMAGE_19_LINK_WARNING);
	/*! \brief Get 
	 */
	CatalogsItemValidationDetails getADIMAGE19TAGDUPLICATED();

	/*! \brief Set 
	 */
	void setADIMAGE19TAGDUPLICATED(CatalogsItemValidationDetails  aD_IMAGE_19_TAG_DUPLICATED);
	/*! \brief Get 
	 */
	CatalogsItemValidationDetails getADIMAGE19TAGLENGTHTOOLONG();

	/*! \brief Set 
	 */
	void setADIMAGE19TAGLENGTHTOOLONG(CatalogsItemValidationDetails  aD_IMAGE_19_TAG_LENGTH_TOO_LONG);
	/*! \brief Get 
	 */
	CatalogsItemValidationDetails getADIMAGE19TAGREQUIRED();

	/*! \brief Set 
	 */
	void setADIMAGE19TAGREQUIRED(CatalogsItemValidationDetails  aD_IMAGE_19_TAG_REQUIRED);
	/*! \brief Get 
	 */
	CatalogsItemValidationDetails getADIMAGE1LINKDUPLICATED();

	/*! \brief Set 
	 */
	void setADIMAGE1LINKDUPLICATED(CatalogsItemValidationDetails  aD_IMAGE_1_LINK_DUPLICATED);
	/*! \brief Get 
	 */
	CatalogsItemValidationDetails getADIMAGE1LINKLENGTHTOOLONG();

	/*! \brief Set 
	 */
	void setADIMAGE1LINKLENGTHTOOLONG(CatalogsItemValidationDetails  aD_IMAGE_1_LINK_LENGTH_TOO_LONG);
	/*! \brief Get 
	 */
	CatalogsItemValidationDetails getADIMAGE1LINKREQUIRED();

	/*! \brief Set 
	 */
	void setADIMAGE1LINKREQUIRED(CatalogsItemValidationDetails  aD_IMAGE_1_LINK_REQUIRED);
	/*! \brief Get 
	 */
	CatalogsItemValidationDetails getADIMAGE1LINKWARNING();

	/*! \brief Set 
	 */
	void setADIMAGE1LINKWARNING(CatalogsItemValidationDetails  aD_IMAGE_1_LINK_WARNING);
	/*! \brief Get 
	 */
	CatalogsItemValidationDetails getADIMAGE1TAGDUPLICATED();

	/*! \brief Set 
	 */
	void setADIMAGE1TAGDUPLICATED(CatalogsItemValidationDetails  aD_IMAGE_1_TAG_DUPLICATED);
	/*! \brief Get 
	 */
	CatalogsItemValidationDetails getADIMAGE1TAGLENGTHTOOLONG();

	/*! \brief Set 
	 */
	void setADIMAGE1TAGLENGTHTOOLONG(CatalogsItemValidationDetails  aD_IMAGE_1_TAG_LENGTH_TOO_LONG);
	/*! \brief Get 
	 */
	CatalogsItemValidationDetails getADIMAGE1TAGREQUIRED();

	/*! \brief Set 
	 */
	void setADIMAGE1TAGREQUIRED(CatalogsItemValidationDetails  aD_IMAGE_1_TAG_REQUIRED);
	/*! \brief Get 
	 */
	CatalogsItemValidationDetails getADIMAGE2LINKDUPLICATED();

	/*! \brief Set 
	 */
	void setADIMAGE2LINKDUPLICATED(CatalogsItemValidationDetails  aD_IMAGE_2_LINK_DUPLICATED);
	/*! \brief Get 
	 */
	CatalogsItemValidationDetails getADIMAGE2LINKLENGTHTOOLONG();

	/*! \brief Set 
	 */
	void setADIMAGE2LINKLENGTHTOOLONG(CatalogsItemValidationDetails  aD_IMAGE_2_LINK_LENGTH_TOO_LONG);
	/*! \brief Get 
	 */
	CatalogsItemValidationDetails getADIMAGE2LINKREQUIRED();

	/*! \brief Set 
	 */
	void setADIMAGE2LINKREQUIRED(CatalogsItemValidationDetails  aD_IMAGE_2_LINK_REQUIRED);
	/*! \brief Get 
	 */
	CatalogsItemValidationDetails getADIMAGE2LINKWARNING();

	/*! \brief Set 
	 */
	void setADIMAGE2LINKWARNING(CatalogsItemValidationDetails  aD_IMAGE_2_LINK_WARNING);
	/*! \brief Get 
	 */
	CatalogsItemValidationDetails getADIMAGE2TAGDUPLICATED();

	/*! \brief Set 
	 */
	void setADIMAGE2TAGDUPLICATED(CatalogsItemValidationDetails  aD_IMAGE_2_TAG_DUPLICATED);
	/*! \brief Get 
	 */
	CatalogsItemValidationDetails getADIMAGE2TAGLENGTHTOOLONG();

	/*! \brief Set 
	 */
	void setADIMAGE2TAGLENGTHTOOLONG(CatalogsItemValidationDetails  aD_IMAGE_2_TAG_LENGTH_TOO_LONG);
	/*! \brief Get 
	 */
	CatalogsItemValidationDetails getADIMAGE2TAGREQUIRED();

	/*! \brief Set 
	 */
	void setADIMAGE2TAGREQUIRED(CatalogsItemValidationDetails  aD_IMAGE_2_TAG_REQUIRED);
	/*! \brief Get 
	 */
	CatalogsItemValidationDetails getADIMAGE3LINKDUPLICATED();

	/*! \brief Set 
	 */
	void setADIMAGE3LINKDUPLICATED(CatalogsItemValidationDetails  aD_IMAGE_3_LINK_DUPLICATED);
	/*! \brief Get 
	 */
	CatalogsItemValidationDetails getADIMAGE3LINKLENGTHTOOLONG();

	/*! \brief Set 
	 */
	void setADIMAGE3LINKLENGTHTOOLONG(CatalogsItemValidationDetails  aD_IMAGE_3_LINK_LENGTH_TOO_LONG);
	/*! \brief Get 
	 */
	CatalogsItemValidationDetails getADIMAGE3LINKREQUIRED();

	/*! \brief Set 
	 */
	void setADIMAGE3LINKREQUIRED(CatalogsItemValidationDetails  aD_IMAGE_3_LINK_REQUIRED);
	/*! \brief Get 
	 */
	CatalogsItemValidationDetails getADIMAGE3LINKWARNING();

	/*! \brief Set 
	 */
	void setADIMAGE3LINKWARNING(CatalogsItemValidationDetails  aD_IMAGE_3_LINK_WARNING);
	/*! \brief Get 
	 */
	CatalogsItemValidationDetails getADIMAGE3TAGDUPLICATED();

	/*! \brief Set 
	 */
	void setADIMAGE3TAGDUPLICATED(CatalogsItemValidationDetails  aD_IMAGE_3_TAG_DUPLICATED);
	/*! \brief Get 
	 */
	CatalogsItemValidationDetails getADIMAGE3TAGLENGTHTOOLONG();

	/*! \brief Set 
	 */
	void setADIMAGE3TAGLENGTHTOOLONG(CatalogsItemValidationDetails  aD_IMAGE_3_TAG_LENGTH_TOO_LONG);
	/*! \brief Get 
	 */
	CatalogsItemValidationDetails getADIMAGE3TAGREQUIRED();

	/*! \brief Set 
	 */
	void setADIMAGE3TAGREQUIRED(CatalogsItemValidationDetails  aD_IMAGE_3_TAG_REQUIRED);
	/*! \brief Get 
	 */
	CatalogsItemValidationDetails getADIMAGE4LINKDUPLICATED();

	/*! \brief Set 
	 */
	void setADIMAGE4LINKDUPLICATED(CatalogsItemValidationDetails  aD_IMAGE_4_LINK_DUPLICATED);
	/*! \brief Get 
	 */
	CatalogsItemValidationDetails getADIMAGE4LINKLENGTHTOOLONG();

	/*! \brief Set 
	 */
	void setADIMAGE4LINKLENGTHTOOLONG(CatalogsItemValidationDetails  aD_IMAGE_4_LINK_LENGTH_TOO_LONG);
	/*! \brief Get 
	 */
	CatalogsItemValidationDetails getADIMAGE4LINKREQUIRED();

	/*! \brief Set 
	 */
	void setADIMAGE4LINKREQUIRED(CatalogsItemValidationDetails  aD_IMAGE_4_LINK_REQUIRED);
	/*! \brief Get 
	 */
	CatalogsItemValidationDetails getADIMAGE4LINKWARNING();

	/*! \brief Set 
	 */
	void setADIMAGE4LINKWARNING(CatalogsItemValidationDetails  aD_IMAGE_4_LINK_WARNING);
	/*! \brief Get 
	 */
	CatalogsItemValidationDetails getADIMAGE4TAGDUPLICATED();

	/*! \brief Set 
	 */
	void setADIMAGE4TAGDUPLICATED(CatalogsItemValidationDetails  aD_IMAGE_4_TAG_DUPLICATED);
	/*! \brief Get 
	 */
	CatalogsItemValidationDetails getADIMAGE4TAGLENGTHTOOLONG();

	/*! \brief Set 
	 */
	void setADIMAGE4TAGLENGTHTOOLONG(CatalogsItemValidationDetails  aD_IMAGE_4_TAG_LENGTH_TOO_LONG);
	/*! \brief Get 
	 */
	CatalogsItemValidationDetails getADIMAGE4TAGREQUIRED();

	/*! \brief Set 
	 */
	void setADIMAGE4TAGREQUIRED(CatalogsItemValidationDetails  aD_IMAGE_4_TAG_REQUIRED);
	/*! \brief Get 
	 */
	CatalogsItemValidationDetails getADIMAGE5LINKDUPLICATED();

	/*! \brief Set 
	 */
	void setADIMAGE5LINKDUPLICATED(CatalogsItemValidationDetails  aD_IMAGE_5_LINK_DUPLICATED);
	/*! \brief Get 
	 */
	CatalogsItemValidationDetails getADIMAGE5LINKLENGTHTOOLONG();

	/*! \brief Set 
	 */
	void setADIMAGE5LINKLENGTHTOOLONG(CatalogsItemValidationDetails  aD_IMAGE_5_LINK_LENGTH_TOO_LONG);
	/*! \brief Get 
	 */
	CatalogsItemValidationDetails getADIMAGE5LINKREQUIRED();

	/*! \brief Set 
	 */
	void setADIMAGE5LINKREQUIRED(CatalogsItemValidationDetails  aD_IMAGE_5_LINK_REQUIRED);
	/*! \brief Get 
	 */
	CatalogsItemValidationDetails getADIMAGE5LINKWARNING();

	/*! \brief Set 
	 */
	void setADIMAGE5LINKWARNING(CatalogsItemValidationDetails  aD_IMAGE_5_LINK_WARNING);
	/*! \brief Get 
	 */
	CatalogsItemValidationDetails getADIMAGE5TAGDUPLICATED();

	/*! \brief Set 
	 */
	void setADIMAGE5TAGDUPLICATED(CatalogsItemValidationDetails  aD_IMAGE_5_TAG_DUPLICATED);
	/*! \brief Get 
	 */
	CatalogsItemValidationDetails getADIMAGE5TAGLENGTHTOOLONG();

	/*! \brief Set 
	 */
	void setADIMAGE5TAGLENGTHTOOLONG(CatalogsItemValidationDetails  aD_IMAGE_5_TAG_LENGTH_TOO_LONG);
	/*! \brief Get 
	 */
	CatalogsItemValidationDetails getADIMAGE5TAGREQUIRED();

	/*! \brief Set 
	 */
	void setADIMAGE5TAGREQUIRED(CatalogsItemValidationDetails  aD_IMAGE_5_TAG_REQUIRED);
	/*! \brief Get 
	 */
	CatalogsItemValidationDetails getADIMAGE6LINKDUPLICATED();

	/*! \brief Set 
	 */
	void setADIMAGE6LINKDUPLICATED(CatalogsItemValidationDetails  aD_IMAGE_6_LINK_DUPLICATED);
	/*! \brief Get 
	 */
	CatalogsItemValidationDetails getADIMAGE6LINKLENGTHTOOLONG();

	/*! \brief Set 
	 */
	void setADIMAGE6LINKLENGTHTOOLONG(CatalogsItemValidationDetails  aD_IMAGE_6_LINK_LENGTH_TOO_LONG);
	/*! \brief Get 
	 */
	CatalogsItemValidationDetails getADIMAGE6LINKREQUIRED();

	/*! \brief Set 
	 */
	void setADIMAGE6LINKREQUIRED(CatalogsItemValidationDetails  aD_IMAGE_6_LINK_REQUIRED);
	/*! \brief Get 
	 */
	CatalogsItemValidationDetails getADIMAGE6LINKWARNING();

	/*! \brief Set 
	 */
	void setADIMAGE6LINKWARNING(CatalogsItemValidationDetails  aD_IMAGE_6_LINK_WARNING);
	/*! \brief Get 
	 */
	CatalogsItemValidationDetails getADIMAGE6TAGDUPLICATED();

	/*! \brief Set 
	 */
	void setADIMAGE6TAGDUPLICATED(CatalogsItemValidationDetails  aD_IMAGE_6_TAG_DUPLICATED);
	/*! \brief Get 
	 */
	CatalogsItemValidationDetails getADIMAGE6TAGLENGTHTOOLONG();

	/*! \brief Set 
	 */
	void setADIMAGE6TAGLENGTHTOOLONG(CatalogsItemValidationDetails  aD_IMAGE_6_TAG_LENGTH_TOO_LONG);
	/*! \brief Get 
	 */
	CatalogsItemValidationDetails getADIMAGE6TAGREQUIRED();

	/*! \brief Set 
	 */
	void setADIMAGE6TAGREQUIRED(CatalogsItemValidationDetails  aD_IMAGE_6_TAG_REQUIRED);
	/*! \brief Get 
	 */
	CatalogsItemValidationDetails getADIMAGE7LINKDUPLICATED();

	/*! \brief Set 
	 */
	void setADIMAGE7LINKDUPLICATED(CatalogsItemValidationDetails  aD_IMAGE_7_LINK_DUPLICATED);
	/*! \brief Get 
	 */
	CatalogsItemValidationDetails getADIMAGE7LINKLENGTHTOOLONG();

	/*! \brief Set 
	 */
	void setADIMAGE7LINKLENGTHTOOLONG(CatalogsItemValidationDetails  aD_IMAGE_7_LINK_LENGTH_TOO_LONG);
	/*! \brief Get 
	 */
	CatalogsItemValidationDetails getADIMAGE7LINKREQUIRED();

	/*! \brief Set 
	 */
	void setADIMAGE7LINKREQUIRED(CatalogsItemValidationDetails  aD_IMAGE_7_LINK_REQUIRED);
	/*! \brief Get 
	 */
	CatalogsItemValidationDetails getADIMAGE7LINKWARNING();

	/*! \brief Set 
	 */
	void setADIMAGE7LINKWARNING(CatalogsItemValidationDetails  aD_IMAGE_7_LINK_WARNING);
	/*! \brief Get 
	 */
	CatalogsItemValidationDetails getADIMAGE7TAGDUPLICATED();

	/*! \brief Set 
	 */
	void setADIMAGE7TAGDUPLICATED(CatalogsItemValidationDetails  aD_IMAGE_7_TAG_DUPLICATED);
	/*! \brief Get 
	 */
	CatalogsItemValidationDetails getADIMAGE7TAGLENGTHTOOLONG();

	/*! \brief Set 
	 */
	void setADIMAGE7TAGLENGTHTOOLONG(CatalogsItemValidationDetails  aD_IMAGE_7_TAG_LENGTH_TOO_LONG);
	/*! \brief Get 
	 */
	CatalogsItemValidationDetails getADIMAGE7TAGREQUIRED();

	/*! \brief Set 
	 */
	void setADIMAGE7TAGREQUIRED(CatalogsItemValidationDetails  aD_IMAGE_7_TAG_REQUIRED);
	/*! \brief Get 
	 */
	CatalogsItemValidationDetails getADIMAGE8LINKDUPLICATED();

	/*! \brief Set 
	 */
	void setADIMAGE8LINKDUPLICATED(CatalogsItemValidationDetails  aD_IMAGE_8_LINK_DUPLICATED);
	/*! \brief Get 
	 */
	CatalogsItemValidationDetails getADIMAGE8LINKLENGTHTOOLONG();

	/*! \brief Set 
	 */
	void setADIMAGE8LINKLENGTHTOOLONG(CatalogsItemValidationDetails  aD_IMAGE_8_LINK_LENGTH_TOO_LONG);
	/*! \brief Get 
	 */
	CatalogsItemValidationDetails getADIMAGE8LINKREQUIRED();

	/*! \brief Set 
	 */
	void setADIMAGE8LINKREQUIRED(CatalogsItemValidationDetails  aD_IMAGE_8_LINK_REQUIRED);
	/*! \brief Get 
	 */
	CatalogsItemValidationDetails getADIMAGE8LINKWARNING();

	/*! \brief Set 
	 */
	void setADIMAGE8LINKWARNING(CatalogsItemValidationDetails  aD_IMAGE_8_LINK_WARNING);
	/*! \brief Get 
	 */
	CatalogsItemValidationDetails getADIMAGE8TAGDUPLICATED();

	/*! \brief Set 
	 */
	void setADIMAGE8TAGDUPLICATED(CatalogsItemValidationDetails  aD_IMAGE_8_TAG_DUPLICATED);
	/*! \brief Get 
	 */
	CatalogsItemValidationDetails getADIMAGE8TAGLENGTHTOOLONG();

	/*! \brief Set 
	 */
	void setADIMAGE8TAGLENGTHTOOLONG(CatalogsItemValidationDetails  aD_IMAGE_8_TAG_LENGTH_TOO_LONG);
	/*! \brief Get 
	 */
	CatalogsItemValidationDetails getADIMAGE8TAGREQUIRED();

	/*! \brief Set 
	 */
	void setADIMAGE8TAGREQUIRED(CatalogsItemValidationDetails  aD_IMAGE_8_TAG_REQUIRED);
	/*! \brief Get 
	 */
	CatalogsItemValidationDetails getADIMAGE9LINKDUPLICATED();

	/*! \brief Set 
	 */
	void setADIMAGE9LINKDUPLICATED(CatalogsItemValidationDetails  aD_IMAGE_9_LINK_DUPLICATED);
	/*! \brief Get 
	 */
	CatalogsItemValidationDetails getADIMAGE9LINKLENGTHTOOLONG();

	/*! \brief Set 
	 */
	void setADIMAGE9LINKLENGTHTOOLONG(CatalogsItemValidationDetails  aD_IMAGE_9_LINK_LENGTH_TOO_LONG);
	/*! \brief Get 
	 */
	CatalogsItemValidationDetails getADIMAGE9LINKREQUIRED();

	/*! \brief Set 
	 */
	void setADIMAGE9LINKREQUIRED(CatalogsItemValidationDetails  aD_IMAGE_9_LINK_REQUIRED);
	/*! \brief Get 
	 */
	CatalogsItemValidationDetails getADIMAGE9LINKWARNING();

	/*! \brief Set 
	 */
	void setADIMAGE9LINKWARNING(CatalogsItemValidationDetails  aD_IMAGE_9_LINK_WARNING);
	/*! \brief Get 
	 */
	CatalogsItemValidationDetails getADIMAGE9TAGDUPLICATED();

	/*! \brief Set 
	 */
	void setADIMAGE9TAGDUPLICATED(CatalogsItemValidationDetails  aD_IMAGE_9_TAG_DUPLICATED);
	/*! \brief Get 
	 */
	CatalogsItemValidationDetails getADIMAGE9TAGLENGTHTOOLONG();

	/*! \brief Set 
	 */
	void setADIMAGE9TAGLENGTHTOOLONG(CatalogsItemValidationDetails  aD_IMAGE_9_TAG_LENGTH_TOO_LONG);
	/*! \brief Get 
	 */
	CatalogsItemValidationDetails getADIMAGE9TAGREQUIRED();

	/*! \brief Set 
	 */
	void setADIMAGE9TAGREQUIRED(CatalogsItemValidationDetails  aD_IMAGE_9_TAG_REQUIRED);
	/*! \brief Get 
	 */
	CatalogsItemValidationDetails getADLINKFORMATWARNING();

	/*! \brief Set 
	 */
	void setADLINKFORMATWARNING(CatalogsItemValidationDetails  aD_LINK_FORMAT_WARNING);
	/*! \brief Get 
	 */
	CatalogsItemValidationDetails getADLINKSAMEASLINK();

	/*! \brief Set 
	 */
	void setADLINKSAMEASLINK(CatalogsItemValidationDetails  aD_LINK_SAME_AS_LINK);
	/*! \brief Get 
	 */
	CatalogsItemValidationDetails getADVIDEO0LINKDUPLICATED();

	/*! \brief Set 
	 */
	void setADVIDEO0LINKDUPLICATED(CatalogsItemValidationDetails  aD_VIDEO_0_LINK_DUPLICATED);
	/*! \brief Get 
	 */
	CatalogsItemValidationDetails getADVIDEO0LINKLENGTHTOOLONG();

	/*! \brief Set 
	 */
	void setADVIDEO0LINKLENGTHTOOLONG(CatalogsItemValidationDetails  aD_VIDEO_0_LINK_LENGTH_TOO_LONG);
	/*! \brief Get 
	 */
	CatalogsItemValidationDetails getADVIDEO0LINKREQUIRED();

	/*! \brief Set 
	 */
	void setADVIDEO0LINKREQUIRED(CatalogsItemValidationDetails  aD_VIDEO_0_LINK_REQUIRED);
	/*! \brief Get 
	 */
	CatalogsItemValidationDetails getADVIDEO0LINKWARNING();

	/*! \brief Set 
	 */
	void setADVIDEO0LINKWARNING(CatalogsItemValidationDetails  aD_VIDEO_0_LINK_WARNING);
	/*! \brief Get 
	 */
	CatalogsItemValidationDetails getADVIDEO0TAGDUPLICATED();

	/*! \brief Set 
	 */
	void setADVIDEO0TAGDUPLICATED(CatalogsItemValidationDetails  aD_VIDEO_0_TAG_DUPLICATED);
	/*! \brief Get 
	 */
	CatalogsItemValidationDetails getADVIDEO0TAGLENGTHTOOLONG();

	/*! \brief Set 
	 */
	void setADVIDEO0TAGLENGTHTOOLONG(CatalogsItemValidationDetails  aD_VIDEO_0_TAG_LENGTH_TOO_LONG);
	/*! \brief Get 
	 */
	CatalogsItemValidationDetails getADVIDEO0TAGREQUIRED();

	/*! \brief Set 
	 */
	void setADVIDEO0TAGREQUIRED(CatalogsItemValidationDetails  aD_VIDEO_0_TAG_REQUIRED);
	/*! \brief Get 
	 */
	CatalogsItemValidationDetails getADVIDEO1LINKDUPLICATED();

	/*! \brief Set 
	 */
	void setADVIDEO1LINKDUPLICATED(CatalogsItemValidationDetails  aD_VIDEO_1_LINK_DUPLICATED);
	/*! \brief Get 
	 */
	CatalogsItemValidationDetails getADVIDEO1LINKLENGTHTOOLONG();

	/*! \brief Set 
	 */
	void setADVIDEO1LINKLENGTHTOOLONG(CatalogsItemValidationDetails  aD_VIDEO_1_LINK_LENGTH_TOO_LONG);
	/*! \brief Get 
	 */
	CatalogsItemValidationDetails getADVIDEO1LINKREQUIRED();

	/*! \brief Set 
	 */
	void setADVIDEO1LINKREQUIRED(CatalogsItemValidationDetails  aD_VIDEO_1_LINK_REQUIRED);
	/*! \brief Get 
	 */
	CatalogsItemValidationDetails getADVIDEO1LINKWARNING();

	/*! \brief Set 
	 */
	void setADVIDEO1LINKWARNING(CatalogsItemValidationDetails  aD_VIDEO_1_LINK_WARNING);
	/*! \brief Get 
	 */
	CatalogsItemValidationDetails getADVIDEO1TAGDUPLICATED();

	/*! \brief Set 
	 */
	void setADVIDEO1TAGDUPLICATED(CatalogsItemValidationDetails  aD_VIDEO_1_TAG_DUPLICATED);
	/*! \brief Get 
	 */
	CatalogsItemValidationDetails getADVIDEO1TAGLENGTHTOOLONG();

	/*! \brief Set 
	 */
	void setADVIDEO1TAGLENGTHTOOLONG(CatalogsItemValidationDetails  aD_VIDEO_1_TAG_LENGTH_TOO_LONG);
	/*! \brief Get 
	 */
	CatalogsItemValidationDetails getADVIDEO1TAGREQUIRED();

	/*! \brief Set 
	 */
	void setADVIDEO1TAGREQUIRED(CatalogsItemValidationDetails  aD_VIDEO_1_TAG_REQUIRED);
	/*! \brief Get 
	 */
	CatalogsItemValidationDetails getADVIDEO2LINKDUPLICATED();

	/*! \brief Set 
	 */
	void setADVIDEO2LINKDUPLICATED(CatalogsItemValidationDetails  aD_VIDEO_2_LINK_DUPLICATED);
	/*! \brief Get 
	 */
	CatalogsItemValidationDetails getADVIDEO2LINKLENGTHTOOLONG();

	/*! \brief Set 
	 */
	void setADVIDEO2LINKLENGTHTOOLONG(CatalogsItemValidationDetails  aD_VIDEO_2_LINK_LENGTH_TOO_LONG);
	/*! \brief Get 
	 */
	CatalogsItemValidationDetails getADVIDEO2LINKREQUIRED();

	/*! \brief Set 
	 */
	void setADVIDEO2LINKREQUIRED(CatalogsItemValidationDetails  aD_VIDEO_2_LINK_REQUIRED);
	/*! \brief Get 
	 */
	CatalogsItemValidationDetails getADVIDEO2LINKWARNING();

	/*! \brief Set 
	 */
	void setADVIDEO2LINKWARNING(CatalogsItemValidationDetails  aD_VIDEO_2_LINK_WARNING);
	/*! \brief Get 
	 */
	CatalogsItemValidationDetails getADVIDEO2TAGDUPLICATED();

	/*! \brief Set 
	 */
	void setADVIDEO2TAGDUPLICATED(CatalogsItemValidationDetails  aD_VIDEO_2_TAG_DUPLICATED);
	/*! \brief Get 
	 */
	CatalogsItemValidationDetails getADVIDEO2TAGLENGTHTOOLONG();

	/*! \brief Set 
	 */
	void setADVIDEO2TAGLENGTHTOOLONG(CatalogsItemValidationDetails  aD_VIDEO_2_TAG_LENGTH_TOO_LONG);
	/*! \brief Get 
	 */
	CatalogsItemValidationDetails getADVIDEO2TAGREQUIRED();

	/*! \brief Set 
	 */
	void setADVIDEO2TAGREQUIRED(CatalogsItemValidationDetails  aD_VIDEO_2_TAG_REQUIRED);
	/*! \brief Get 
	 */
	CatalogsItemValidationDetails getADDITIONALIMAGELINKLENGTHTOOLONG();

	/*! \brief Set 
	 */
	void setADDITIONALIMAGELINKLENGTHTOOLONG(CatalogsItemValidationDetails  aDDITIONAL_IMAGE_LINK_LENGTH_TOO_LONG);
	/*! \brief Get 
	 */
	CatalogsItemValidationDetails getADDITIONALIMAGELINKWARNING();

	/*! \brief Set 
	 */
	void setADDITIONALIMAGELINKWARNING(CatalogsItemValidationDetails  aDDITIONAL_IMAGE_LINK_WARNING);
	/*! \brief Get 
	 */
	CatalogsItemValidationDetails getADWORDSFORMATWARNING();

	/*! \brief Set 
	 */
	void setADWORDSFORMATWARNING(CatalogsItemValidationDetails  aDWORDS_FORMAT_WARNING);
	/*! \brief Get 
	 */
	CatalogsItemValidationDetails getADWORDSSAMEASLINK();

	/*! \brief Set 
	 */
	void setADWORDSSAMEASLINK(CatalogsItemValidationDetails  aDWORDS_SAME_AS_LINK);
	/*! \brief Get 
	 */
	CatalogsItemValidationDetails getAGEGROUPINVALID();

	/*! \brief Set 
	 */
	void setAGEGROUPINVALID(CatalogsItemValidationDetails  aGE_GROUP_INVALID);
	/*! \brief Get 
	 */
	CatalogsItemValidationDetails getANDROIDDEEPLINKINVALID();

	/*! \brief Set 
	 */
	void setANDROIDDEEPLINKINVALID(CatalogsItemValidationDetails  aNDROID_DEEP_LINK_INVALID);
	/*! \brief Get 
	 */
	CatalogsItemValidationDetails getAVAILABILITYDATEINVALID();

	/*! \brief Set 
	 */
	void setAVAILABILITYDATEINVALID(CatalogsItemValidationDetails  aVAILABILITY_DATE_INVALID);
	/*! \brief Get 
	 */
	CatalogsItemValidationDetails getCOUNTRYDOESNOTMAPTOCURRENCY();

	/*! \brief Set 
	 */
	void setCOUNTRYDOESNOTMAPTOCURRENCY(CatalogsItemValidationDetails  cOUNTRY_DOES_NOT_MAP_TO_CURRENCY);
	/*! \brief Get 
	 */
	CatalogsItemValidationDetails getCUSTOMLABELLENGTHTOOLONG();

	/*! \brief Set 
	 */
	void setCUSTOMLABELLENGTHTOOLONG(CatalogsItemValidationDetails  cUSTOM_LABEL_LENGTH_TOO_LONG);
	/*! \brief Get 
	 */
	CatalogsItemValidationDetails getDESCRIPTIONLENGTHTOOLONG();

	/*! \brief Set 
	 */
	void setDESCRIPTIONLENGTHTOOLONG(CatalogsItemValidationDetails  dESCRIPTION_LENGTH_TOO_LONG);
	/*! \brief Get 
	 */
	CatalogsItemValidationDetails getEXPIRATIONDATEINVALID();

	/*! \brief Set 
	 */
	void setEXPIRATIONDATEINVALID(CatalogsItemValidationDetails  eXPIRATION_DATE_INVALID);
	/*! \brief Get 
	 */
	CatalogsItemValidationDetails getGENDERINVALID();

	/*! \brief Set 
	 */
	void setGENDERINVALID(CatalogsItemValidationDetails  gENDER_INVALID);
	/*! \brief Get 
	 */
	CatalogsItemValidationDetails getGTININVALID();

	/*! \brief Set 
	 */
	void setGTININVALID(CatalogsItemValidationDetails  gTIN_INVALID);
	/*! \brief Get 
	 */
	CatalogsItemValidationDetails getIMAGELINKWARNING();

	/*! \brief Set 
	 */
	void setIMAGELINKWARNING(CatalogsItemValidationDetails  iMAGE_LINK_WARNING);
	/*! \brief Get 
	 */
	CatalogsItemValidationDetails getIOSDEEPLINKINVALID();

	/*! \brief Set 
	 */
	void setIOSDEEPLINKINVALID(CatalogsItemValidationDetails  iOS_DEEP_LINK_INVALID);
	/*! \brief Get 
	 */
	CatalogsItemValidationDetails getISBUNDLEINVALID();

	/*! \brief Set 
	 */
	void setISBUNDLEINVALID(CatalogsItemValidationDetails  iS_BUNDLE_INVALID);
	/*! \brief Get 
	 */
	CatalogsItemValidationDetails getITEMADDITIONALIMAGEDOWNLOADFAILURE();

	/*! \brief Set 
	 */
	void setITEMADDITIONALIMAGEDOWNLOADFAILURE(CatalogsItemValidationDetails  iTEM_ADDITIONAL_IMAGE_DOWNLOAD_FAILURE);
	/*! \brief Get 
	 */
	CatalogsItemValidationDetails getLINKFORMATWARNING();

	/*! \brief Set 
	 */
	void setLINKFORMATWARNING(CatalogsItemValidationDetails  lINK_FORMAT_WARNING);
	/*! \brief Get 
	 */
	CatalogsItemValidationDetails getMINADPRICEINVALID();

	/*! \brief Set 
	 */
	void setMINADPRICEINVALID(CatalogsItemValidationDetails  mIN_AD_PRICE_INVALID);
	/*! \brief Get 
	 */
	CatalogsItemValidationDetails getMPNINVALID();

	/*! \brief Set 
	 */
	void setMPNINVALID(CatalogsItemValidationDetails  mPN_INVALID);
	/*! \brief Get 
	 */
	CatalogsItemValidationDetails getMULTIPACKINVALID();

	/*! \brief Set 
	 */
	void setMULTIPACKINVALID(CatalogsItemValidationDetails  mULTIPACK_INVALID);
	/*! \brief Get 
	 */
	CatalogsItemValidationDetails getOPTIONALCONDITIONINVALID();

	/*! \brief Set 
	 */
	void setOPTIONALCONDITIONINVALID(CatalogsItemValidationDetails  oPTIONAL_CONDITION_INVALID);
	/*! \brief Get 
	 */
	CatalogsItemValidationDetails getOPTIONALCONDITIONMISSING();

	/*! \brief Set 
	 */
	void setOPTIONALCONDITIONMISSING(CatalogsItemValidationDetails  oPTIONAL_CONDITION_MISSING);
	/*! \brief Get 
	 */
	CatalogsItemValidationDetails getOPTIONALPRODUCTCATEGORYINVALID();

	/*! \brief Set 
	 */
	void setOPTIONALPRODUCTCATEGORYINVALID(CatalogsItemValidationDetails  oPTIONAL_PRODUCT_CATEGORY_INVALID);
	/*! \brief Get 
	 */
	CatalogsItemValidationDetails getOPTIONALPRODUCTCATEGORYMISSING();

	/*! \brief Set 
	 */
	void setOPTIONALPRODUCTCATEGORYMISSING(CatalogsItemValidationDetails  oPTIONAL_PRODUCT_CATEGORY_MISSING);
	/*! \brief Get 
	 */
	CatalogsItemValidationDetails getPRODUCTCATEGORYDEPTHWARNING();

	/*! \brief Set 
	 */
	void setPRODUCTCATEGORYDEPTHWARNING(CatalogsItemValidationDetails  pRODUCT_CATEGORY_DEPTH_WARNING);
	/*! \brief Get 
	 */
	CatalogsItemValidationDetails getPRODUCTTYPELENGTHTOOLONG();

	/*! \brief Set 
	 */
	void setPRODUCTTYPELENGTHTOOLONG(CatalogsItemValidationDetails  pRODUCT_TYPE_LENGTH_TOO_LONG);
	/*! \brief Get 
	 */
	CatalogsItemValidationDetails getSALEDATEINVALID();

	/*! \brief Set 
	 */
	void setSALEDATEINVALID(CatalogsItemValidationDetails  sALE_DATE_INVALID);
	/*! \brief Get 
	 */
	CatalogsItemValidationDetails getSALESPRICEINVALID();

	/*! \brief Set 
	 */
	void setSALESPRICEINVALID(CatalogsItemValidationDetails  sALES_PRICE_INVALID);
	/*! \brief Get 
	 */
	CatalogsItemValidationDetails getSALESPRICETOOHIGH();

	/*! \brief Set 
	 */
	void setSALESPRICETOOHIGH(CatalogsItemValidationDetails  sALES_PRICE_TOO_HIGH);
	/*! \brief Get 
	 */
	CatalogsItemValidationDetails getSALESPRICETOOLOW();

	/*! \brief Set 
	 */
	void setSALESPRICETOOLOW(CatalogsItemValidationDetails  sALES_PRICE_TOO_LOW);
	/*! \brief Get 
	 */
	CatalogsItemValidationDetails getSHIPPINGHEIGHTINVALID();

	/*! \brief Set 
	 */
	void setSHIPPINGHEIGHTINVALID(CatalogsItemValidationDetails  sHIPPING_HEIGHT_INVALID);
	/*! \brief Get 
	 */
	CatalogsItemValidationDetails getSHIPPINGINVALID();

	/*! \brief Set 
	 */
	void setSHIPPINGINVALID(CatalogsItemValidationDetails  sHIPPING_INVALID);
	/*! \brief Get 
	 */
	CatalogsItemValidationDetails getSHIPPINGWEIGHTINVALID();

	/*! \brief Set 
	 */
	void setSHIPPINGWEIGHTINVALID(CatalogsItemValidationDetails  sHIPPING_WEIGHT_INVALID);
	/*! \brief Get 
	 */
	CatalogsItemValidationDetails getSHIPPINGWIDTHINVALID();

	/*! \brief Set 
	 */
	void setSHIPPINGWIDTHINVALID(CatalogsItemValidationDetails  sHIPPING_WIDTH_INVALID);
	/*! \brief Get 
	 */
	CatalogsItemValidationDetails getSIZESYSTEMINVALID();

	/*! \brief Set 
	 */
	void setSIZESYSTEMINVALID(CatalogsItemValidationDetails  sIZE_SYSTEM_INVALID);
	/*! \brief Get 
	 */
	CatalogsItemValidationDetails getSIZETYPEINVALID();

	/*! \brief Set 
	 */
	void setSIZETYPEINVALID(CatalogsItemValidationDetails  sIZE_TYPE_INVALID);
	/*! \brief Get 
	 */
	CatalogsItemValidationDetails getTAXINVALID();

	/*! \brief Set 
	 */
	void setTAXINVALID(CatalogsItemValidationDetails  tAX_INVALID);
	/*! \brief Get 
	 */
	CatalogsItemValidationDetails getTITLELENGTHTOOLONG();

	/*! \brief Set 
	 */
	void setTITLELENGTHTOOLONG(CatalogsItemValidationDetails  tITLE_LENGTH_TOO_LONG);
	/*! \brief Get 
	 */
	CatalogsItemValidationDetails getTOOMANYADDITIONALIMAGELINKS();

	/*! \brief Set 
	 */
	void setTOOMANYADDITIONALIMAGELINKS(CatalogsItemValidationDetails  tOO_MANY_ADDITIONAL_IMAGE_LINKS);
	/*! \brief Get 
	 */
	CatalogsItemValidationDetails getUTMSOURCEAUTOCORRECTED();

	/*! \brief Set 
	 */
	void setUTMSOURCEAUTOCORRECTED(CatalogsItemValidationDetails  uTM_SOURCE_AUTO_CORRECTED);
	/*! \brief Get 
	 */
	CatalogsItemValidationDetails getVIDEOREQUIREDWHENADVIDEOPROVIDED();

	/*! \brief Set 
	 */
	void setVIDEOREQUIREDWHENADVIDEOPROVIDED(CatalogsItemValidationDetails  vIDEO_REQUIRED_WHEN_AD_VIDEO_PROVIDED);
	/*! \brief Get 
	 */
	CatalogsItemValidationDetails getWEIGHTUNITINVALID();

	/*! \brief Set 
	 */
	void setWEIGHTUNITINVALID(CatalogsItemValidationDetails  wEIGHT_UNIT_INVALID);


    private:
    CatalogsItemValidationDetails aD_IMAGE_0_LINK_DUPLICATED;
    CatalogsItemValidationDetails aD_IMAGE_0_LINK_LENGTH_TOO_LONG;
    CatalogsItemValidationDetails aD_IMAGE_0_LINK_REQUIRED;
    CatalogsItemValidationDetails aD_IMAGE_0_LINK_WARNING;
    CatalogsItemValidationDetails aD_IMAGE_0_TAG_DUPLICATED;
    CatalogsItemValidationDetails aD_IMAGE_0_TAG_LENGTH_TOO_LONG;
    CatalogsItemValidationDetails aD_IMAGE_0_TAG_REQUIRED;
    CatalogsItemValidationDetails aD_IMAGE_10_LINK_DUPLICATED;
    CatalogsItemValidationDetails aD_IMAGE_10_LINK_LENGTH_TOO_LONG;
    CatalogsItemValidationDetails aD_IMAGE_10_LINK_REQUIRED;
    CatalogsItemValidationDetails aD_IMAGE_10_LINK_WARNING;
    CatalogsItemValidationDetails aD_IMAGE_10_TAG_DUPLICATED;
    CatalogsItemValidationDetails aD_IMAGE_10_TAG_LENGTH_TOO_LONG;
    CatalogsItemValidationDetails aD_IMAGE_10_TAG_REQUIRED;
    CatalogsItemValidationDetails aD_IMAGE_11_LINK_DUPLICATED;
    CatalogsItemValidationDetails aD_IMAGE_11_LINK_LENGTH_TOO_LONG;
    CatalogsItemValidationDetails aD_IMAGE_11_LINK_REQUIRED;
    CatalogsItemValidationDetails aD_IMAGE_11_LINK_WARNING;
    CatalogsItemValidationDetails aD_IMAGE_11_TAG_DUPLICATED;
    CatalogsItemValidationDetails aD_IMAGE_11_TAG_LENGTH_TOO_LONG;
    CatalogsItemValidationDetails aD_IMAGE_11_TAG_REQUIRED;
    CatalogsItemValidationDetails aD_IMAGE_12_LINK_DUPLICATED;
    CatalogsItemValidationDetails aD_IMAGE_12_LINK_LENGTH_TOO_LONG;
    CatalogsItemValidationDetails aD_IMAGE_12_LINK_REQUIRED;
    CatalogsItemValidationDetails aD_IMAGE_12_LINK_WARNING;
    CatalogsItemValidationDetails aD_IMAGE_12_TAG_DUPLICATED;
    CatalogsItemValidationDetails aD_IMAGE_12_TAG_LENGTH_TOO_LONG;
    CatalogsItemValidationDetails aD_IMAGE_12_TAG_REQUIRED;
    CatalogsItemValidationDetails aD_IMAGE_13_LINK_DUPLICATED;
    CatalogsItemValidationDetails aD_IMAGE_13_LINK_LENGTH_TOO_LONG;
    CatalogsItemValidationDetails aD_IMAGE_13_LINK_REQUIRED;
    CatalogsItemValidationDetails aD_IMAGE_13_LINK_WARNING;
    CatalogsItemValidationDetails aD_IMAGE_13_TAG_DUPLICATED;
    CatalogsItemValidationDetails aD_IMAGE_13_TAG_LENGTH_TOO_LONG;
    CatalogsItemValidationDetails aD_IMAGE_13_TAG_REQUIRED;
    CatalogsItemValidationDetails aD_IMAGE_14_LINK_DUPLICATED;
    CatalogsItemValidationDetails aD_IMAGE_14_LINK_LENGTH_TOO_LONG;
    CatalogsItemValidationDetails aD_IMAGE_14_LINK_REQUIRED;
    CatalogsItemValidationDetails aD_IMAGE_14_LINK_WARNING;
    CatalogsItemValidationDetails aD_IMAGE_14_TAG_DUPLICATED;
    CatalogsItemValidationDetails aD_IMAGE_14_TAG_LENGTH_TOO_LONG;
    CatalogsItemValidationDetails aD_IMAGE_14_TAG_REQUIRED;
    CatalogsItemValidationDetails aD_IMAGE_15_LINK_DUPLICATED;
    CatalogsItemValidationDetails aD_IMAGE_15_LINK_LENGTH_TOO_LONG;
    CatalogsItemValidationDetails aD_IMAGE_15_LINK_REQUIRED;
    CatalogsItemValidationDetails aD_IMAGE_15_LINK_WARNING;
    CatalogsItemValidationDetails aD_IMAGE_15_TAG_DUPLICATED;
    CatalogsItemValidationDetails aD_IMAGE_15_TAG_LENGTH_TOO_LONG;
    CatalogsItemValidationDetails aD_IMAGE_15_TAG_REQUIRED;
    CatalogsItemValidationDetails aD_IMAGE_16_LINK_DUPLICATED;
    CatalogsItemValidationDetails aD_IMAGE_16_LINK_LENGTH_TOO_LONG;
    CatalogsItemValidationDetails aD_IMAGE_16_LINK_REQUIRED;
    CatalogsItemValidationDetails aD_IMAGE_16_LINK_WARNING;
    CatalogsItemValidationDetails aD_IMAGE_16_TAG_DUPLICATED;
    CatalogsItemValidationDetails aD_IMAGE_16_TAG_LENGTH_TOO_LONG;
    CatalogsItemValidationDetails aD_IMAGE_16_TAG_REQUIRED;
    CatalogsItemValidationDetails aD_IMAGE_17_LINK_DUPLICATED;
    CatalogsItemValidationDetails aD_IMAGE_17_LINK_LENGTH_TOO_LONG;
    CatalogsItemValidationDetails aD_IMAGE_17_LINK_REQUIRED;
    CatalogsItemValidationDetails aD_IMAGE_17_LINK_WARNING;
    CatalogsItemValidationDetails aD_IMAGE_17_TAG_DUPLICATED;
    CatalogsItemValidationDetails aD_IMAGE_17_TAG_LENGTH_TOO_LONG;
    CatalogsItemValidationDetails aD_IMAGE_17_TAG_REQUIRED;
    CatalogsItemValidationDetails aD_IMAGE_18_LINK_DUPLICATED;
    CatalogsItemValidationDetails aD_IMAGE_18_LINK_LENGTH_TOO_LONG;
    CatalogsItemValidationDetails aD_IMAGE_18_LINK_REQUIRED;
    CatalogsItemValidationDetails aD_IMAGE_18_LINK_WARNING;
    CatalogsItemValidationDetails aD_IMAGE_18_TAG_DUPLICATED;
    CatalogsItemValidationDetails aD_IMAGE_18_TAG_LENGTH_TOO_LONG;
    CatalogsItemValidationDetails aD_IMAGE_18_TAG_REQUIRED;
    CatalogsItemValidationDetails aD_IMAGE_19_LINK_DUPLICATED;
    CatalogsItemValidationDetails aD_IMAGE_19_LINK_LENGTH_TOO_LONG;
    CatalogsItemValidationDetails aD_IMAGE_19_LINK_REQUIRED;
    CatalogsItemValidationDetails aD_IMAGE_19_LINK_WARNING;
    CatalogsItemValidationDetails aD_IMAGE_19_TAG_DUPLICATED;
    CatalogsItemValidationDetails aD_IMAGE_19_TAG_LENGTH_TOO_LONG;
    CatalogsItemValidationDetails aD_IMAGE_19_TAG_REQUIRED;
    CatalogsItemValidationDetails aD_IMAGE_1_LINK_DUPLICATED;
    CatalogsItemValidationDetails aD_IMAGE_1_LINK_LENGTH_TOO_LONG;
    CatalogsItemValidationDetails aD_IMAGE_1_LINK_REQUIRED;
    CatalogsItemValidationDetails aD_IMAGE_1_LINK_WARNING;
    CatalogsItemValidationDetails aD_IMAGE_1_TAG_DUPLICATED;
    CatalogsItemValidationDetails aD_IMAGE_1_TAG_LENGTH_TOO_LONG;
    CatalogsItemValidationDetails aD_IMAGE_1_TAG_REQUIRED;
    CatalogsItemValidationDetails aD_IMAGE_2_LINK_DUPLICATED;
    CatalogsItemValidationDetails aD_IMAGE_2_LINK_LENGTH_TOO_LONG;
    CatalogsItemValidationDetails aD_IMAGE_2_LINK_REQUIRED;
    CatalogsItemValidationDetails aD_IMAGE_2_LINK_WARNING;
    CatalogsItemValidationDetails aD_IMAGE_2_TAG_DUPLICATED;
    CatalogsItemValidationDetails aD_IMAGE_2_TAG_LENGTH_TOO_LONG;
    CatalogsItemValidationDetails aD_IMAGE_2_TAG_REQUIRED;
    CatalogsItemValidationDetails aD_IMAGE_3_LINK_DUPLICATED;
    CatalogsItemValidationDetails aD_IMAGE_3_LINK_LENGTH_TOO_LONG;
    CatalogsItemValidationDetails aD_IMAGE_3_LINK_REQUIRED;
    CatalogsItemValidationDetails aD_IMAGE_3_LINK_WARNING;
    CatalogsItemValidationDetails aD_IMAGE_3_TAG_DUPLICATED;
    CatalogsItemValidationDetails aD_IMAGE_3_TAG_LENGTH_TOO_LONG;
    CatalogsItemValidationDetails aD_IMAGE_3_TAG_REQUIRED;
    CatalogsItemValidationDetails aD_IMAGE_4_LINK_DUPLICATED;
    CatalogsItemValidationDetails aD_IMAGE_4_LINK_LENGTH_TOO_LONG;
    CatalogsItemValidationDetails aD_IMAGE_4_LINK_REQUIRED;
    CatalogsItemValidationDetails aD_IMAGE_4_LINK_WARNING;
    CatalogsItemValidationDetails aD_IMAGE_4_TAG_DUPLICATED;
    CatalogsItemValidationDetails aD_IMAGE_4_TAG_LENGTH_TOO_LONG;
    CatalogsItemValidationDetails aD_IMAGE_4_TAG_REQUIRED;
    CatalogsItemValidationDetails aD_IMAGE_5_LINK_DUPLICATED;
    CatalogsItemValidationDetails aD_IMAGE_5_LINK_LENGTH_TOO_LONG;
    CatalogsItemValidationDetails aD_IMAGE_5_LINK_REQUIRED;
    CatalogsItemValidationDetails aD_IMAGE_5_LINK_WARNING;
    CatalogsItemValidationDetails aD_IMAGE_5_TAG_DUPLICATED;
    CatalogsItemValidationDetails aD_IMAGE_5_TAG_LENGTH_TOO_LONG;
    CatalogsItemValidationDetails aD_IMAGE_5_TAG_REQUIRED;
    CatalogsItemValidationDetails aD_IMAGE_6_LINK_DUPLICATED;
    CatalogsItemValidationDetails aD_IMAGE_6_LINK_LENGTH_TOO_LONG;
    CatalogsItemValidationDetails aD_IMAGE_6_LINK_REQUIRED;
    CatalogsItemValidationDetails aD_IMAGE_6_LINK_WARNING;
    CatalogsItemValidationDetails aD_IMAGE_6_TAG_DUPLICATED;
    CatalogsItemValidationDetails aD_IMAGE_6_TAG_LENGTH_TOO_LONG;
    CatalogsItemValidationDetails aD_IMAGE_6_TAG_REQUIRED;
    CatalogsItemValidationDetails aD_IMAGE_7_LINK_DUPLICATED;
    CatalogsItemValidationDetails aD_IMAGE_7_LINK_LENGTH_TOO_LONG;
    CatalogsItemValidationDetails aD_IMAGE_7_LINK_REQUIRED;
    CatalogsItemValidationDetails aD_IMAGE_7_LINK_WARNING;
    CatalogsItemValidationDetails aD_IMAGE_7_TAG_DUPLICATED;
    CatalogsItemValidationDetails aD_IMAGE_7_TAG_LENGTH_TOO_LONG;
    CatalogsItemValidationDetails aD_IMAGE_7_TAG_REQUIRED;
    CatalogsItemValidationDetails aD_IMAGE_8_LINK_DUPLICATED;
    CatalogsItemValidationDetails aD_IMAGE_8_LINK_LENGTH_TOO_LONG;
    CatalogsItemValidationDetails aD_IMAGE_8_LINK_REQUIRED;
    CatalogsItemValidationDetails aD_IMAGE_8_LINK_WARNING;
    CatalogsItemValidationDetails aD_IMAGE_8_TAG_DUPLICATED;
    CatalogsItemValidationDetails aD_IMAGE_8_TAG_LENGTH_TOO_LONG;
    CatalogsItemValidationDetails aD_IMAGE_8_TAG_REQUIRED;
    CatalogsItemValidationDetails aD_IMAGE_9_LINK_DUPLICATED;
    CatalogsItemValidationDetails aD_IMAGE_9_LINK_LENGTH_TOO_LONG;
    CatalogsItemValidationDetails aD_IMAGE_9_LINK_REQUIRED;
    CatalogsItemValidationDetails aD_IMAGE_9_LINK_WARNING;
    CatalogsItemValidationDetails aD_IMAGE_9_TAG_DUPLICATED;
    CatalogsItemValidationDetails aD_IMAGE_9_TAG_LENGTH_TOO_LONG;
    CatalogsItemValidationDetails aD_IMAGE_9_TAG_REQUIRED;
    CatalogsItemValidationDetails aD_LINK_FORMAT_WARNING;
    CatalogsItemValidationDetails aD_LINK_SAME_AS_LINK;
    CatalogsItemValidationDetails aD_VIDEO_0_LINK_DUPLICATED;
    CatalogsItemValidationDetails aD_VIDEO_0_LINK_LENGTH_TOO_LONG;
    CatalogsItemValidationDetails aD_VIDEO_0_LINK_REQUIRED;
    CatalogsItemValidationDetails aD_VIDEO_0_LINK_WARNING;
    CatalogsItemValidationDetails aD_VIDEO_0_TAG_DUPLICATED;
    CatalogsItemValidationDetails aD_VIDEO_0_TAG_LENGTH_TOO_LONG;
    CatalogsItemValidationDetails aD_VIDEO_0_TAG_REQUIRED;
    CatalogsItemValidationDetails aD_VIDEO_1_LINK_DUPLICATED;
    CatalogsItemValidationDetails aD_VIDEO_1_LINK_LENGTH_TOO_LONG;
    CatalogsItemValidationDetails aD_VIDEO_1_LINK_REQUIRED;
    CatalogsItemValidationDetails aD_VIDEO_1_LINK_WARNING;
    CatalogsItemValidationDetails aD_VIDEO_1_TAG_DUPLICATED;
    CatalogsItemValidationDetails aD_VIDEO_1_TAG_LENGTH_TOO_LONG;
    CatalogsItemValidationDetails aD_VIDEO_1_TAG_REQUIRED;
    CatalogsItemValidationDetails aD_VIDEO_2_LINK_DUPLICATED;
    CatalogsItemValidationDetails aD_VIDEO_2_LINK_LENGTH_TOO_LONG;
    CatalogsItemValidationDetails aD_VIDEO_2_LINK_REQUIRED;
    CatalogsItemValidationDetails aD_VIDEO_2_LINK_WARNING;
    CatalogsItemValidationDetails aD_VIDEO_2_TAG_DUPLICATED;
    CatalogsItemValidationDetails aD_VIDEO_2_TAG_LENGTH_TOO_LONG;
    CatalogsItemValidationDetails aD_VIDEO_2_TAG_REQUIRED;
    CatalogsItemValidationDetails aDDITIONAL_IMAGE_LINK_LENGTH_TOO_LONG;
    CatalogsItemValidationDetails aDDITIONAL_IMAGE_LINK_WARNING;
    CatalogsItemValidationDetails aDWORDS_FORMAT_WARNING;
    CatalogsItemValidationDetails aDWORDS_SAME_AS_LINK;
    CatalogsItemValidationDetails aGE_GROUP_INVALID;
    CatalogsItemValidationDetails aNDROID_DEEP_LINK_INVALID;
    CatalogsItemValidationDetails aVAILABILITY_DATE_INVALID;
    CatalogsItemValidationDetails cOUNTRY_DOES_NOT_MAP_TO_CURRENCY;
    CatalogsItemValidationDetails cUSTOM_LABEL_LENGTH_TOO_LONG;
    CatalogsItemValidationDetails dESCRIPTION_LENGTH_TOO_LONG;
    CatalogsItemValidationDetails eXPIRATION_DATE_INVALID;
    CatalogsItemValidationDetails gENDER_INVALID;
    CatalogsItemValidationDetails gTIN_INVALID;
    CatalogsItemValidationDetails iMAGE_LINK_WARNING;
    CatalogsItemValidationDetails iOS_DEEP_LINK_INVALID;
    CatalogsItemValidationDetails iS_BUNDLE_INVALID;
    CatalogsItemValidationDetails iTEM_ADDITIONAL_IMAGE_DOWNLOAD_FAILURE;
    CatalogsItemValidationDetails lINK_FORMAT_WARNING;
    CatalogsItemValidationDetails mIN_AD_PRICE_INVALID;
    CatalogsItemValidationDetails mPN_INVALID;
    CatalogsItemValidationDetails mULTIPACK_INVALID;
    CatalogsItemValidationDetails oPTIONAL_CONDITION_INVALID;
    CatalogsItemValidationDetails oPTIONAL_CONDITION_MISSING;
    CatalogsItemValidationDetails oPTIONAL_PRODUCT_CATEGORY_INVALID;
    CatalogsItemValidationDetails oPTIONAL_PRODUCT_CATEGORY_MISSING;
    CatalogsItemValidationDetails pRODUCT_CATEGORY_DEPTH_WARNING;
    CatalogsItemValidationDetails pRODUCT_TYPE_LENGTH_TOO_LONG;
    CatalogsItemValidationDetails sALE_DATE_INVALID;
    CatalogsItemValidationDetails sALES_PRICE_INVALID;
    CatalogsItemValidationDetails sALES_PRICE_TOO_HIGH;
    CatalogsItemValidationDetails sALES_PRICE_TOO_LOW;
    CatalogsItemValidationDetails sHIPPING_HEIGHT_INVALID;
    CatalogsItemValidationDetails sHIPPING_INVALID;
    CatalogsItemValidationDetails sHIPPING_WEIGHT_INVALID;
    CatalogsItemValidationDetails sHIPPING_WIDTH_INVALID;
    CatalogsItemValidationDetails sIZE_SYSTEM_INVALID;
    CatalogsItemValidationDetails sIZE_TYPE_INVALID;
    CatalogsItemValidationDetails tAX_INVALID;
    CatalogsItemValidationDetails tITLE_LENGTH_TOO_LONG;
    CatalogsItemValidationDetails tOO_MANY_ADDITIONAL_IMAGE_LINKS;
    CatalogsItemValidationDetails uTM_SOURCE_AUTO_CORRECTED;
    CatalogsItemValidationDetails vIDEO_REQUIRED_WHEN_AD_VIDEO_PROVIDED;
    CatalogsItemValidationDetails wEIGHT_UNIT_INVALID;
};
}

#endif /* TINY_CPP_CLIENT_CatalogsItemValidationWarnings_H_ */
