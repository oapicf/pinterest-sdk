/*
 * CatalogsItemValidationWarnings.h
 *
 * 
 */

#ifndef _CatalogsItemValidationWarnings_H_
#define _CatalogsItemValidationWarnings_H_


#include <string>
#include "CatalogsItemValidationDetails.h"
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

class CatalogsItemValidationWarnings : public Object {
public:
	/*! \brief Constructor.
	 */
	CatalogsItemValidationWarnings();
	CatalogsItemValidationWarnings(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CatalogsItemValidationWarnings();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get ad_image_0_link is duplicated with another ad image link.
	 */
	CatalogsItemValidationDetails getADIMAGE0LINKDUPLICATED();

	/*! \brief Set ad_image_0_link is duplicated with another ad image link.
	 */
	void setADIMAGE0LINKDUPLICATED(CatalogsItemValidationDetails  aD_IMAGE_0_LINK_DUPLICATED);
	/*! \brief Get Ad image link 0 length is too long. The maximum length is 2047 characters.
	 */
	CatalogsItemValidationDetails getADIMAGE0LINKLENGTHTOOLONG();

	/*! \brief Set Ad image link 0 length is too long. The maximum length is 2047 characters.
	 */
	void setADIMAGE0LINKLENGTHTOOLONG(CatalogsItemValidationDetails  aD_IMAGE_0_LINK_LENGTH_TOO_LONG);
	/*! \brief Get Ad image link 0 is required because an image tag was provided.
	 */
	CatalogsItemValidationDetails getADIMAGE0LINKREQUIRED();

	/*! \brief Set Ad image link 0 is required because an image tag was provided.
	 */
	void setADIMAGE0LINKREQUIRED(CatalogsItemValidationDetails  aD_IMAGE_0_LINK_REQUIRED);
	/*! \brief Get Ad image link 0 format is unsupported.
	 */
	CatalogsItemValidationDetails getADIMAGE0LINKWARNING();

	/*! \brief Set Ad image link 0 format is unsupported.
	 */
	void setADIMAGE0LINKWARNING(CatalogsItemValidationDetails  aD_IMAGE_0_LINK_WARNING);
	/*! \brief Get ad_image_0_tag is duplicated with another ad image tag.
	 */
	CatalogsItemValidationDetails getADIMAGE0TAGDUPLICATED();

	/*! \brief Set ad_image_0_tag is duplicated with another ad image tag.
	 */
	void setADIMAGE0TAGDUPLICATED(CatalogsItemValidationDetails  aD_IMAGE_0_TAG_DUPLICATED);
	/*! \brief Get Ad image tag 0 length is too long. The maximum length is 511 characters.
	 */
	CatalogsItemValidationDetails getADIMAGE0TAGLENGTHTOOLONG();

	/*! \brief Set Ad image tag 0 length is too long. The maximum length is 511 characters.
	 */
	void setADIMAGE0TAGLENGTHTOOLONG(CatalogsItemValidationDetails  aD_IMAGE_0_TAG_LENGTH_TOO_LONG);
	/*! \brief Get Ad image tag 0 is required because an image link was provided.
	 */
	CatalogsItemValidationDetails getADIMAGE0TAGREQUIRED();

	/*! \brief Set Ad image tag 0 is required because an image link was provided.
	 */
	void setADIMAGE0TAGREQUIRED(CatalogsItemValidationDetails  aD_IMAGE_0_TAG_REQUIRED);
	/*! \brief Get ad_image_10_link is duplicated with another ad image link.
	 */
	CatalogsItemValidationDetails getADIMAGE10LINKDUPLICATED();

	/*! \brief Set ad_image_10_link is duplicated with another ad image link.
	 */
	void setADIMAGE10LINKDUPLICATED(CatalogsItemValidationDetails  aD_IMAGE_10_LINK_DUPLICATED);
	/*! \brief Get Ad image link 10 length is too long. The maximum length is 2047 characters.
	 */
	CatalogsItemValidationDetails getADIMAGE10LINKLENGTHTOOLONG();

	/*! \brief Set Ad image link 10 length is too long. The maximum length is 2047 characters.
	 */
	void setADIMAGE10LINKLENGTHTOOLONG(CatalogsItemValidationDetails  aD_IMAGE_10_LINK_LENGTH_TOO_LONG);
	/*! \brief Get Ad image link 10 is required because an image tag was provided.
	 */
	CatalogsItemValidationDetails getADIMAGE10LINKREQUIRED();

	/*! \brief Set Ad image link 10 is required because an image tag was provided.
	 */
	void setADIMAGE10LINKREQUIRED(CatalogsItemValidationDetails  aD_IMAGE_10_LINK_REQUIRED);
	/*! \brief Get Ad image link 10 format is unsupported.
	 */
	CatalogsItemValidationDetails getADIMAGE10LINKWARNING();

	/*! \brief Set Ad image link 10 format is unsupported.
	 */
	void setADIMAGE10LINKWARNING(CatalogsItemValidationDetails  aD_IMAGE_10_LINK_WARNING);
	/*! \brief Get ad_image_10_tag is duplicated with another ad image tag.
	 */
	CatalogsItemValidationDetails getADIMAGE10TAGDUPLICATED();

	/*! \brief Set ad_image_10_tag is duplicated with another ad image tag.
	 */
	void setADIMAGE10TAGDUPLICATED(CatalogsItemValidationDetails  aD_IMAGE_10_TAG_DUPLICATED);
	/*! \brief Get Ad image tag 10 length is too long. The maximum length is 511 characters.
	 */
	CatalogsItemValidationDetails getADIMAGE10TAGLENGTHTOOLONG();

	/*! \brief Set Ad image tag 10 length is too long. The maximum length is 511 characters.
	 */
	void setADIMAGE10TAGLENGTHTOOLONG(CatalogsItemValidationDetails  aD_IMAGE_10_TAG_LENGTH_TOO_LONG);
	/*! \brief Get Ad image tag 10 is required because an image link was provided.
	 */
	CatalogsItemValidationDetails getADIMAGE10TAGREQUIRED();

	/*! \brief Set Ad image tag 10 is required because an image link was provided.
	 */
	void setADIMAGE10TAGREQUIRED(CatalogsItemValidationDetails  aD_IMAGE_10_TAG_REQUIRED);
	/*! \brief Get ad_image_11_link is duplicated with another ad image link.
	 */
	CatalogsItemValidationDetails getADIMAGE11LINKDUPLICATED();

	/*! \brief Set ad_image_11_link is duplicated with another ad image link.
	 */
	void setADIMAGE11LINKDUPLICATED(CatalogsItemValidationDetails  aD_IMAGE_11_LINK_DUPLICATED);
	/*! \brief Get Ad image link 11 length is too long. The maximum length is 2047 characters.
	 */
	CatalogsItemValidationDetails getADIMAGE11LINKLENGTHTOOLONG();

	/*! \brief Set Ad image link 11 length is too long. The maximum length is 2047 characters.
	 */
	void setADIMAGE11LINKLENGTHTOOLONG(CatalogsItemValidationDetails  aD_IMAGE_11_LINK_LENGTH_TOO_LONG);
	/*! \brief Get Ad image link 11 is required because an image tag was provided.
	 */
	CatalogsItemValidationDetails getADIMAGE11LINKREQUIRED();

	/*! \brief Set Ad image link 11 is required because an image tag was provided.
	 */
	void setADIMAGE11LINKREQUIRED(CatalogsItemValidationDetails  aD_IMAGE_11_LINK_REQUIRED);
	/*! \brief Get Ad image link 11 format is unsupported.
	 */
	CatalogsItemValidationDetails getADIMAGE11LINKWARNING();

	/*! \brief Set Ad image link 11 format is unsupported.
	 */
	void setADIMAGE11LINKWARNING(CatalogsItemValidationDetails  aD_IMAGE_11_LINK_WARNING);
	/*! \brief Get ad_image_11_tag is duplicated with another ad image tag.
	 */
	CatalogsItemValidationDetails getADIMAGE11TAGDUPLICATED();

	/*! \brief Set ad_image_11_tag is duplicated with another ad image tag.
	 */
	void setADIMAGE11TAGDUPLICATED(CatalogsItemValidationDetails  aD_IMAGE_11_TAG_DUPLICATED);
	/*! \brief Get Ad image tag 11 length is too long. The maximum length is 511 characters.
	 */
	CatalogsItemValidationDetails getADIMAGE11TAGLENGTHTOOLONG();

	/*! \brief Set Ad image tag 11 length is too long. The maximum length is 511 characters.
	 */
	void setADIMAGE11TAGLENGTHTOOLONG(CatalogsItemValidationDetails  aD_IMAGE_11_TAG_LENGTH_TOO_LONG);
	/*! \brief Get Ad image tag 11 is required because an image link was provided.
	 */
	CatalogsItemValidationDetails getADIMAGE11TAGREQUIRED();

	/*! \brief Set Ad image tag 11 is required because an image link was provided.
	 */
	void setADIMAGE11TAGREQUIRED(CatalogsItemValidationDetails  aD_IMAGE_11_TAG_REQUIRED);
	/*! \brief Get ad_image_12_link is duplicated with another ad image link.
	 */
	CatalogsItemValidationDetails getADIMAGE12LINKDUPLICATED();

	/*! \brief Set ad_image_12_link is duplicated with another ad image link.
	 */
	void setADIMAGE12LINKDUPLICATED(CatalogsItemValidationDetails  aD_IMAGE_12_LINK_DUPLICATED);
	/*! \brief Get Ad image link 12 length is too long. The maximum length is 2047 characters.
	 */
	CatalogsItemValidationDetails getADIMAGE12LINKLENGTHTOOLONG();

	/*! \brief Set Ad image link 12 length is too long. The maximum length is 2047 characters.
	 */
	void setADIMAGE12LINKLENGTHTOOLONG(CatalogsItemValidationDetails  aD_IMAGE_12_LINK_LENGTH_TOO_LONG);
	/*! \brief Get Ad image link 12 is required because an image tag was provided.
	 */
	CatalogsItemValidationDetails getADIMAGE12LINKREQUIRED();

	/*! \brief Set Ad image link 12 is required because an image tag was provided.
	 */
	void setADIMAGE12LINKREQUIRED(CatalogsItemValidationDetails  aD_IMAGE_12_LINK_REQUIRED);
	/*! \brief Get Ad image link 12 format is unsupported.
	 */
	CatalogsItemValidationDetails getADIMAGE12LINKWARNING();

	/*! \brief Set Ad image link 12 format is unsupported.
	 */
	void setADIMAGE12LINKWARNING(CatalogsItemValidationDetails  aD_IMAGE_12_LINK_WARNING);
	/*! \brief Get ad_image_12_tag is duplicated with another ad image tag.
	 */
	CatalogsItemValidationDetails getADIMAGE12TAGDUPLICATED();

	/*! \brief Set ad_image_12_tag is duplicated with another ad image tag.
	 */
	void setADIMAGE12TAGDUPLICATED(CatalogsItemValidationDetails  aD_IMAGE_12_TAG_DUPLICATED);
	/*! \brief Get Ad image tag 12 length is too long. The maximum length is 511 characters.
	 */
	CatalogsItemValidationDetails getADIMAGE12TAGLENGTHTOOLONG();

	/*! \brief Set Ad image tag 12 length is too long. The maximum length is 511 characters.
	 */
	void setADIMAGE12TAGLENGTHTOOLONG(CatalogsItemValidationDetails  aD_IMAGE_12_TAG_LENGTH_TOO_LONG);
	/*! \brief Get Ad image tag 12 is required because an image link was provided.
	 */
	CatalogsItemValidationDetails getADIMAGE12TAGREQUIRED();

	/*! \brief Set Ad image tag 12 is required because an image link was provided.
	 */
	void setADIMAGE12TAGREQUIRED(CatalogsItemValidationDetails  aD_IMAGE_12_TAG_REQUIRED);
	/*! \brief Get ad_image_13_link is duplicated with another ad image link.
	 */
	CatalogsItemValidationDetails getADIMAGE13LINKDUPLICATED();

	/*! \brief Set ad_image_13_link is duplicated with another ad image link.
	 */
	void setADIMAGE13LINKDUPLICATED(CatalogsItemValidationDetails  aD_IMAGE_13_LINK_DUPLICATED);
	/*! \brief Get Ad image link 13 length is too long. The maximum length is 2047 characters.
	 */
	CatalogsItemValidationDetails getADIMAGE13LINKLENGTHTOOLONG();

	/*! \brief Set Ad image link 13 length is too long. The maximum length is 2047 characters.
	 */
	void setADIMAGE13LINKLENGTHTOOLONG(CatalogsItemValidationDetails  aD_IMAGE_13_LINK_LENGTH_TOO_LONG);
	/*! \brief Get Ad image link 13 is required because an image tag was provided.
	 */
	CatalogsItemValidationDetails getADIMAGE13LINKREQUIRED();

	/*! \brief Set Ad image link 13 is required because an image tag was provided.
	 */
	void setADIMAGE13LINKREQUIRED(CatalogsItemValidationDetails  aD_IMAGE_13_LINK_REQUIRED);
	/*! \brief Get Ad image link 13 format is unsupported.
	 */
	CatalogsItemValidationDetails getADIMAGE13LINKWARNING();

	/*! \brief Set Ad image link 13 format is unsupported.
	 */
	void setADIMAGE13LINKWARNING(CatalogsItemValidationDetails  aD_IMAGE_13_LINK_WARNING);
	/*! \brief Get ad_image_13_tag is duplicated with another ad image tag.
	 */
	CatalogsItemValidationDetails getADIMAGE13TAGDUPLICATED();

	/*! \brief Set ad_image_13_tag is duplicated with another ad image tag.
	 */
	void setADIMAGE13TAGDUPLICATED(CatalogsItemValidationDetails  aD_IMAGE_13_TAG_DUPLICATED);
	/*! \brief Get Ad image tag 13 length is too long. The maximum length is 511 characters.
	 */
	CatalogsItemValidationDetails getADIMAGE13TAGLENGTHTOOLONG();

	/*! \brief Set Ad image tag 13 length is too long. The maximum length is 511 characters.
	 */
	void setADIMAGE13TAGLENGTHTOOLONG(CatalogsItemValidationDetails  aD_IMAGE_13_TAG_LENGTH_TOO_LONG);
	/*! \brief Get Ad image tag 13 is required because an image link was provided.
	 */
	CatalogsItemValidationDetails getADIMAGE13TAGREQUIRED();

	/*! \brief Set Ad image tag 13 is required because an image link was provided.
	 */
	void setADIMAGE13TAGREQUIRED(CatalogsItemValidationDetails  aD_IMAGE_13_TAG_REQUIRED);
	/*! \brief Get ad_image_14_link is duplicated with another ad image link.
	 */
	CatalogsItemValidationDetails getADIMAGE14LINKDUPLICATED();

	/*! \brief Set ad_image_14_link is duplicated with another ad image link.
	 */
	void setADIMAGE14LINKDUPLICATED(CatalogsItemValidationDetails  aD_IMAGE_14_LINK_DUPLICATED);
	/*! \brief Get Ad image link 14 length is too long. The maximum length is 2047 characters.
	 */
	CatalogsItemValidationDetails getADIMAGE14LINKLENGTHTOOLONG();

	/*! \brief Set Ad image link 14 length is too long. The maximum length is 2047 characters.
	 */
	void setADIMAGE14LINKLENGTHTOOLONG(CatalogsItemValidationDetails  aD_IMAGE_14_LINK_LENGTH_TOO_LONG);
	/*! \brief Get Ad image link 14 is required because an image tag was provided.
	 */
	CatalogsItemValidationDetails getADIMAGE14LINKREQUIRED();

	/*! \brief Set Ad image link 14 is required because an image tag was provided.
	 */
	void setADIMAGE14LINKREQUIRED(CatalogsItemValidationDetails  aD_IMAGE_14_LINK_REQUIRED);
	/*! \brief Get Ad image link 14 format is unsupported.
	 */
	CatalogsItemValidationDetails getADIMAGE14LINKWARNING();

	/*! \brief Set Ad image link 14 format is unsupported.
	 */
	void setADIMAGE14LINKWARNING(CatalogsItemValidationDetails  aD_IMAGE_14_LINK_WARNING);
	/*! \brief Get ad_image_14_tag is duplicated with another ad image tag.
	 */
	CatalogsItemValidationDetails getADIMAGE14TAGDUPLICATED();

	/*! \brief Set ad_image_14_tag is duplicated with another ad image tag.
	 */
	void setADIMAGE14TAGDUPLICATED(CatalogsItemValidationDetails  aD_IMAGE_14_TAG_DUPLICATED);
	/*! \brief Get Ad image tag 14 length is too long. The maximum length is 511 characters.
	 */
	CatalogsItemValidationDetails getADIMAGE14TAGLENGTHTOOLONG();

	/*! \brief Set Ad image tag 14 length is too long. The maximum length is 511 characters.
	 */
	void setADIMAGE14TAGLENGTHTOOLONG(CatalogsItemValidationDetails  aD_IMAGE_14_TAG_LENGTH_TOO_LONG);
	/*! \brief Get Ad image tag 14 is required because an image link was provided.
	 */
	CatalogsItemValidationDetails getADIMAGE14TAGREQUIRED();

	/*! \brief Set Ad image tag 14 is required because an image link was provided.
	 */
	void setADIMAGE14TAGREQUIRED(CatalogsItemValidationDetails  aD_IMAGE_14_TAG_REQUIRED);
	/*! \brief Get ad_image_15_link is duplicated with another ad image link.
	 */
	CatalogsItemValidationDetails getADIMAGE15LINKDUPLICATED();

	/*! \brief Set ad_image_15_link is duplicated with another ad image link.
	 */
	void setADIMAGE15LINKDUPLICATED(CatalogsItemValidationDetails  aD_IMAGE_15_LINK_DUPLICATED);
	/*! \brief Get Ad image link 15 length is too long. The maximum length is 2047 characters.
	 */
	CatalogsItemValidationDetails getADIMAGE15LINKLENGTHTOOLONG();

	/*! \brief Set Ad image link 15 length is too long. The maximum length is 2047 characters.
	 */
	void setADIMAGE15LINKLENGTHTOOLONG(CatalogsItemValidationDetails  aD_IMAGE_15_LINK_LENGTH_TOO_LONG);
	/*! \brief Get Ad image link 15 is required because an image tag was provided.
	 */
	CatalogsItemValidationDetails getADIMAGE15LINKREQUIRED();

	/*! \brief Set Ad image link 15 is required because an image tag was provided.
	 */
	void setADIMAGE15LINKREQUIRED(CatalogsItemValidationDetails  aD_IMAGE_15_LINK_REQUIRED);
	/*! \brief Get Ad image link 15 format is unsupported.
	 */
	CatalogsItemValidationDetails getADIMAGE15LINKWARNING();

	/*! \brief Set Ad image link 15 format is unsupported.
	 */
	void setADIMAGE15LINKWARNING(CatalogsItemValidationDetails  aD_IMAGE_15_LINK_WARNING);
	/*! \brief Get ad_image_15_tag is duplicated with another ad image tag.
	 */
	CatalogsItemValidationDetails getADIMAGE15TAGDUPLICATED();

	/*! \brief Set ad_image_15_tag is duplicated with another ad image tag.
	 */
	void setADIMAGE15TAGDUPLICATED(CatalogsItemValidationDetails  aD_IMAGE_15_TAG_DUPLICATED);
	/*! \brief Get Ad image tag 15 length is too long. The maximum length is 511 characters.
	 */
	CatalogsItemValidationDetails getADIMAGE15TAGLENGTHTOOLONG();

	/*! \brief Set Ad image tag 15 length is too long. The maximum length is 511 characters.
	 */
	void setADIMAGE15TAGLENGTHTOOLONG(CatalogsItemValidationDetails  aD_IMAGE_15_TAG_LENGTH_TOO_LONG);
	/*! \brief Get Ad image tag 15 is required because an image link was provided.
	 */
	CatalogsItemValidationDetails getADIMAGE15TAGREQUIRED();

	/*! \brief Set Ad image tag 15 is required because an image link was provided.
	 */
	void setADIMAGE15TAGREQUIRED(CatalogsItemValidationDetails  aD_IMAGE_15_TAG_REQUIRED);
	/*! \brief Get ad_image_16_link is duplicated with another ad image link.
	 */
	CatalogsItemValidationDetails getADIMAGE16LINKDUPLICATED();

	/*! \brief Set ad_image_16_link is duplicated with another ad image link.
	 */
	void setADIMAGE16LINKDUPLICATED(CatalogsItemValidationDetails  aD_IMAGE_16_LINK_DUPLICATED);
	/*! \brief Get Ad image link 16 length is too long. The maximum length is 2047 characters.
	 */
	CatalogsItemValidationDetails getADIMAGE16LINKLENGTHTOOLONG();

	/*! \brief Set Ad image link 16 length is too long. The maximum length is 2047 characters.
	 */
	void setADIMAGE16LINKLENGTHTOOLONG(CatalogsItemValidationDetails  aD_IMAGE_16_LINK_LENGTH_TOO_LONG);
	/*! \brief Get Ad image link 16 is required because an image tag was provided.
	 */
	CatalogsItemValidationDetails getADIMAGE16LINKREQUIRED();

	/*! \brief Set Ad image link 16 is required because an image tag was provided.
	 */
	void setADIMAGE16LINKREQUIRED(CatalogsItemValidationDetails  aD_IMAGE_16_LINK_REQUIRED);
	/*! \brief Get Ad image link 16 format is unsupported.
	 */
	CatalogsItemValidationDetails getADIMAGE16LINKWARNING();

	/*! \brief Set Ad image link 16 format is unsupported.
	 */
	void setADIMAGE16LINKWARNING(CatalogsItemValidationDetails  aD_IMAGE_16_LINK_WARNING);
	/*! \brief Get ad_image_16_tag is duplicated with another ad image tag.
	 */
	CatalogsItemValidationDetails getADIMAGE16TAGDUPLICATED();

	/*! \brief Set ad_image_16_tag is duplicated with another ad image tag.
	 */
	void setADIMAGE16TAGDUPLICATED(CatalogsItemValidationDetails  aD_IMAGE_16_TAG_DUPLICATED);
	/*! \brief Get Ad image tag 16 length is too long. The maximum length is 511 characters.
	 */
	CatalogsItemValidationDetails getADIMAGE16TAGLENGTHTOOLONG();

	/*! \brief Set Ad image tag 16 length is too long. The maximum length is 511 characters.
	 */
	void setADIMAGE16TAGLENGTHTOOLONG(CatalogsItemValidationDetails  aD_IMAGE_16_TAG_LENGTH_TOO_LONG);
	/*! \brief Get Ad image tag 16 is required because an image link was provided.
	 */
	CatalogsItemValidationDetails getADIMAGE16TAGREQUIRED();

	/*! \brief Set Ad image tag 16 is required because an image link was provided.
	 */
	void setADIMAGE16TAGREQUIRED(CatalogsItemValidationDetails  aD_IMAGE_16_TAG_REQUIRED);
	/*! \brief Get ad_image_17_link is duplicated with another ad image link.
	 */
	CatalogsItemValidationDetails getADIMAGE17LINKDUPLICATED();

	/*! \brief Set ad_image_17_link is duplicated with another ad image link.
	 */
	void setADIMAGE17LINKDUPLICATED(CatalogsItemValidationDetails  aD_IMAGE_17_LINK_DUPLICATED);
	/*! \brief Get Ad image link 17 length is too long. The maximum length is 2047 characters.
	 */
	CatalogsItemValidationDetails getADIMAGE17LINKLENGTHTOOLONG();

	/*! \brief Set Ad image link 17 length is too long. The maximum length is 2047 characters.
	 */
	void setADIMAGE17LINKLENGTHTOOLONG(CatalogsItemValidationDetails  aD_IMAGE_17_LINK_LENGTH_TOO_LONG);
	/*! \brief Get Ad image link 17 is required because an image tag was provided.
	 */
	CatalogsItemValidationDetails getADIMAGE17LINKREQUIRED();

	/*! \brief Set Ad image link 17 is required because an image tag was provided.
	 */
	void setADIMAGE17LINKREQUIRED(CatalogsItemValidationDetails  aD_IMAGE_17_LINK_REQUIRED);
	/*! \brief Get Ad image link 17 format is unsupported.
	 */
	CatalogsItemValidationDetails getADIMAGE17LINKWARNING();

	/*! \brief Set Ad image link 17 format is unsupported.
	 */
	void setADIMAGE17LINKWARNING(CatalogsItemValidationDetails  aD_IMAGE_17_LINK_WARNING);
	/*! \brief Get ad_image_17_tag is duplicated with another ad image tag.
	 */
	CatalogsItemValidationDetails getADIMAGE17TAGDUPLICATED();

	/*! \brief Set ad_image_17_tag is duplicated with another ad image tag.
	 */
	void setADIMAGE17TAGDUPLICATED(CatalogsItemValidationDetails  aD_IMAGE_17_TAG_DUPLICATED);
	/*! \brief Get Ad image tag 17 length is too long. The maximum length is 511 characters.
	 */
	CatalogsItemValidationDetails getADIMAGE17TAGLENGTHTOOLONG();

	/*! \brief Set Ad image tag 17 length is too long. The maximum length is 511 characters.
	 */
	void setADIMAGE17TAGLENGTHTOOLONG(CatalogsItemValidationDetails  aD_IMAGE_17_TAG_LENGTH_TOO_LONG);
	/*! \brief Get Ad image tag 17 is required because an image link was provided.
	 */
	CatalogsItemValidationDetails getADIMAGE17TAGREQUIRED();

	/*! \brief Set Ad image tag 17 is required because an image link was provided.
	 */
	void setADIMAGE17TAGREQUIRED(CatalogsItemValidationDetails  aD_IMAGE_17_TAG_REQUIRED);
	/*! \brief Get ad_image_18_link is duplicated with another ad image link.
	 */
	CatalogsItemValidationDetails getADIMAGE18LINKDUPLICATED();

	/*! \brief Set ad_image_18_link is duplicated with another ad image link.
	 */
	void setADIMAGE18LINKDUPLICATED(CatalogsItemValidationDetails  aD_IMAGE_18_LINK_DUPLICATED);
	/*! \brief Get Ad image link 18 length is too long. The maximum length is 2047 characters.
	 */
	CatalogsItemValidationDetails getADIMAGE18LINKLENGTHTOOLONG();

	/*! \brief Set Ad image link 18 length is too long. The maximum length is 2047 characters.
	 */
	void setADIMAGE18LINKLENGTHTOOLONG(CatalogsItemValidationDetails  aD_IMAGE_18_LINK_LENGTH_TOO_LONG);
	/*! \brief Get Ad image link 18 is required because an image tag was provided.
	 */
	CatalogsItemValidationDetails getADIMAGE18LINKREQUIRED();

	/*! \brief Set Ad image link 18 is required because an image tag was provided.
	 */
	void setADIMAGE18LINKREQUIRED(CatalogsItemValidationDetails  aD_IMAGE_18_LINK_REQUIRED);
	/*! \brief Get Ad image link 18 format is unsupported.
	 */
	CatalogsItemValidationDetails getADIMAGE18LINKWARNING();

	/*! \brief Set Ad image link 18 format is unsupported.
	 */
	void setADIMAGE18LINKWARNING(CatalogsItemValidationDetails  aD_IMAGE_18_LINK_WARNING);
	/*! \brief Get ad_image_18_tag is duplicated with another ad image tag.
	 */
	CatalogsItemValidationDetails getADIMAGE18TAGDUPLICATED();

	/*! \brief Set ad_image_18_tag is duplicated with another ad image tag.
	 */
	void setADIMAGE18TAGDUPLICATED(CatalogsItemValidationDetails  aD_IMAGE_18_TAG_DUPLICATED);
	/*! \brief Get Ad image tag 18 length is too long. The maximum length is 511 characters.
	 */
	CatalogsItemValidationDetails getADIMAGE18TAGLENGTHTOOLONG();

	/*! \brief Set Ad image tag 18 length is too long. The maximum length is 511 characters.
	 */
	void setADIMAGE18TAGLENGTHTOOLONG(CatalogsItemValidationDetails  aD_IMAGE_18_TAG_LENGTH_TOO_LONG);
	/*! \brief Get Ad image tag 18 is required because an image link was provided.
	 */
	CatalogsItemValidationDetails getADIMAGE18TAGREQUIRED();

	/*! \brief Set Ad image tag 18 is required because an image link was provided.
	 */
	void setADIMAGE18TAGREQUIRED(CatalogsItemValidationDetails  aD_IMAGE_18_TAG_REQUIRED);
	/*! \brief Get ad_image_19_link is duplicated with another ad image link.
	 */
	CatalogsItemValidationDetails getADIMAGE19LINKDUPLICATED();

	/*! \brief Set ad_image_19_link is duplicated with another ad image link.
	 */
	void setADIMAGE19LINKDUPLICATED(CatalogsItemValidationDetails  aD_IMAGE_19_LINK_DUPLICATED);
	/*! \brief Get Ad image link 19 length is too long. The maximum length is 2047 characters.
	 */
	CatalogsItemValidationDetails getADIMAGE19LINKLENGTHTOOLONG();

	/*! \brief Set Ad image link 19 length is too long. The maximum length is 2047 characters.
	 */
	void setADIMAGE19LINKLENGTHTOOLONG(CatalogsItemValidationDetails  aD_IMAGE_19_LINK_LENGTH_TOO_LONG);
	/*! \brief Get Ad image link 19 is required because an image tag was provided.
	 */
	CatalogsItemValidationDetails getADIMAGE19LINKREQUIRED();

	/*! \brief Set Ad image link 19 is required because an image tag was provided.
	 */
	void setADIMAGE19LINKREQUIRED(CatalogsItemValidationDetails  aD_IMAGE_19_LINK_REQUIRED);
	/*! \brief Get Ad image link 19 format is unsupported.
	 */
	CatalogsItemValidationDetails getADIMAGE19LINKWARNING();

	/*! \brief Set Ad image link 19 format is unsupported.
	 */
	void setADIMAGE19LINKWARNING(CatalogsItemValidationDetails  aD_IMAGE_19_LINK_WARNING);
	/*! \brief Get ad_image_19_tag is duplicated with another ad image tag.
	 */
	CatalogsItemValidationDetails getADIMAGE19TAGDUPLICATED();

	/*! \brief Set ad_image_19_tag is duplicated with another ad image tag.
	 */
	void setADIMAGE19TAGDUPLICATED(CatalogsItemValidationDetails  aD_IMAGE_19_TAG_DUPLICATED);
	/*! \brief Get Ad image tag 19 length is too long. The maximum length is 511 characters.
	 */
	CatalogsItemValidationDetails getADIMAGE19TAGLENGTHTOOLONG();

	/*! \brief Set Ad image tag 19 length is too long. The maximum length is 511 characters.
	 */
	void setADIMAGE19TAGLENGTHTOOLONG(CatalogsItemValidationDetails  aD_IMAGE_19_TAG_LENGTH_TOO_LONG);
	/*! \brief Get Ad image tag 19 is required because an image link was provided.
	 */
	CatalogsItemValidationDetails getADIMAGE19TAGREQUIRED();

	/*! \brief Set Ad image tag 19 is required because an image link was provided.
	 */
	void setADIMAGE19TAGREQUIRED(CatalogsItemValidationDetails  aD_IMAGE_19_TAG_REQUIRED);
	/*! \brief Get ad_image_1_link is duplicated with another ad image link.
	 */
	CatalogsItemValidationDetails getADIMAGE1LINKDUPLICATED();

	/*! \brief Set ad_image_1_link is duplicated with another ad image link.
	 */
	void setADIMAGE1LINKDUPLICATED(CatalogsItemValidationDetails  aD_IMAGE_1_LINK_DUPLICATED);
	/*! \brief Get Ad image link 1 length is too long. The maximum length is 2047 characters.
	 */
	CatalogsItemValidationDetails getADIMAGE1LINKLENGTHTOOLONG();

	/*! \brief Set Ad image link 1 length is too long. The maximum length is 2047 characters.
	 */
	void setADIMAGE1LINKLENGTHTOOLONG(CatalogsItemValidationDetails  aD_IMAGE_1_LINK_LENGTH_TOO_LONG);
	/*! \brief Get Ad image link 1 is required because an image tag was provided.
	 */
	CatalogsItemValidationDetails getADIMAGE1LINKREQUIRED();

	/*! \brief Set Ad image link 1 is required because an image tag was provided.
	 */
	void setADIMAGE1LINKREQUIRED(CatalogsItemValidationDetails  aD_IMAGE_1_LINK_REQUIRED);
	/*! \brief Get Ad image link 1 format is unsupported.
	 */
	CatalogsItemValidationDetails getADIMAGE1LINKWARNING();

	/*! \brief Set Ad image link 1 format is unsupported.
	 */
	void setADIMAGE1LINKWARNING(CatalogsItemValidationDetails  aD_IMAGE_1_LINK_WARNING);
	/*! \brief Get ad_image_1_tag is duplicated with another ad image tag.
	 */
	CatalogsItemValidationDetails getADIMAGE1TAGDUPLICATED();

	/*! \brief Set ad_image_1_tag is duplicated with another ad image tag.
	 */
	void setADIMAGE1TAGDUPLICATED(CatalogsItemValidationDetails  aD_IMAGE_1_TAG_DUPLICATED);
	/*! \brief Get Ad image tag 1 length is too long. The maximum length is 511 characters.
	 */
	CatalogsItemValidationDetails getADIMAGE1TAGLENGTHTOOLONG();

	/*! \brief Set Ad image tag 1 length is too long. The maximum length is 511 characters.
	 */
	void setADIMAGE1TAGLENGTHTOOLONG(CatalogsItemValidationDetails  aD_IMAGE_1_TAG_LENGTH_TOO_LONG);
	/*! \brief Get Ad image tag 1 is required because an image link was provided.
	 */
	CatalogsItemValidationDetails getADIMAGE1TAGREQUIRED();

	/*! \brief Set Ad image tag 1 is required because an image link was provided.
	 */
	void setADIMAGE1TAGREQUIRED(CatalogsItemValidationDetails  aD_IMAGE_1_TAG_REQUIRED);
	/*! \brief Get ad_image_2_link is duplicated with another ad image link.
	 */
	CatalogsItemValidationDetails getADIMAGE2LINKDUPLICATED();

	/*! \brief Set ad_image_2_link is duplicated with another ad image link.
	 */
	void setADIMAGE2LINKDUPLICATED(CatalogsItemValidationDetails  aD_IMAGE_2_LINK_DUPLICATED);
	/*! \brief Get Ad image link 2 length is too long. The maximum length is 2047 characters.
	 */
	CatalogsItemValidationDetails getADIMAGE2LINKLENGTHTOOLONG();

	/*! \brief Set Ad image link 2 length is too long. The maximum length is 2047 characters.
	 */
	void setADIMAGE2LINKLENGTHTOOLONG(CatalogsItemValidationDetails  aD_IMAGE_2_LINK_LENGTH_TOO_LONG);
	/*! \brief Get Ad image link 2 is required because an image tag was provided.
	 */
	CatalogsItemValidationDetails getADIMAGE2LINKREQUIRED();

	/*! \brief Set Ad image link 2 is required because an image tag was provided.
	 */
	void setADIMAGE2LINKREQUIRED(CatalogsItemValidationDetails  aD_IMAGE_2_LINK_REQUIRED);
	/*! \brief Get Ad image link 2 format is unsupported.
	 */
	CatalogsItemValidationDetails getADIMAGE2LINKWARNING();

	/*! \brief Set Ad image link 2 format is unsupported.
	 */
	void setADIMAGE2LINKWARNING(CatalogsItemValidationDetails  aD_IMAGE_2_LINK_WARNING);
	/*! \brief Get ad_image_2_tag is duplicated with another ad image tag.
	 */
	CatalogsItemValidationDetails getADIMAGE2TAGDUPLICATED();

	/*! \brief Set ad_image_2_tag is duplicated with another ad image tag.
	 */
	void setADIMAGE2TAGDUPLICATED(CatalogsItemValidationDetails  aD_IMAGE_2_TAG_DUPLICATED);
	/*! \brief Get Ad image tag 2 length is too long. The maximum length is 511 characters.
	 */
	CatalogsItemValidationDetails getADIMAGE2TAGLENGTHTOOLONG();

	/*! \brief Set Ad image tag 2 length is too long. The maximum length is 511 characters.
	 */
	void setADIMAGE2TAGLENGTHTOOLONG(CatalogsItemValidationDetails  aD_IMAGE_2_TAG_LENGTH_TOO_LONG);
	/*! \brief Get Ad image tag 2 is required because an image link was provided.
	 */
	CatalogsItemValidationDetails getADIMAGE2TAGREQUIRED();

	/*! \brief Set Ad image tag 2 is required because an image link was provided.
	 */
	void setADIMAGE2TAGREQUIRED(CatalogsItemValidationDetails  aD_IMAGE_2_TAG_REQUIRED);
	/*! \brief Get ad_image_3_link is duplicated with another ad image link.
	 */
	CatalogsItemValidationDetails getADIMAGE3LINKDUPLICATED();

	/*! \brief Set ad_image_3_link is duplicated with another ad image link.
	 */
	void setADIMAGE3LINKDUPLICATED(CatalogsItemValidationDetails  aD_IMAGE_3_LINK_DUPLICATED);
	/*! \brief Get Ad image link 3 length is too long. The maximum length is 2047 characters.
	 */
	CatalogsItemValidationDetails getADIMAGE3LINKLENGTHTOOLONG();

	/*! \brief Set Ad image link 3 length is too long. The maximum length is 2047 characters.
	 */
	void setADIMAGE3LINKLENGTHTOOLONG(CatalogsItemValidationDetails  aD_IMAGE_3_LINK_LENGTH_TOO_LONG);
	/*! \brief Get Ad image link 3 is required because an image tag was provided.
	 */
	CatalogsItemValidationDetails getADIMAGE3LINKREQUIRED();

	/*! \brief Set Ad image link 3 is required because an image tag was provided.
	 */
	void setADIMAGE3LINKREQUIRED(CatalogsItemValidationDetails  aD_IMAGE_3_LINK_REQUIRED);
	/*! \brief Get Ad image link 3 format is unsupported.
	 */
	CatalogsItemValidationDetails getADIMAGE3LINKWARNING();

	/*! \brief Set Ad image link 3 format is unsupported.
	 */
	void setADIMAGE3LINKWARNING(CatalogsItemValidationDetails  aD_IMAGE_3_LINK_WARNING);
	/*! \brief Get ad_image_3_tag is duplicated with another ad image tag.
	 */
	CatalogsItemValidationDetails getADIMAGE3TAGDUPLICATED();

	/*! \brief Set ad_image_3_tag is duplicated with another ad image tag.
	 */
	void setADIMAGE3TAGDUPLICATED(CatalogsItemValidationDetails  aD_IMAGE_3_TAG_DUPLICATED);
	/*! \brief Get Ad image tag 3 length is too long. The maximum length is 511 characters.
	 */
	CatalogsItemValidationDetails getADIMAGE3TAGLENGTHTOOLONG();

	/*! \brief Set Ad image tag 3 length is too long. The maximum length is 511 characters.
	 */
	void setADIMAGE3TAGLENGTHTOOLONG(CatalogsItemValidationDetails  aD_IMAGE_3_TAG_LENGTH_TOO_LONG);
	/*! \brief Get Ad image tag 3 is required because an image link was provided.
	 */
	CatalogsItemValidationDetails getADIMAGE3TAGREQUIRED();

	/*! \brief Set Ad image tag 3 is required because an image link was provided.
	 */
	void setADIMAGE3TAGREQUIRED(CatalogsItemValidationDetails  aD_IMAGE_3_TAG_REQUIRED);
	/*! \brief Get ad_image_4_link is duplicated with another ad image link.
	 */
	CatalogsItemValidationDetails getADIMAGE4LINKDUPLICATED();

	/*! \brief Set ad_image_4_link is duplicated with another ad image link.
	 */
	void setADIMAGE4LINKDUPLICATED(CatalogsItemValidationDetails  aD_IMAGE_4_LINK_DUPLICATED);
	/*! \brief Get Ad image link 4 length is too long. The maximum length is 2047 characters.
	 */
	CatalogsItemValidationDetails getADIMAGE4LINKLENGTHTOOLONG();

	/*! \brief Set Ad image link 4 length is too long. The maximum length is 2047 characters.
	 */
	void setADIMAGE4LINKLENGTHTOOLONG(CatalogsItemValidationDetails  aD_IMAGE_4_LINK_LENGTH_TOO_LONG);
	/*! \brief Get Ad image link 4 is required because an image tag was provided.
	 */
	CatalogsItemValidationDetails getADIMAGE4LINKREQUIRED();

	/*! \brief Set Ad image link 4 is required because an image tag was provided.
	 */
	void setADIMAGE4LINKREQUIRED(CatalogsItemValidationDetails  aD_IMAGE_4_LINK_REQUIRED);
	/*! \brief Get Ad image link 4 format is unsupported.
	 */
	CatalogsItemValidationDetails getADIMAGE4LINKWARNING();

	/*! \brief Set Ad image link 4 format is unsupported.
	 */
	void setADIMAGE4LINKWARNING(CatalogsItemValidationDetails  aD_IMAGE_4_LINK_WARNING);
	/*! \brief Get ad_image_4_tag is duplicated with another ad image tag.
	 */
	CatalogsItemValidationDetails getADIMAGE4TAGDUPLICATED();

	/*! \brief Set ad_image_4_tag is duplicated with another ad image tag.
	 */
	void setADIMAGE4TAGDUPLICATED(CatalogsItemValidationDetails  aD_IMAGE_4_TAG_DUPLICATED);
	/*! \brief Get Ad image tag 4 length is too long. The maximum length is 511 characters.
	 */
	CatalogsItemValidationDetails getADIMAGE4TAGLENGTHTOOLONG();

	/*! \brief Set Ad image tag 4 length is too long. The maximum length is 511 characters.
	 */
	void setADIMAGE4TAGLENGTHTOOLONG(CatalogsItemValidationDetails  aD_IMAGE_4_TAG_LENGTH_TOO_LONG);
	/*! \brief Get Ad image tag 4 is required because an image link was provided.
	 */
	CatalogsItemValidationDetails getADIMAGE4TAGREQUIRED();

	/*! \brief Set Ad image tag 4 is required because an image link was provided.
	 */
	void setADIMAGE4TAGREQUIRED(CatalogsItemValidationDetails  aD_IMAGE_4_TAG_REQUIRED);
	/*! \brief Get ad_image_5_link is duplicated with another ad image link.
	 */
	CatalogsItemValidationDetails getADIMAGE5LINKDUPLICATED();

	/*! \brief Set ad_image_5_link is duplicated with another ad image link.
	 */
	void setADIMAGE5LINKDUPLICATED(CatalogsItemValidationDetails  aD_IMAGE_5_LINK_DUPLICATED);
	/*! \brief Get Ad image link 5 length is too long. The maximum length is 2047 characters.
	 */
	CatalogsItemValidationDetails getADIMAGE5LINKLENGTHTOOLONG();

	/*! \brief Set Ad image link 5 length is too long. The maximum length is 2047 characters.
	 */
	void setADIMAGE5LINKLENGTHTOOLONG(CatalogsItemValidationDetails  aD_IMAGE_5_LINK_LENGTH_TOO_LONG);
	/*! \brief Get Ad image link 5 is required because an image tag was provided.
	 */
	CatalogsItemValidationDetails getADIMAGE5LINKREQUIRED();

	/*! \brief Set Ad image link 5 is required because an image tag was provided.
	 */
	void setADIMAGE5LINKREQUIRED(CatalogsItemValidationDetails  aD_IMAGE_5_LINK_REQUIRED);
	/*! \brief Get Ad image link 5 format is unsupported.
	 */
	CatalogsItemValidationDetails getADIMAGE5LINKWARNING();

	/*! \brief Set Ad image link 5 format is unsupported.
	 */
	void setADIMAGE5LINKWARNING(CatalogsItemValidationDetails  aD_IMAGE_5_LINK_WARNING);
	/*! \brief Get ad_image_5_tag is duplicated with another ad image tag.
	 */
	CatalogsItemValidationDetails getADIMAGE5TAGDUPLICATED();

	/*! \brief Set ad_image_5_tag is duplicated with another ad image tag.
	 */
	void setADIMAGE5TAGDUPLICATED(CatalogsItemValidationDetails  aD_IMAGE_5_TAG_DUPLICATED);
	/*! \brief Get Ad image tag 5 length is too long. The maximum length is 511 characters.
	 */
	CatalogsItemValidationDetails getADIMAGE5TAGLENGTHTOOLONG();

	/*! \brief Set Ad image tag 5 length is too long. The maximum length is 511 characters.
	 */
	void setADIMAGE5TAGLENGTHTOOLONG(CatalogsItemValidationDetails  aD_IMAGE_5_TAG_LENGTH_TOO_LONG);
	/*! \brief Get Ad image tag 5 is required because an image link was provided.
	 */
	CatalogsItemValidationDetails getADIMAGE5TAGREQUIRED();

	/*! \brief Set Ad image tag 5 is required because an image link was provided.
	 */
	void setADIMAGE5TAGREQUIRED(CatalogsItemValidationDetails  aD_IMAGE_5_TAG_REQUIRED);
	/*! \brief Get ad_image_6_link is duplicated with another ad image link.
	 */
	CatalogsItemValidationDetails getADIMAGE6LINKDUPLICATED();

	/*! \brief Set ad_image_6_link is duplicated with another ad image link.
	 */
	void setADIMAGE6LINKDUPLICATED(CatalogsItemValidationDetails  aD_IMAGE_6_LINK_DUPLICATED);
	/*! \brief Get Ad image link 6 length is too long. The maximum length is 2047 characters.
	 */
	CatalogsItemValidationDetails getADIMAGE6LINKLENGTHTOOLONG();

	/*! \brief Set Ad image link 6 length is too long. The maximum length is 2047 characters.
	 */
	void setADIMAGE6LINKLENGTHTOOLONG(CatalogsItemValidationDetails  aD_IMAGE_6_LINK_LENGTH_TOO_LONG);
	/*! \brief Get Ad image link 6 is required because an image tag was provided.
	 */
	CatalogsItemValidationDetails getADIMAGE6LINKREQUIRED();

	/*! \brief Set Ad image link 6 is required because an image tag was provided.
	 */
	void setADIMAGE6LINKREQUIRED(CatalogsItemValidationDetails  aD_IMAGE_6_LINK_REQUIRED);
	/*! \brief Get Ad image link 6 format is unsupported.
	 */
	CatalogsItemValidationDetails getADIMAGE6LINKWARNING();

	/*! \brief Set Ad image link 6 format is unsupported.
	 */
	void setADIMAGE6LINKWARNING(CatalogsItemValidationDetails  aD_IMAGE_6_LINK_WARNING);
	/*! \brief Get ad_image_6_tag is duplicated with another ad image tag.
	 */
	CatalogsItemValidationDetails getADIMAGE6TAGDUPLICATED();

	/*! \brief Set ad_image_6_tag is duplicated with another ad image tag.
	 */
	void setADIMAGE6TAGDUPLICATED(CatalogsItemValidationDetails  aD_IMAGE_6_TAG_DUPLICATED);
	/*! \brief Get Ad image tag 6 length is too long. The maximum length is 511 characters.
	 */
	CatalogsItemValidationDetails getADIMAGE6TAGLENGTHTOOLONG();

	/*! \brief Set Ad image tag 6 length is too long. The maximum length is 511 characters.
	 */
	void setADIMAGE6TAGLENGTHTOOLONG(CatalogsItemValidationDetails  aD_IMAGE_6_TAG_LENGTH_TOO_LONG);
	/*! \brief Get Ad image tag 6 is required because an image link was provided.
	 */
	CatalogsItemValidationDetails getADIMAGE6TAGREQUIRED();

	/*! \brief Set Ad image tag 6 is required because an image link was provided.
	 */
	void setADIMAGE6TAGREQUIRED(CatalogsItemValidationDetails  aD_IMAGE_6_TAG_REQUIRED);
	/*! \brief Get ad_image_7_link is duplicated with another ad image link.
	 */
	CatalogsItemValidationDetails getADIMAGE7LINKDUPLICATED();

	/*! \brief Set ad_image_7_link is duplicated with another ad image link.
	 */
	void setADIMAGE7LINKDUPLICATED(CatalogsItemValidationDetails  aD_IMAGE_7_LINK_DUPLICATED);
	/*! \brief Get Ad image link 7 length is too long. The maximum length is 2047 characters.
	 */
	CatalogsItemValidationDetails getADIMAGE7LINKLENGTHTOOLONG();

	/*! \brief Set Ad image link 7 length is too long. The maximum length is 2047 characters.
	 */
	void setADIMAGE7LINKLENGTHTOOLONG(CatalogsItemValidationDetails  aD_IMAGE_7_LINK_LENGTH_TOO_LONG);
	/*! \brief Get Ad image link 7 is required because an image tag was provided.
	 */
	CatalogsItemValidationDetails getADIMAGE7LINKREQUIRED();

	/*! \brief Set Ad image link 7 is required because an image tag was provided.
	 */
	void setADIMAGE7LINKREQUIRED(CatalogsItemValidationDetails  aD_IMAGE_7_LINK_REQUIRED);
	/*! \brief Get Ad image link 7 format is unsupported.
	 */
	CatalogsItemValidationDetails getADIMAGE7LINKWARNING();

	/*! \brief Set Ad image link 7 format is unsupported.
	 */
	void setADIMAGE7LINKWARNING(CatalogsItemValidationDetails  aD_IMAGE_7_LINK_WARNING);
	/*! \brief Get ad_image_7_tag is duplicated with another ad image tag.
	 */
	CatalogsItemValidationDetails getADIMAGE7TAGDUPLICATED();

	/*! \brief Set ad_image_7_tag is duplicated with another ad image tag.
	 */
	void setADIMAGE7TAGDUPLICATED(CatalogsItemValidationDetails  aD_IMAGE_7_TAG_DUPLICATED);
	/*! \brief Get Ad image tag 7 length is too long. The maximum length is 511 characters.
	 */
	CatalogsItemValidationDetails getADIMAGE7TAGLENGTHTOOLONG();

	/*! \brief Set Ad image tag 7 length is too long. The maximum length is 511 characters.
	 */
	void setADIMAGE7TAGLENGTHTOOLONG(CatalogsItemValidationDetails  aD_IMAGE_7_TAG_LENGTH_TOO_LONG);
	/*! \brief Get Ad image tag 7 is required because an image link was provided.
	 */
	CatalogsItemValidationDetails getADIMAGE7TAGREQUIRED();

	/*! \brief Set Ad image tag 7 is required because an image link was provided.
	 */
	void setADIMAGE7TAGREQUIRED(CatalogsItemValidationDetails  aD_IMAGE_7_TAG_REQUIRED);
	/*! \brief Get ad_image_8_link is duplicated with another ad image link.
	 */
	CatalogsItemValidationDetails getADIMAGE8LINKDUPLICATED();

	/*! \brief Set ad_image_8_link is duplicated with another ad image link.
	 */
	void setADIMAGE8LINKDUPLICATED(CatalogsItemValidationDetails  aD_IMAGE_8_LINK_DUPLICATED);
	/*! \brief Get Ad image link 8 length is too long. The maximum length is 2047 characters.
	 */
	CatalogsItemValidationDetails getADIMAGE8LINKLENGTHTOOLONG();

	/*! \brief Set Ad image link 8 length is too long. The maximum length is 2047 characters.
	 */
	void setADIMAGE8LINKLENGTHTOOLONG(CatalogsItemValidationDetails  aD_IMAGE_8_LINK_LENGTH_TOO_LONG);
	/*! \brief Get Ad image link 8 is required because an image tag was provided.
	 */
	CatalogsItemValidationDetails getADIMAGE8LINKREQUIRED();

	/*! \brief Set Ad image link 8 is required because an image tag was provided.
	 */
	void setADIMAGE8LINKREQUIRED(CatalogsItemValidationDetails  aD_IMAGE_8_LINK_REQUIRED);
	/*! \brief Get Ad image link 8 format is unsupported.
	 */
	CatalogsItemValidationDetails getADIMAGE8LINKWARNING();

	/*! \brief Set Ad image link 8 format is unsupported.
	 */
	void setADIMAGE8LINKWARNING(CatalogsItemValidationDetails  aD_IMAGE_8_LINK_WARNING);
	/*! \brief Get ad_image_8_tag is duplicated with another ad image tag.
	 */
	CatalogsItemValidationDetails getADIMAGE8TAGDUPLICATED();

	/*! \brief Set ad_image_8_tag is duplicated with another ad image tag.
	 */
	void setADIMAGE8TAGDUPLICATED(CatalogsItemValidationDetails  aD_IMAGE_8_TAG_DUPLICATED);
	/*! \brief Get Ad image tag 8 length is too long. The maximum length is 511 characters.
	 */
	CatalogsItemValidationDetails getADIMAGE8TAGLENGTHTOOLONG();

	/*! \brief Set Ad image tag 8 length is too long. The maximum length is 511 characters.
	 */
	void setADIMAGE8TAGLENGTHTOOLONG(CatalogsItemValidationDetails  aD_IMAGE_8_TAG_LENGTH_TOO_LONG);
	/*! \brief Get Ad image tag 8 is required because an image link was provided.
	 */
	CatalogsItemValidationDetails getADIMAGE8TAGREQUIRED();

	/*! \brief Set Ad image tag 8 is required because an image link was provided.
	 */
	void setADIMAGE8TAGREQUIRED(CatalogsItemValidationDetails  aD_IMAGE_8_TAG_REQUIRED);
	/*! \brief Get ad_image_9_link is duplicated with another ad image link.
	 */
	CatalogsItemValidationDetails getADIMAGE9LINKDUPLICATED();

	/*! \brief Set ad_image_9_link is duplicated with another ad image link.
	 */
	void setADIMAGE9LINKDUPLICATED(CatalogsItemValidationDetails  aD_IMAGE_9_LINK_DUPLICATED);
	/*! \brief Get Ad image link 9 length is too long. The maximum length is 2047 characters.
	 */
	CatalogsItemValidationDetails getADIMAGE9LINKLENGTHTOOLONG();

	/*! \brief Set Ad image link 9 length is too long. The maximum length is 2047 characters.
	 */
	void setADIMAGE9LINKLENGTHTOOLONG(CatalogsItemValidationDetails  aD_IMAGE_9_LINK_LENGTH_TOO_LONG);
	/*! \brief Get Ad image link 9 is required because an image tag was provided.
	 */
	CatalogsItemValidationDetails getADIMAGE9LINKREQUIRED();

	/*! \brief Set Ad image link 9 is required because an image tag was provided.
	 */
	void setADIMAGE9LINKREQUIRED(CatalogsItemValidationDetails  aD_IMAGE_9_LINK_REQUIRED);
	/*! \brief Get Ad image link 9 format is unsupported.
	 */
	CatalogsItemValidationDetails getADIMAGE9LINKWARNING();

	/*! \brief Set Ad image link 9 format is unsupported.
	 */
	void setADIMAGE9LINKWARNING(CatalogsItemValidationDetails  aD_IMAGE_9_LINK_WARNING);
	/*! \brief Get ad_image_9_tag is duplicated with another ad image tag.
	 */
	CatalogsItemValidationDetails getADIMAGE9TAGDUPLICATED();

	/*! \brief Set ad_image_9_tag is duplicated with another ad image tag.
	 */
	void setADIMAGE9TAGDUPLICATED(CatalogsItemValidationDetails  aD_IMAGE_9_TAG_DUPLICATED);
	/*! \brief Get Ad image tag 9 length is too long. The maximum length is 511 characters.
	 */
	CatalogsItemValidationDetails getADIMAGE9TAGLENGTHTOOLONG();

	/*! \brief Set Ad image tag 9 length is too long. The maximum length is 511 characters.
	 */
	void setADIMAGE9TAGLENGTHTOOLONG(CatalogsItemValidationDetails  aD_IMAGE_9_TAG_LENGTH_TOO_LONG);
	/*! \brief Get Ad image tag 9 is required because an image link was provided.
	 */
	CatalogsItemValidationDetails getADIMAGE9TAGREQUIRED();

	/*! \brief Set Ad image tag 9 is required because an image link was provided.
	 */
	void setADIMAGE9TAGREQUIRED(CatalogsItemValidationDetails  aD_IMAGE_9_TAG_REQUIRED);
	/*! \brief Get Item has an ad link that is formatted incorrectly.
	 */
	CatalogsItemValidationDetails getADLINKFORMATWARNING();

	/*! \brief Set Item has an ad link that is formatted incorrectly.
	 */
	void setADLINKFORMATWARNING(CatalogsItemValidationDetails  aD_LINK_FORMAT_WARNING);
	/*! \brief Get Item has an ad link URL that is duplicate of the link URL.
	 */
	CatalogsItemValidationDetails getADLINKSAMEASLINK();

	/*! \brief Set Item has an ad link URL that is duplicate of the link URL.
	 */
	void setADLINKSAMEASLINK(CatalogsItemValidationDetails  aD_LINK_SAME_AS_LINK);
	/*! \brief Get ad_video_0_link is duplicated with another ad video link.
	 */
	CatalogsItemValidationDetails getADVIDEO0LINKDUPLICATED();

	/*! \brief Set ad_video_0_link is duplicated with another ad video link.
	 */
	void setADVIDEO0LINKDUPLICATED(CatalogsItemValidationDetails  aD_VIDEO_0_LINK_DUPLICATED);
	/*! \brief Get ad_video_0_link length is too long. The maximum length is 511 characters.
	 */
	CatalogsItemValidationDetails getADVIDEO0LINKLENGTHTOOLONG();

	/*! \brief Set ad_video_0_link length is too long. The maximum length is 511 characters.
	 */
	void setADVIDEO0LINKLENGTHTOOLONG(CatalogsItemValidationDetails  aD_VIDEO_0_LINK_LENGTH_TOO_LONG);
	/*! \brief Get ad_video_0_link is required for this item because ad_video_0_tag was provided.
	 */
	CatalogsItemValidationDetails getADVIDEO0LINKREQUIRED();

	/*! \brief Set ad_video_0_link is required for this item because ad_video_0_tag was provided.
	 */
	void setADVIDEO0LINKREQUIRED(CatalogsItemValidationDetails  aD_VIDEO_0_LINK_REQUIRED);
	/*! \brief Get ad_video_0_link is formatted incorrectly and will not be published with your items.
	 */
	CatalogsItemValidationDetails getADVIDEO0LINKWARNING();

	/*! \brief Set ad_video_0_link is formatted incorrectly and will not be published with your items.
	 */
	void setADVIDEO0LINKWARNING(CatalogsItemValidationDetails  aD_VIDEO_0_LINK_WARNING);
	/*! \brief Get ad_video_0_tag is duplicated with another ad video tag.
	 */
	CatalogsItemValidationDetails getADVIDEO0TAGDUPLICATED();

	/*! \brief Set ad_video_0_tag is duplicated with another ad video tag.
	 */
	void setADVIDEO0TAGDUPLICATED(CatalogsItemValidationDetails  aD_VIDEO_0_TAG_DUPLICATED);
	/*! \brief Get ad_video_0_tag length is too long. The maximum length is 511 characters.
	 */
	CatalogsItemValidationDetails getADVIDEO0TAGLENGTHTOOLONG();

	/*! \brief Set ad_video_0_tag length is too long. The maximum length is 511 characters.
	 */
	void setADVIDEO0TAGLENGTHTOOLONG(CatalogsItemValidationDetails  aD_VIDEO_0_TAG_LENGTH_TOO_LONG);
	/*! \brief Get ad_video_0_tag is required because ad_video_0_link was provided.
	 */
	CatalogsItemValidationDetails getADVIDEO0TAGREQUIRED();

	/*! \brief Set ad_video_0_tag is required because ad_video_0_link was provided.
	 */
	void setADVIDEO0TAGREQUIRED(CatalogsItemValidationDetails  aD_VIDEO_0_TAG_REQUIRED);
	/*! \brief Get ad_video_1_link is duplicated with another ad video link.
	 */
	CatalogsItemValidationDetails getADVIDEO1LINKDUPLICATED();

	/*! \brief Set ad_video_1_link is duplicated with another ad video link.
	 */
	void setADVIDEO1LINKDUPLICATED(CatalogsItemValidationDetails  aD_VIDEO_1_LINK_DUPLICATED);
	/*! \brief Get ad_video_1_link length is too long. The maximum length is 511 characters.
	 */
	CatalogsItemValidationDetails getADVIDEO1LINKLENGTHTOOLONG();

	/*! \brief Set ad_video_1_link length is too long. The maximum length is 511 characters.
	 */
	void setADVIDEO1LINKLENGTHTOOLONG(CatalogsItemValidationDetails  aD_VIDEO_1_LINK_LENGTH_TOO_LONG);
	/*! \brief Get ad_video_1_link is required for this item because ad_video_1_tag was provided.
	 */
	CatalogsItemValidationDetails getADVIDEO1LINKREQUIRED();

	/*! \brief Set ad_video_1_link is required for this item because ad_video_1_tag was provided.
	 */
	void setADVIDEO1LINKREQUIRED(CatalogsItemValidationDetails  aD_VIDEO_1_LINK_REQUIRED);
	/*! \brief Get ad_video_1_link is formatted incorrectly and will not be published with your items.
	 */
	CatalogsItemValidationDetails getADVIDEO1LINKWARNING();

	/*! \brief Set ad_video_1_link is formatted incorrectly and will not be published with your items.
	 */
	void setADVIDEO1LINKWARNING(CatalogsItemValidationDetails  aD_VIDEO_1_LINK_WARNING);
	/*! \brief Get ad_video_1_tag is duplicated with another ad video tag.
	 */
	CatalogsItemValidationDetails getADVIDEO1TAGDUPLICATED();

	/*! \brief Set ad_video_1_tag is duplicated with another ad video tag.
	 */
	void setADVIDEO1TAGDUPLICATED(CatalogsItemValidationDetails  aD_VIDEO_1_TAG_DUPLICATED);
	/*! \brief Get ad_video_1_tag length is too long. The maximum length is 511 characters.
	 */
	CatalogsItemValidationDetails getADVIDEO1TAGLENGTHTOOLONG();

	/*! \brief Set ad_video_1_tag length is too long. The maximum length is 511 characters.
	 */
	void setADVIDEO1TAGLENGTHTOOLONG(CatalogsItemValidationDetails  aD_VIDEO_1_TAG_LENGTH_TOO_LONG);
	/*! \brief Get ad_video_1_tag is required because ad_video_1_link was provided.
	 */
	CatalogsItemValidationDetails getADVIDEO1TAGREQUIRED();

	/*! \brief Set ad_video_1_tag is required because ad_video_1_link was provided.
	 */
	void setADVIDEO1TAGREQUIRED(CatalogsItemValidationDetails  aD_VIDEO_1_TAG_REQUIRED);
	/*! \brief Get ad_video_2_link is duplicated with another ad video link.
	 */
	CatalogsItemValidationDetails getADVIDEO2LINKDUPLICATED();

	/*! \brief Set ad_video_2_link is duplicated with another ad video link.
	 */
	void setADVIDEO2LINKDUPLICATED(CatalogsItemValidationDetails  aD_VIDEO_2_LINK_DUPLICATED);
	/*! \brief Get ad_video_2_link length is too long. The maximum length is 511 characters.
	 */
	CatalogsItemValidationDetails getADVIDEO2LINKLENGTHTOOLONG();

	/*! \brief Set ad_video_2_link length is too long. The maximum length is 511 characters.
	 */
	void setADVIDEO2LINKLENGTHTOOLONG(CatalogsItemValidationDetails  aD_VIDEO_2_LINK_LENGTH_TOO_LONG);
	/*! \brief Get ad_video_2_link is required for this item because ad_video_2_tag was provided.
	 */
	CatalogsItemValidationDetails getADVIDEO2LINKREQUIRED();

	/*! \brief Set ad_video_2_link is required for this item because ad_video_2_tag was provided.
	 */
	void setADVIDEO2LINKREQUIRED(CatalogsItemValidationDetails  aD_VIDEO_2_LINK_REQUIRED);
	/*! \brief Get ad_video_2_link is formatted incorrectly and will not be published with your items.
	 */
	CatalogsItemValidationDetails getADVIDEO2LINKWARNING();

	/*! \brief Set ad_video_2_link is formatted incorrectly and will not be published with your items.
	 */
	void setADVIDEO2LINKWARNING(CatalogsItemValidationDetails  aD_VIDEO_2_LINK_WARNING);
	/*! \brief Get ad_video_2_tag is duplicated with another ad video tag.
	 */
	CatalogsItemValidationDetails getADVIDEO2TAGDUPLICATED();

	/*! \brief Set ad_video_2_tag is duplicated with another ad video tag.
	 */
	void setADVIDEO2TAGDUPLICATED(CatalogsItemValidationDetails  aD_VIDEO_2_TAG_DUPLICATED);
	/*! \brief Get ad_video_2_tag length is too long. The maximum length is 511 characters.
	 */
	CatalogsItemValidationDetails getADVIDEO2TAGLENGTHTOOLONG();

	/*! \brief Set ad_video_2_tag length is too long. The maximum length is 511 characters.
	 */
	void setADVIDEO2TAGLENGTHTOOLONG(CatalogsItemValidationDetails  aD_VIDEO_2_TAG_LENGTH_TOO_LONG);
	/*! \brief Get ad_video_2_tag is required because ad_video_2_link was provided.
	 */
	CatalogsItemValidationDetails getADVIDEO2TAGREQUIRED();

	/*! \brief Set ad_video_2_tag is required because ad_video_2_link was provided.
	 */
	void setADVIDEO2TAGREQUIRED(CatalogsItemValidationDetails  aD_VIDEO_2_TAG_REQUIRED);
	/*! \brief Get Item has an additional_image_link URL that contains too many characters, so the item will not be published.
	 */
	CatalogsItemValidationDetails getADDITIONALIMAGELINKLENGTHTOOLONG();

	/*! \brief Set Item has an additional_image_link URL that contains too many characters, so the item will not be published.
	 */
	void setADDITIONALIMAGELINKLENGTHTOOLONG(CatalogsItemValidationDetails  aDDITIONAL_IMAGE_LINK_LENGTH_TOO_LONG);
	/*! \brief Get Item has additional_image_link URLs that are formatted incorrectly and will not be published with your items.
	 */
	CatalogsItemValidationDetails getADDITIONALIMAGELINKWARNING();

	/*! \brief Set Item has additional_image_link URLs that are formatted incorrectly and will not be published with your items.
	 */
	void setADDITIONALIMAGELINKWARNING(CatalogsItemValidationDetails  aDDITIONAL_IMAGE_LINK_WARNING);
	/*! \brief Get Item has an adwords_redirect link that is formatted incorrectly.
	 */
	CatalogsItemValidationDetails getADWORDSFORMATWARNING();

	/*! \brief Set Item has an adwords_redirect link that is formatted incorrectly.
	 */
	void setADWORDSFORMATWARNING(CatalogsItemValidationDetails  aDWORDS_FORMAT_WARNING);
	/*! \brief Get Item has an adwords_redirect URL that is duplicate of the link URL.
	 */
	CatalogsItemValidationDetails getADWORDSSAMEASLINK();

	/*! \brief Set Item has an adwords_redirect URL that is duplicate of the link URL.
	 */
	void setADWORDSSAMEASLINK(CatalogsItemValidationDetails  aDWORDS_SAME_AS_LINK);
	/*! \brief Get Item has an age group value that is formatted incorrectly, which may limit visibility in recommendations, search results and shopping experiences.
	 */
	CatalogsItemValidationDetails getAGEGROUPINVALID();

	/*! \brief Set Item has an age group value that is formatted incorrectly, which may limit visibility in recommendations, search results and shopping experiences.
	 */
	void setAGEGROUPINVALID(CatalogsItemValidationDetails  aGE_GROUP_INVALID);
	/*! \brief Get Item includes an invalid android_deep_link.
	 */
	CatalogsItemValidationDetails getANDROIDDEEPLINKINVALID();

	/*! \brief Set Item includes an invalid android_deep_link.
	 */
	void setANDROIDDEEPLINKINVALID(CatalogsItemValidationDetails  aNDROID_DEEP_LINK_INVALID);
	/*! \brief Get Item has an availability_date value that is formatted incorrectly, this item will be published without an availability date.
	 */
	CatalogsItemValidationDetails getAVAILABILITYDATEINVALID();

	/*! \brief Set Item has an availability_date value that is formatted incorrectly, this item will be published without an availability date.
	 */
	void setAVAILABILITYDATEINVALID(CatalogsItemValidationDetails  aVAILABILITY_DATE_INVALID);
	/*! \brief Get Item includes a currency that doesn't match the usual currency for the location where the product is sold or shipped.
	 */
	CatalogsItemValidationDetails getCOUNTRYDOESNOTMAPTOCURRENCY();

	/*! \brief Set Item includes a currency that doesn't match the usual currency for the location where the product is sold or shipped.
	 */
	void setCOUNTRYDOESNOTMAPTOCURRENCY(CatalogsItemValidationDetails  cOUNTRY_DOES_NOT_MAP_TO_CURRENCY);
	/*! \brief Get Item has a custom_label value that is too long, this item will be published without that custom label.
	 */
	CatalogsItemValidationDetails getCUSTOMLABELLENGTHTOOLONG();

	/*! \brief Set Item has a custom_label value that is too long, this item will be published without that custom label.
	 */
	void setCUSTOMLABELLENGTHTOOLONG(CatalogsItemValidationDetails  cUSTOM_LABEL_LENGTH_TOO_LONG);
	/*! \brief Get The description for this item was truncated because it contains too many characters.
	 */
	CatalogsItemValidationDetails getDESCRIPTIONLENGTHTOOLONG();

	/*! \brief Set The description for this item was truncated because it contains too many characters.
	 */
	void setDESCRIPTIONLENGTHTOOLONG(CatalogsItemValidationDetails  dESCRIPTION_LENGTH_TOO_LONG);
	/*! \brief Get Item has an expiration_date value that is formatted incorrectly, this item will be published without an expiration date.
	 */
	CatalogsItemValidationDetails getEXPIRATIONDATEINVALID();

	/*! \brief Set Item has an expiration_date value that is formatted incorrectly, this item will be published without an expiration date.
	 */
	void setEXPIRATIONDATEINVALID(CatalogsItemValidationDetails  eXPIRATION_DATE_INVALID);
	/*! \brief Get Item has a gender value that is formatted incorrectly, which may limit visibility in recommendations, search results and shopping experiences.
	 */
	CatalogsItemValidationDetails getGENDERINVALID();

	/*! \brief Set Item has a gender value that is formatted incorrectly, which may limit visibility in recommendations, search results and shopping experiences.
	 */
	void setGENDERINVALID(CatalogsItemValidationDetails  gENDER_INVALID);
	/*! \brief Get Item has a GTIN value that is formatted incorrectly.
	 */
	CatalogsItemValidationDetails getGTININVALID();

	/*! \brief Set Item has a GTIN value that is formatted incorrectly.
	 */
	void setGTININVALID(CatalogsItemValidationDetails  gTIN_INVALID);
	/*! \brief Get Item has an image_link URL that is formatted incorrectly and will not be published.
	 */
	CatalogsItemValidationDetails getIMAGELINKWARNING();

	/*! \brief Set Item has an image_link URL that is formatted incorrectly and will not be published.
	 */
	void setIMAGELINKWARNING(CatalogsItemValidationDetails  iMAGE_LINK_WARNING);
	/*! \brief Get Item includes an invalid ios_deep_link value.
	 */
	CatalogsItemValidationDetails getIOSDEEPLINKINVALID();

	/*! \brief Set Item includes an invalid ios_deep_link value.
	 */
	void setIOSDEEPLINKINVALID(CatalogsItemValidationDetails  iOS_DEEP_LINK_INVALID);
	/*! \brief Get Item has an is_bundle value that is formatted incorrectly, this item will be published without being bundled with other products.
	 */
	CatalogsItemValidationDetails getISBUNDLEINVALID();

	/*! \brief Set Item has an is_bundle value that is formatted incorrectly, this item will be published without being bundled with other products.
	 */
	void setISBUNDLEINVALID(CatalogsItemValidationDetails  iS_BUNDLE_INVALID);
	/*! \brief Get Item includes additional_image_links that can't be found.
	 */
	CatalogsItemValidationDetails getITEMADDITIONALIMAGEDOWNLOADFAILURE();

	/*! \brief Set Item includes additional_image_links that can't be found.
	 */
	void setITEMADDITIONALIMAGEDOWNLOADFAILURE(CatalogsItemValidationDetails  iTEM_ADDITIONAL_IMAGE_DOWNLOAD_FAILURE);
	/*! \brief Get Item has an invalid product link which contains invalid UTM tracking paramaters.
	 */
	CatalogsItemValidationDetails getLINKFORMATWARNING();

	/*! \brief Set Item has an invalid product link which contains invalid UTM tracking paramaters.
	 */
	void setLINKFORMATWARNING(CatalogsItemValidationDetails  lINK_FORMAT_WARNING);
	/*! \brief Get Item includes a min_ad_price value that is formatted incorrectly.
	 */
	CatalogsItemValidationDetails getMINADPRICEINVALID();

	/*! \brief Set Item includes a min_ad_price value that is formatted incorrectly.
	 */
	void setMINADPRICEINVALID(CatalogsItemValidationDetails  mIN_AD_PRICE_INVALID);
	/*! \brief Get Item has a MPN value that is formatted incorrectly.
	 */
	CatalogsItemValidationDetails getMPNINVALID();

	/*! \brief Set Item has a MPN value that is formatted incorrectly.
	 */
	void setMPNINVALID(CatalogsItemValidationDetails  mPN_INVALID);
	/*! \brief Get Item has an invalid multipack value.
	 */
	CatalogsItemValidationDetails getMULTIPACKINVALID();

	/*! \brief Set Item has an invalid multipack value.
	 */
	void setMULTIPACKINVALID(CatalogsItemValidationDetails  mULTIPACK_INVALID);
	/*! \brief Get Item includes a condition value that is formatted incorrectly, which may limit visibility in recommendations, search results and shopping experiences.
	 */
	CatalogsItemValidationDetails getOPTIONALCONDITIONINVALID();

	/*! \brief Set Item includes a condition value that is formatted incorrectly, which may limit visibility in recommendations, search results and shopping experiences.
	 */
	void setOPTIONALCONDITIONINVALID(CatalogsItemValidationDetails  oPTIONAL_CONDITION_INVALID);
	/*! \brief Get Item is missing condition value, which may limit visibility in recommendations, search results and shopping experiences.
	 */
	CatalogsItemValidationDetails getOPTIONALCONDITIONMISSING();

	/*! \brief Set Item is missing condition value, which may limit visibility in recommendations, search results and shopping experiences.
	 */
	void setOPTIONALCONDITIONMISSING(CatalogsItemValidationDetails  oPTIONAL_CONDITION_MISSING);
	/*! \brief Get Item includes a google_product_category value that is not formatted correctly according to the GPC taxonomy.
	 */
	CatalogsItemValidationDetails getOPTIONALPRODUCTCATEGORYINVALID();

	/*! \brief Set Item includes a google_product_category value that is not formatted correctly according to the GPC taxonomy.
	 */
	void setOPTIONALPRODUCTCATEGORYINVALID(CatalogsItemValidationDetails  oPTIONAL_PRODUCT_CATEGORY_INVALID);
	/*! \brief Get Item is missing google_product_category.
	 */
	CatalogsItemValidationDetails getOPTIONALPRODUCTCATEGORYMISSING();

	/*! \brief Set Item is missing google_product_category.
	 */
	void setOPTIONALPRODUCTCATEGORYMISSING(CatalogsItemValidationDetails  oPTIONAL_PRODUCT_CATEGORY_MISSING);
	/*! \brief Get Item only has 1 or 2 levels of google_product_category value, which may limit visibility in recommendations, search results and shopping experiences.
	 */
	CatalogsItemValidationDetails getPRODUCTCATEGORYDEPTHWARNING();

	/*! \brief Set Item only has 1 or 2 levels of google_product_category value, which may limit visibility in recommendations, search results and shopping experiences.
	 */
	void setPRODUCTCATEGORYDEPTHWARNING(CatalogsItemValidationDetails  pRODUCT_CATEGORY_DEPTH_WARNING);
	/*! \brief Get Item has a product_type value that is too long, this item will be published without that product type.
	 */
	CatalogsItemValidationDetails getPRODUCTTYPELENGTHTOOLONG();

	/*! \brief Set Item has a product_type value that is too long, this item will be published without that product type.
	 */
	void setPRODUCTTYPELENGTHTOOLONG(CatalogsItemValidationDetails  pRODUCT_TYPE_LENGTH_TOO_LONG);
	/*! \brief Get Item has a sale_price_effective_date value that is formatted incorrectly, this item will be published without a sale date.
	 */
	CatalogsItemValidationDetails getSALEDATEINVALID();

	/*! \brief Set Item has a sale_price_effective_date value that is formatted incorrectly, this item will be published without a sale date.
	 */
	void setSALEDATEINVALID(CatalogsItemValidationDetails  sALE_DATE_INVALID);
	/*! \brief Get Item has an incorrectly formatted sales price.
	 */
	CatalogsItemValidationDetails getSALESPRICEINVALID();

	/*! \brief Set Item has an incorrectly formatted sales price.
	 */
	void setSALESPRICEINVALID(CatalogsItemValidationDetails  sALES_PRICE_INVALID);
	/*! \brief Get Item has a sale price value that is higher than the original price of the item.
	 */
	CatalogsItemValidationDetails getSALESPRICETOOHIGH();

	/*! \brief Set Item has a sale price value that is higher than the original price of the item.
	 */
	void setSALESPRICETOOHIGH(CatalogsItemValidationDetails  sALES_PRICE_TOO_HIGH);
	/*! \brief Get Item has a sale price value that is discounted very low compared to the price.
	 */
	CatalogsItemValidationDetails getSALESPRICETOOLOW();

	/*! \brief Set Item has a sale price value that is discounted very low compared to the price.
	 */
	void setSALESPRICETOOLOW(CatalogsItemValidationDetails  sALES_PRICE_TOO_LOW);
	/*! \brief Get Item has an incorrectly formatted shipping_height value. The value must first contain a numeric value then a valid dimension unit type.
	 */
	CatalogsItemValidationDetails getSHIPPINGHEIGHTINVALID();

	/*! \brief Set Item has an incorrectly formatted shipping_height value. The value must first contain a numeric value then a valid dimension unit type.
	 */
	void setSHIPPINGHEIGHTINVALID(CatalogsItemValidationDetails  sHIPPING_HEIGHT_INVALID);
	/*! \brief Get Item has a shipping value that is formatted incorrectly.
	 */
	CatalogsItemValidationDetails getSHIPPINGINVALID();

	/*! \brief Set Item has a shipping value that is formatted incorrectly.
	 */
	void setSHIPPINGINVALID(CatalogsItemValidationDetails  sHIPPING_INVALID);
	/*! \brief Get Item has an invalid shipping_weight value.
	 */
	CatalogsItemValidationDetails getSHIPPINGWEIGHTINVALID();

	/*! \brief Set Item has an invalid shipping_weight value.
	 */
	void setSHIPPINGWEIGHTINVALID(CatalogsItemValidationDetails  sHIPPING_WEIGHT_INVALID);
	/*! \brief Get Item has an incorrectly formatted shipping_width value. The value must first contain a numeric value then a valid dimension unit type.
	 */
	CatalogsItemValidationDetails getSHIPPINGWIDTHINVALID();

	/*! \brief Set Item has an incorrectly formatted shipping_width value. The value must first contain a numeric value then a valid dimension unit type.
	 */
	void setSHIPPINGWIDTHINVALID(CatalogsItemValidationDetails  sHIPPING_WIDTH_INVALID);
	/*! \brief Get Some items have size system values which are not one of the supported size systems.
	 */
	CatalogsItemValidationDetails getSIZESYSTEMINVALID();

	/*! \brief Set Some items have size system values which are not one of the supported size systems.
	 */
	void setSIZESYSTEMINVALID(CatalogsItemValidationDetails  sIZE_SYSTEM_INVALID);
	/*! \brief Get Item has a size type value that is formatted incorrectly, which may limit visibility in recommendations, search results and shopping experiences.
	 */
	CatalogsItemValidationDetails getSIZETYPEINVALID();

	/*! \brief Set Item has a size type value that is formatted incorrectly, which may limit visibility in recommendations, search results and shopping experiences.
	 */
	void setSIZETYPEINVALID(CatalogsItemValidationDetails  sIZE_TYPE_INVALID);
	/*! \brief Get Item has a tax value that is formatted incorrectly.
	 */
	CatalogsItemValidationDetails getTAXINVALID();

	/*! \brief Set Item has a tax value that is formatted incorrectly.
	 */
	void setTAXINVALID(CatalogsItemValidationDetails  tAX_INVALID);
	/*! \brief Get The title for the item was truncated because it contains too many characters.
	 */
	CatalogsItemValidationDetails getTITLELENGTHTOOLONG();

	/*! \brief Set The title for the item was truncated because it contains too many characters.
	 */
	void setTITLELENGTHTOOLONG(CatalogsItemValidationDetails  tITLE_LENGTH_TOO_LONG);
	/*! \brief Get Item has a additional_image_link value that exceed the limit for additional images, this item will be published without some of your images.
	 */
	CatalogsItemValidationDetails getTOOMANYADDITIONALIMAGELINKS();

	/*! \brief Set Item has a additional_image_link value that exceed the limit for additional images, this item will be published without some of your images.
	 */
	void setTOOMANYADDITIONALIMAGELINKS(CatalogsItemValidationDetails  tOO_MANY_ADDITIONAL_IMAGE_LINKS);
	/*! \brief Get Item includes an utm_source value that is formatted incorrectly and has been automatically corrected.
	 */
	CatalogsItemValidationDetails getUTMSOURCEAUTOCORRECTED();

	/*! \brief Set Item includes an utm_source value that is formatted incorrectly and has been automatically corrected.
	 */
	void setUTMSOURCEAUTOCORRECTED(CatalogsItemValidationDetails  uTM_SOURCE_AUTO_CORRECTED);
	/*! \brief Get A video is required in the item when ad_video fields are provided.
	 */
	CatalogsItemValidationDetails getVIDEOREQUIREDWHENADVIDEOPROVIDED();

	/*! \brief Set A video is required in the item when ad_video fields are provided.
	 */
	void setVIDEOREQUIREDWHENADVIDEOPROVIDED(CatalogsItemValidationDetails  vIDEO_REQUIRED_WHEN_AD_VIDEO_PROVIDED);
	/*! \brief Get Item has a weight_unit value that is formatted incorrectly, this item will be published without a weight unit.
	 */
	CatalogsItemValidationDetails getWEIGHTUNITINVALID();

	/*! \brief Set Item has a weight_unit value that is formatted incorrectly, this item will be published without a weight unit.
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
	void __init();
	void __cleanup();

};
}
}

#endif /* _CatalogsItemValidationWarnings_H_ */
