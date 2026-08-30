
/*
 * CatalogsFeedValidationWarnings.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_CatalogsFeedValidationWarnings_H_
#define TINY_CPP_CLIENT_CatalogsFeedValidationWarnings_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class CatalogsFeedValidationWarnings{
public:

    /*! \brief Constructor.
	 */
    CatalogsFeedValidationWarnings();
    CatalogsFeedValidationWarnings(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~CatalogsFeedValidationWarnings();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get ad_image_0_link is duplicated with another ad image link.
	 */
	int getADIMAGE0LINKDUPLICATED();

	/*! \brief Set ad_image_0_link is duplicated with another ad image link.
	 */
	void setADIMAGE0LINKDUPLICATED(int aD_IMAGE_0_LINK_DUPLICATED);
	/*! \brief Get Ad image link 0 length is too long. The maximum length is 2047 characters.
	 */
	int getADIMAGE0LINKLENGTHTOOLONG();

	/*! \brief Set Ad image link 0 length is too long. The maximum length is 2047 characters.
	 */
	void setADIMAGE0LINKLENGTHTOOLONG(int aD_IMAGE_0_LINK_LENGTH_TOO_LONG);
	/*! \brief Get Ad image link 0 is required because an image tag was provided.
	 */
	int getADIMAGE0LINKREQUIRED();

	/*! \brief Set Ad image link 0 is required because an image tag was provided.
	 */
	void setADIMAGE0LINKREQUIRED(int aD_IMAGE_0_LINK_REQUIRED);
	/*! \brief Get Ad image link 0 format is unsupported.
	 */
	int getADIMAGE0LINKWARNING();

	/*! \brief Set Ad image link 0 format is unsupported.
	 */
	void setADIMAGE0LINKWARNING(int aD_IMAGE_0_LINK_WARNING);
	/*! \brief Get ad_image_0_tag is duplicated with another ad image tag.
	 */
	int getADIMAGE0TAGDUPLICATED();

	/*! \brief Set ad_image_0_tag is duplicated with another ad image tag.
	 */
	void setADIMAGE0TAGDUPLICATED(int aD_IMAGE_0_TAG_DUPLICATED);
	/*! \brief Get Ad image tag 0 length is too long. The maximum length is 511 characters.
	 */
	int getADIMAGE0TAGLENGTHTOOLONG();

	/*! \brief Set Ad image tag 0 length is too long. The maximum length is 511 characters.
	 */
	void setADIMAGE0TAGLENGTHTOOLONG(int aD_IMAGE_0_TAG_LENGTH_TOO_LONG);
	/*! \brief Get Ad image tag 0 is required because an image link was provided.
	 */
	int getADIMAGE0TAGREQUIRED();

	/*! \brief Set Ad image tag 0 is required because an image link was provided.
	 */
	void setADIMAGE0TAGREQUIRED(int aD_IMAGE_0_TAG_REQUIRED);
	/*! \brief Get ad_image_10_link is duplicated with another ad image link.
	 */
	int getADIMAGE10LINKDUPLICATED();

	/*! \brief Set ad_image_10_link is duplicated with another ad image link.
	 */
	void setADIMAGE10LINKDUPLICATED(int aD_IMAGE_10_LINK_DUPLICATED);
	/*! \brief Get Ad image link 10 length is too long. The maximum length is 2047 characters.
	 */
	int getADIMAGE10LINKLENGTHTOOLONG();

	/*! \brief Set Ad image link 10 length is too long. The maximum length is 2047 characters.
	 */
	void setADIMAGE10LINKLENGTHTOOLONG(int aD_IMAGE_10_LINK_LENGTH_TOO_LONG);
	/*! \brief Get Ad image link 10 is required because an image tag was provided.
	 */
	int getADIMAGE10LINKREQUIRED();

	/*! \brief Set Ad image link 10 is required because an image tag was provided.
	 */
	void setADIMAGE10LINKREQUIRED(int aD_IMAGE_10_LINK_REQUIRED);
	/*! \brief Get Ad image link 10 format is unsupported.
	 */
	int getADIMAGE10LINKWARNING();

	/*! \brief Set Ad image link 10 format is unsupported.
	 */
	void setADIMAGE10LINKWARNING(int aD_IMAGE_10_LINK_WARNING);
	/*! \brief Get ad_image_10_tag is duplicated with another ad image tag.
	 */
	int getADIMAGE10TAGDUPLICATED();

	/*! \brief Set ad_image_10_tag is duplicated with another ad image tag.
	 */
	void setADIMAGE10TAGDUPLICATED(int aD_IMAGE_10_TAG_DUPLICATED);
	/*! \brief Get Ad image tag 10 length is too long. The maximum length is 511 characters.
	 */
	int getADIMAGE10TAGLENGTHTOOLONG();

	/*! \brief Set Ad image tag 10 length is too long. The maximum length is 511 characters.
	 */
	void setADIMAGE10TAGLENGTHTOOLONG(int aD_IMAGE_10_TAG_LENGTH_TOO_LONG);
	/*! \brief Get Ad image tag 10 is required because an image link was provided.
	 */
	int getADIMAGE10TAGREQUIRED();

	/*! \brief Set Ad image tag 10 is required because an image link was provided.
	 */
	void setADIMAGE10TAGREQUIRED(int aD_IMAGE_10_TAG_REQUIRED);
	/*! \brief Get ad_image_11_link is duplicated with another ad image link.
	 */
	int getADIMAGE11LINKDUPLICATED();

	/*! \brief Set ad_image_11_link is duplicated with another ad image link.
	 */
	void setADIMAGE11LINKDUPLICATED(int aD_IMAGE_11_LINK_DUPLICATED);
	/*! \brief Get Ad image link 11 length is too long. The maximum length is 2047 characters.
	 */
	int getADIMAGE11LINKLENGTHTOOLONG();

	/*! \brief Set Ad image link 11 length is too long. The maximum length is 2047 characters.
	 */
	void setADIMAGE11LINKLENGTHTOOLONG(int aD_IMAGE_11_LINK_LENGTH_TOO_LONG);
	/*! \brief Get Ad image link 11 is required because an image tag was provided.
	 */
	int getADIMAGE11LINKREQUIRED();

	/*! \brief Set Ad image link 11 is required because an image tag was provided.
	 */
	void setADIMAGE11LINKREQUIRED(int aD_IMAGE_11_LINK_REQUIRED);
	/*! \brief Get Ad image link 11 format is unsupported.
	 */
	int getADIMAGE11LINKWARNING();

	/*! \brief Set Ad image link 11 format is unsupported.
	 */
	void setADIMAGE11LINKWARNING(int aD_IMAGE_11_LINK_WARNING);
	/*! \brief Get ad_image_11_tag is duplicated with another ad image tag.
	 */
	int getADIMAGE11TAGDUPLICATED();

	/*! \brief Set ad_image_11_tag is duplicated with another ad image tag.
	 */
	void setADIMAGE11TAGDUPLICATED(int aD_IMAGE_11_TAG_DUPLICATED);
	/*! \brief Get Ad image tag 11 length is too long. The maximum length is 511 characters.
	 */
	int getADIMAGE11TAGLENGTHTOOLONG();

	/*! \brief Set Ad image tag 11 length is too long. The maximum length is 511 characters.
	 */
	void setADIMAGE11TAGLENGTHTOOLONG(int aD_IMAGE_11_TAG_LENGTH_TOO_LONG);
	/*! \brief Get Ad image tag 11 is required because an image link was provided.
	 */
	int getADIMAGE11TAGREQUIRED();

	/*! \brief Set Ad image tag 11 is required because an image link was provided.
	 */
	void setADIMAGE11TAGREQUIRED(int aD_IMAGE_11_TAG_REQUIRED);
	/*! \brief Get ad_image_12_link is duplicated with another ad image link.
	 */
	int getADIMAGE12LINKDUPLICATED();

	/*! \brief Set ad_image_12_link is duplicated with another ad image link.
	 */
	void setADIMAGE12LINKDUPLICATED(int aD_IMAGE_12_LINK_DUPLICATED);
	/*! \brief Get Ad image link 12 length is too long. The maximum length is 2047 characters.
	 */
	int getADIMAGE12LINKLENGTHTOOLONG();

	/*! \brief Set Ad image link 12 length is too long. The maximum length is 2047 characters.
	 */
	void setADIMAGE12LINKLENGTHTOOLONG(int aD_IMAGE_12_LINK_LENGTH_TOO_LONG);
	/*! \brief Get Ad image link 12 is required because an image tag was provided.
	 */
	int getADIMAGE12LINKREQUIRED();

	/*! \brief Set Ad image link 12 is required because an image tag was provided.
	 */
	void setADIMAGE12LINKREQUIRED(int aD_IMAGE_12_LINK_REQUIRED);
	/*! \brief Get Ad image link 12 format is unsupported.
	 */
	int getADIMAGE12LINKWARNING();

	/*! \brief Set Ad image link 12 format is unsupported.
	 */
	void setADIMAGE12LINKWARNING(int aD_IMAGE_12_LINK_WARNING);
	/*! \brief Get ad_image_12_tag is duplicated with another ad image tag.
	 */
	int getADIMAGE12TAGDUPLICATED();

	/*! \brief Set ad_image_12_tag is duplicated with another ad image tag.
	 */
	void setADIMAGE12TAGDUPLICATED(int aD_IMAGE_12_TAG_DUPLICATED);
	/*! \brief Get Ad image tag 12 length is too long. The maximum length is 511 characters.
	 */
	int getADIMAGE12TAGLENGTHTOOLONG();

	/*! \brief Set Ad image tag 12 length is too long. The maximum length is 511 characters.
	 */
	void setADIMAGE12TAGLENGTHTOOLONG(int aD_IMAGE_12_TAG_LENGTH_TOO_LONG);
	/*! \brief Get Ad image tag 12 is required because an image link was provided.
	 */
	int getADIMAGE12TAGREQUIRED();

	/*! \brief Set Ad image tag 12 is required because an image link was provided.
	 */
	void setADIMAGE12TAGREQUIRED(int aD_IMAGE_12_TAG_REQUIRED);
	/*! \brief Get ad_image_13_link is duplicated with another ad image link.
	 */
	int getADIMAGE13LINKDUPLICATED();

	/*! \brief Set ad_image_13_link is duplicated with another ad image link.
	 */
	void setADIMAGE13LINKDUPLICATED(int aD_IMAGE_13_LINK_DUPLICATED);
	/*! \brief Get Ad image link 13 length is too long. The maximum length is 2047 characters.
	 */
	int getADIMAGE13LINKLENGTHTOOLONG();

	/*! \brief Set Ad image link 13 length is too long. The maximum length is 2047 characters.
	 */
	void setADIMAGE13LINKLENGTHTOOLONG(int aD_IMAGE_13_LINK_LENGTH_TOO_LONG);
	/*! \brief Get Ad image link 13 is required because an image tag was provided.
	 */
	int getADIMAGE13LINKREQUIRED();

	/*! \brief Set Ad image link 13 is required because an image tag was provided.
	 */
	void setADIMAGE13LINKREQUIRED(int aD_IMAGE_13_LINK_REQUIRED);
	/*! \brief Get Ad image link 13 format is unsupported.
	 */
	int getADIMAGE13LINKWARNING();

	/*! \brief Set Ad image link 13 format is unsupported.
	 */
	void setADIMAGE13LINKWARNING(int aD_IMAGE_13_LINK_WARNING);
	/*! \brief Get ad_image_13_tag is duplicated with another ad image tag.
	 */
	int getADIMAGE13TAGDUPLICATED();

	/*! \brief Set ad_image_13_tag is duplicated with another ad image tag.
	 */
	void setADIMAGE13TAGDUPLICATED(int aD_IMAGE_13_TAG_DUPLICATED);
	/*! \brief Get Ad image tag 13 length is too long. The maximum length is 511 characters.
	 */
	int getADIMAGE13TAGLENGTHTOOLONG();

	/*! \brief Set Ad image tag 13 length is too long. The maximum length is 511 characters.
	 */
	void setADIMAGE13TAGLENGTHTOOLONG(int aD_IMAGE_13_TAG_LENGTH_TOO_LONG);
	/*! \brief Get Ad image tag 13 is required because an image link was provided.
	 */
	int getADIMAGE13TAGREQUIRED();

	/*! \brief Set Ad image tag 13 is required because an image link was provided.
	 */
	void setADIMAGE13TAGREQUIRED(int aD_IMAGE_13_TAG_REQUIRED);
	/*! \brief Get ad_image_14_link is duplicated with another ad image link.
	 */
	int getADIMAGE14LINKDUPLICATED();

	/*! \brief Set ad_image_14_link is duplicated with another ad image link.
	 */
	void setADIMAGE14LINKDUPLICATED(int aD_IMAGE_14_LINK_DUPLICATED);
	/*! \brief Get Ad image link 14 length is too long. The maximum length is 2047 characters.
	 */
	int getADIMAGE14LINKLENGTHTOOLONG();

	/*! \brief Set Ad image link 14 length is too long. The maximum length is 2047 characters.
	 */
	void setADIMAGE14LINKLENGTHTOOLONG(int aD_IMAGE_14_LINK_LENGTH_TOO_LONG);
	/*! \brief Get Ad image link 14 is required because an image tag was provided.
	 */
	int getADIMAGE14LINKREQUIRED();

	/*! \brief Set Ad image link 14 is required because an image tag was provided.
	 */
	void setADIMAGE14LINKREQUIRED(int aD_IMAGE_14_LINK_REQUIRED);
	/*! \brief Get Ad image link 14 format is unsupported.
	 */
	int getADIMAGE14LINKWARNING();

	/*! \brief Set Ad image link 14 format is unsupported.
	 */
	void setADIMAGE14LINKWARNING(int aD_IMAGE_14_LINK_WARNING);
	/*! \brief Get ad_image_14_tag is duplicated with another ad image tag.
	 */
	int getADIMAGE14TAGDUPLICATED();

	/*! \brief Set ad_image_14_tag is duplicated with another ad image tag.
	 */
	void setADIMAGE14TAGDUPLICATED(int aD_IMAGE_14_TAG_DUPLICATED);
	/*! \brief Get Ad image tag 14 length is too long. The maximum length is 511 characters.
	 */
	int getADIMAGE14TAGLENGTHTOOLONG();

	/*! \brief Set Ad image tag 14 length is too long. The maximum length is 511 characters.
	 */
	void setADIMAGE14TAGLENGTHTOOLONG(int aD_IMAGE_14_TAG_LENGTH_TOO_LONG);
	/*! \brief Get Ad image tag 14 is required because an image link was provided.
	 */
	int getADIMAGE14TAGREQUIRED();

	/*! \brief Set Ad image tag 14 is required because an image link was provided.
	 */
	void setADIMAGE14TAGREQUIRED(int aD_IMAGE_14_TAG_REQUIRED);
	/*! \brief Get ad_image_15_link is duplicated with another ad image link.
	 */
	int getADIMAGE15LINKDUPLICATED();

	/*! \brief Set ad_image_15_link is duplicated with another ad image link.
	 */
	void setADIMAGE15LINKDUPLICATED(int aD_IMAGE_15_LINK_DUPLICATED);
	/*! \brief Get Ad image link 15 length is too long. The maximum length is 2047 characters.
	 */
	int getADIMAGE15LINKLENGTHTOOLONG();

	/*! \brief Set Ad image link 15 length is too long. The maximum length is 2047 characters.
	 */
	void setADIMAGE15LINKLENGTHTOOLONG(int aD_IMAGE_15_LINK_LENGTH_TOO_LONG);
	/*! \brief Get Ad image link 15 is required because an image tag was provided.
	 */
	int getADIMAGE15LINKREQUIRED();

	/*! \brief Set Ad image link 15 is required because an image tag was provided.
	 */
	void setADIMAGE15LINKREQUIRED(int aD_IMAGE_15_LINK_REQUIRED);
	/*! \brief Get Ad image link 15 format is unsupported.
	 */
	int getADIMAGE15LINKWARNING();

	/*! \brief Set Ad image link 15 format is unsupported.
	 */
	void setADIMAGE15LINKWARNING(int aD_IMAGE_15_LINK_WARNING);
	/*! \brief Get ad_image_15_tag is duplicated with another ad image tag.
	 */
	int getADIMAGE15TAGDUPLICATED();

	/*! \brief Set ad_image_15_tag is duplicated with another ad image tag.
	 */
	void setADIMAGE15TAGDUPLICATED(int aD_IMAGE_15_TAG_DUPLICATED);
	/*! \brief Get Ad image tag 15 length is too long. The maximum length is 511 characters.
	 */
	int getADIMAGE15TAGLENGTHTOOLONG();

	/*! \brief Set Ad image tag 15 length is too long. The maximum length is 511 characters.
	 */
	void setADIMAGE15TAGLENGTHTOOLONG(int aD_IMAGE_15_TAG_LENGTH_TOO_LONG);
	/*! \brief Get Ad image tag 15 is required because an image link was provided.
	 */
	int getADIMAGE15TAGREQUIRED();

	/*! \brief Set Ad image tag 15 is required because an image link was provided.
	 */
	void setADIMAGE15TAGREQUIRED(int aD_IMAGE_15_TAG_REQUIRED);
	/*! \brief Get ad_image_16_link is duplicated with another ad image link.
	 */
	int getADIMAGE16LINKDUPLICATED();

	/*! \brief Set ad_image_16_link is duplicated with another ad image link.
	 */
	void setADIMAGE16LINKDUPLICATED(int aD_IMAGE_16_LINK_DUPLICATED);
	/*! \brief Get Ad image link 16 length is too long. The maximum length is 2047 characters.
	 */
	int getADIMAGE16LINKLENGTHTOOLONG();

	/*! \brief Set Ad image link 16 length is too long. The maximum length is 2047 characters.
	 */
	void setADIMAGE16LINKLENGTHTOOLONG(int aD_IMAGE_16_LINK_LENGTH_TOO_LONG);
	/*! \brief Get Ad image link 16 is required because an image tag was provided.
	 */
	int getADIMAGE16LINKREQUIRED();

	/*! \brief Set Ad image link 16 is required because an image tag was provided.
	 */
	void setADIMAGE16LINKREQUIRED(int aD_IMAGE_16_LINK_REQUIRED);
	/*! \brief Get Ad image link 16 format is unsupported.
	 */
	int getADIMAGE16LINKWARNING();

	/*! \brief Set Ad image link 16 format is unsupported.
	 */
	void setADIMAGE16LINKWARNING(int aD_IMAGE_16_LINK_WARNING);
	/*! \brief Get ad_image_16_tag is duplicated with another ad image tag.
	 */
	int getADIMAGE16TAGDUPLICATED();

	/*! \brief Set ad_image_16_tag is duplicated with another ad image tag.
	 */
	void setADIMAGE16TAGDUPLICATED(int aD_IMAGE_16_TAG_DUPLICATED);
	/*! \brief Get Ad image tag 16 length is too long. The maximum length is 511 characters.
	 */
	int getADIMAGE16TAGLENGTHTOOLONG();

	/*! \brief Set Ad image tag 16 length is too long. The maximum length is 511 characters.
	 */
	void setADIMAGE16TAGLENGTHTOOLONG(int aD_IMAGE_16_TAG_LENGTH_TOO_LONG);
	/*! \brief Get Ad image tag 16 is required because an image link was provided.
	 */
	int getADIMAGE16TAGREQUIRED();

	/*! \brief Set Ad image tag 16 is required because an image link was provided.
	 */
	void setADIMAGE16TAGREQUIRED(int aD_IMAGE_16_TAG_REQUIRED);
	/*! \brief Get ad_image_17_link is duplicated with another ad image link.
	 */
	int getADIMAGE17LINKDUPLICATED();

	/*! \brief Set ad_image_17_link is duplicated with another ad image link.
	 */
	void setADIMAGE17LINKDUPLICATED(int aD_IMAGE_17_LINK_DUPLICATED);
	/*! \brief Get Ad image link 17 length is too long. The maximum length is 2047 characters.
	 */
	int getADIMAGE17LINKLENGTHTOOLONG();

	/*! \brief Set Ad image link 17 length is too long. The maximum length is 2047 characters.
	 */
	void setADIMAGE17LINKLENGTHTOOLONG(int aD_IMAGE_17_LINK_LENGTH_TOO_LONG);
	/*! \brief Get Ad image link 17 is required because an image tag was provided.
	 */
	int getADIMAGE17LINKREQUIRED();

	/*! \brief Set Ad image link 17 is required because an image tag was provided.
	 */
	void setADIMAGE17LINKREQUIRED(int aD_IMAGE_17_LINK_REQUIRED);
	/*! \brief Get Ad image link 17 format is unsupported.
	 */
	int getADIMAGE17LINKWARNING();

	/*! \brief Set Ad image link 17 format is unsupported.
	 */
	void setADIMAGE17LINKWARNING(int aD_IMAGE_17_LINK_WARNING);
	/*! \brief Get ad_image_17_tag is duplicated with another ad image tag.
	 */
	int getADIMAGE17TAGDUPLICATED();

	/*! \brief Set ad_image_17_tag is duplicated with another ad image tag.
	 */
	void setADIMAGE17TAGDUPLICATED(int aD_IMAGE_17_TAG_DUPLICATED);
	/*! \brief Get Ad image tag 17 length is too long. The maximum length is 511 characters.
	 */
	int getADIMAGE17TAGLENGTHTOOLONG();

	/*! \brief Set Ad image tag 17 length is too long. The maximum length is 511 characters.
	 */
	void setADIMAGE17TAGLENGTHTOOLONG(int aD_IMAGE_17_TAG_LENGTH_TOO_LONG);
	/*! \brief Get Ad image tag 17 is required because an image link was provided.
	 */
	int getADIMAGE17TAGREQUIRED();

	/*! \brief Set Ad image tag 17 is required because an image link was provided.
	 */
	void setADIMAGE17TAGREQUIRED(int aD_IMAGE_17_TAG_REQUIRED);
	/*! \brief Get ad_image_18_link is duplicated with another ad image link.
	 */
	int getADIMAGE18LINKDUPLICATED();

	/*! \brief Set ad_image_18_link is duplicated with another ad image link.
	 */
	void setADIMAGE18LINKDUPLICATED(int aD_IMAGE_18_LINK_DUPLICATED);
	/*! \brief Get Ad image link 18 length is too long. The maximum length is 2047 characters.
	 */
	int getADIMAGE18LINKLENGTHTOOLONG();

	/*! \brief Set Ad image link 18 length is too long. The maximum length is 2047 characters.
	 */
	void setADIMAGE18LINKLENGTHTOOLONG(int aD_IMAGE_18_LINK_LENGTH_TOO_LONG);
	/*! \brief Get Ad image link 18 is required because an image tag was provided.
	 */
	int getADIMAGE18LINKREQUIRED();

	/*! \brief Set Ad image link 18 is required because an image tag was provided.
	 */
	void setADIMAGE18LINKREQUIRED(int aD_IMAGE_18_LINK_REQUIRED);
	/*! \brief Get Ad image link 18 format is unsupported.
	 */
	int getADIMAGE18LINKWARNING();

	/*! \brief Set Ad image link 18 format is unsupported.
	 */
	void setADIMAGE18LINKWARNING(int aD_IMAGE_18_LINK_WARNING);
	/*! \brief Get ad_image_18_tag is duplicated with another ad image tag.
	 */
	int getADIMAGE18TAGDUPLICATED();

	/*! \brief Set ad_image_18_tag is duplicated with another ad image tag.
	 */
	void setADIMAGE18TAGDUPLICATED(int aD_IMAGE_18_TAG_DUPLICATED);
	/*! \brief Get Ad image tag 18 length is too long. The maximum length is 511 characters.
	 */
	int getADIMAGE18TAGLENGTHTOOLONG();

	/*! \brief Set Ad image tag 18 length is too long. The maximum length is 511 characters.
	 */
	void setADIMAGE18TAGLENGTHTOOLONG(int aD_IMAGE_18_TAG_LENGTH_TOO_LONG);
	/*! \brief Get Ad image tag 18 is required because an image link was provided.
	 */
	int getADIMAGE18TAGREQUIRED();

	/*! \brief Set Ad image tag 18 is required because an image link was provided.
	 */
	void setADIMAGE18TAGREQUIRED(int aD_IMAGE_18_TAG_REQUIRED);
	/*! \brief Get ad_image_19_link is duplicated with another ad image link.
	 */
	int getADIMAGE19LINKDUPLICATED();

	/*! \brief Set ad_image_19_link is duplicated with another ad image link.
	 */
	void setADIMAGE19LINKDUPLICATED(int aD_IMAGE_19_LINK_DUPLICATED);
	/*! \brief Get Ad image link 19 length is too long. The maximum length is 2047 characters.
	 */
	int getADIMAGE19LINKLENGTHTOOLONG();

	/*! \brief Set Ad image link 19 length is too long. The maximum length is 2047 characters.
	 */
	void setADIMAGE19LINKLENGTHTOOLONG(int aD_IMAGE_19_LINK_LENGTH_TOO_LONG);
	/*! \brief Get Ad image link 19 is required because an image tag was provided.
	 */
	int getADIMAGE19LINKREQUIRED();

	/*! \brief Set Ad image link 19 is required because an image tag was provided.
	 */
	void setADIMAGE19LINKREQUIRED(int aD_IMAGE_19_LINK_REQUIRED);
	/*! \brief Get Ad image link 19 format is unsupported.
	 */
	int getADIMAGE19LINKWARNING();

	/*! \brief Set Ad image link 19 format is unsupported.
	 */
	void setADIMAGE19LINKWARNING(int aD_IMAGE_19_LINK_WARNING);
	/*! \brief Get ad_image_19_tag is duplicated with another ad image tag.
	 */
	int getADIMAGE19TAGDUPLICATED();

	/*! \brief Set ad_image_19_tag is duplicated with another ad image tag.
	 */
	void setADIMAGE19TAGDUPLICATED(int aD_IMAGE_19_TAG_DUPLICATED);
	/*! \brief Get Ad image tag 19 length is too long. The maximum length is 511 characters.
	 */
	int getADIMAGE19TAGLENGTHTOOLONG();

	/*! \brief Set Ad image tag 19 length is too long. The maximum length is 511 characters.
	 */
	void setADIMAGE19TAGLENGTHTOOLONG(int aD_IMAGE_19_TAG_LENGTH_TOO_LONG);
	/*! \brief Get Ad image tag 19 is required because an image link was provided.
	 */
	int getADIMAGE19TAGREQUIRED();

	/*! \brief Set Ad image tag 19 is required because an image link was provided.
	 */
	void setADIMAGE19TAGREQUIRED(int aD_IMAGE_19_TAG_REQUIRED);
	/*! \brief Get ad_image_1_link is duplicated with another ad image link.
	 */
	int getADIMAGE1LINKDUPLICATED();

	/*! \brief Set ad_image_1_link is duplicated with another ad image link.
	 */
	void setADIMAGE1LINKDUPLICATED(int aD_IMAGE_1_LINK_DUPLICATED);
	/*! \brief Get Ad image link 1 length is too long. The maximum length is 2047 characters.
	 */
	int getADIMAGE1LINKLENGTHTOOLONG();

	/*! \brief Set Ad image link 1 length is too long. The maximum length is 2047 characters.
	 */
	void setADIMAGE1LINKLENGTHTOOLONG(int aD_IMAGE_1_LINK_LENGTH_TOO_LONG);
	/*! \brief Get Ad image link 1 is required because an image tag was provided.
	 */
	int getADIMAGE1LINKREQUIRED();

	/*! \brief Set Ad image link 1 is required because an image tag was provided.
	 */
	void setADIMAGE1LINKREQUIRED(int aD_IMAGE_1_LINK_REQUIRED);
	/*! \brief Get Ad image link 1 format is unsupported.
	 */
	int getADIMAGE1LINKWARNING();

	/*! \brief Set Ad image link 1 format is unsupported.
	 */
	void setADIMAGE1LINKWARNING(int aD_IMAGE_1_LINK_WARNING);
	/*! \brief Get ad_image_1_tag is duplicated with another ad image tag.
	 */
	int getADIMAGE1TAGDUPLICATED();

	/*! \brief Set ad_image_1_tag is duplicated with another ad image tag.
	 */
	void setADIMAGE1TAGDUPLICATED(int aD_IMAGE_1_TAG_DUPLICATED);
	/*! \brief Get Ad image tag 1 length is too long. The maximum length is 511 characters.
	 */
	int getADIMAGE1TAGLENGTHTOOLONG();

	/*! \brief Set Ad image tag 1 length is too long. The maximum length is 511 characters.
	 */
	void setADIMAGE1TAGLENGTHTOOLONG(int aD_IMAGE_1_TAG_LENGTH_TOO_LONG);
	/*! \brief Get Ad image tag 1 is required because an image link was provided.
	 */
	int getADIMAGE1TAGREQUIRED();

	/*! \brief Set Ad image tag 1 is required because an image link was provided.
	 */
	void setADIMAGE1TAGREQUIRED(int aD_IMAGE_1_TAG_REQUIRED);
	/*! \brief Get ad_image_2_link is duplicated with another ad image link.
	 */
	int getADIMAGE2LINKDUPLICATED();

	/*! \brief Set ad_image_2_link is duplicated with another ad image link.
	 */
	void setADIMAGE2LINKDUPLICATED(int aD_IMAGE_2_LINK_DUPLICATED);
	/*! \brief Get Ad image link 2 length is too long. The maximum length is 2047 characters.
	 */
	int getADIMAGE2LINKLENGTHTOOLONG();

	/*! \brief Set Ad image link 2 length is too long. The maximum length is 2047 characters.
	 */
	void setADIMAGE2LINKLENGTHTOOLONG(int aD_IMAGE_2_LINK_LENGTH_TOO_LONG);
	/*! \brief Get Ad image link 2 is required because an image tag was provided.
	 */
	int getADIMAGE2LINKREQUIRED();

	/*! \brief Set Ad image link 2 is required because an image tag was provided.
	 */
	void setADIMAGE2LINKREQUIRED(int aD_IMAGE_2_LINK_REQUIRED);
	/*! \brief Get Ad image link 2 format is unsupported.
	 */
	int getADIMAGE2LINKWARNING();

	/*! \brief Set Ad image link 2 format is unsupported.
	 */
	void setADIMAGE2LINKWARNING(int aD_IMAGE_2_LINK_WARNING);
	/*! \brief Get ad_image_2_tag is duplicated with another ad image tag.
	 */
	int getADIMAGE2TAGDUPLICATED();

	/*! \brief Set ad_image_2_tag is duplicated with another ad image tag.
	 */
	void setADIMAGE2TAGDUPLICATED(int aD_IMAGE_2_TAG_DUPLICATED);
	/*! \brief Get Ad image tag 2 length is too long. The maximum length is 511 characters.
	 */
	int getADIMAGE2TAGLENGTHTOOLONG();

	/*! \brief Set Ad image tag 2 length is too long. The maximum length is 511 characters.
	 */
	void setADIMAGE2TAGLENGTHTOOLONG(int aD_IMAGE_2_TAG_LENGTH_TOO_LONG);
	/*! \brief Get Ad image tag 2 is required because an image link was provided.
	 */
	int getADIMAGE2TAGREQUIRED();

	/*! \brief Set Ad image tag 2 is required because an image link was provided.
	 */
	void setADIMAGE2TAGREQUIRED(int aD_IMAGE_2_TAG_REQUIRED);
	/*! \brief Get ad_image_3_link is duplicated with another ad image link.
	 */
	int getADIMAGE3LINKDUPLICATED();

	/*! \brief Set ad_image_3_link is duplicated with another ad image link.
	 */
	void setADIMAGE3LINKDUPLICATED(int aD_IMAGE_3_LINK_DUPLICATED);
	/*! \brief Get Ad image link 3 length is too long. The maximum length is 2047 characters.
	 */
	int getADIMAGE3LINKLENGTHTOOLONG();

	/*! \brief Set Ad image link 3 length is too long. The maximum length is 2047 characters.
	 */
	void setADIMAGE3LINKLENGTHTOOLONG(int aD_IMAGE_3_LINK_LENGTH_TOO_LONG);
	/*! \brief Get Ad image link 3 is required because an image tag was provided.
	 */
	int getADIMAGE3LINKREQUIRED();

	/*! \brief Set Ad image link 3 is required because an image tag was provided.
	 */
	void setADIMAGE3LINKREQUIRED(int aD_IMAGE_3_LINK_REQUIRED);
	/*! \brief Get Ad image link 3 format is unsupported.
	 */
	int getADIMAGE3LINKWARNING();

	/*! \brief Set Ad image link 3 format is unsupported.
	 */
	void setADIMAGE3LINKWARNING(int aD_IMAGE_3_LINK_WARNING);
	/*! \brief Get ad_image_3_tag is duplicated with another ad image tag.
	 */
	int getADIMAGE3TAGDUPLICATED();

	/*! \brief Set ad_image_3_tag is duplicated with another ad image tag.
	 */
	void setADIMAGE3TAGDUPLICATED(int aD_IMAGE_3_TAG_DUPLICATED);
	/*! \brief Get Ad image tag 3 length is too long. The maximum length is 511 characters.
	 */
	int getADIMAGE3TAGLENGTHTOOLONG();

	/*! \brief Set Ad image tag 3 length is too long. The maximum length is 511 characters.
	 */
	void setADIMAGE3TAGLENGTHTOOLONG(int aD_IMAGE_3_TAG_LENGTH_TOO_LONG);
	/*! \brief Get Ad image tag 3 is required because an image link was provided.
	 */
	int getADIMAGE3TAGREQUIRED();

	/*! \brief Set Ad image tag 3 is required because an image link was provided.
	 */
	void setADIMAGE3TAGREQUIRED(int aD_IMAGE_3_TAG_REQUIRED);
	/*! \brief Get ad_image_4_link is duplicated with another ad image link.
	 */
	int getADIMAGE4LINKDUPLICATED();

	/*! \brief Set ad_image_4_link is duplicated with another ad image link.
	 */
	void setADIMAGE4LINKDUPLICATED(int aD_IMAGE_4_LINK_DUPLICATED);
	/*! \brief Get Ad image link 4 length is too long. The maximum length is 2047 characters.
	 */
	int getADIMAGE4LINKLENGTHTOOLONG();

	/*! \brief Set Ad image link 4 length is too long. The maximum length is 2047 characters.
	 */
	void setADIMAGE4LINKLENGTHTOOLONG(int aD_IMAGE_4_LINK_LENGTH_TOO_LONG);
	/*! \brief Get Ad image link 4 is required because an image tag was provided.
	 */
	int getADIMAGE4LINKREQUIRED();

	/*! \brief Set Ad image link 4 is required because an image tag was provided.
	 */
	void setADIMAGE4LINKREQUIRED(int aD_IMAGE_4_LINK_REQUIRED);
	/*! \brief Get Ad image link 4 format is unsupported.
	 */
	int getADIMAGE4LINKWARNING();

	/*! \brief Set Ad image link 4 format is unsupported.
	 */
	void setADIMAGE4LINKWARNING(int aD_IMAGE_4_LINK_WARNING);
	/*! \brief Get ad_image_4_tag is duplicated with another ad image tag.
	 */
	int getADIMAGE4TAGDUPLICATED();

	/*! \brief Set ad_image_4_tag is duplicated with another ad image tag.
	 */
	void setADIMAGE4TAGDUPLICATED(int aD_IMAGE_4_TAG_DUPLICATED);
	/*! \brief Get Ad image tag 4 length is too long. The maximum length is 511 characters.
	 */
	int getADIMAGE4TAGLENGTHTOOLONG();

	/*! \brief Set Ad image tag 4 length is too long. The maximum length is 511 characters.
	 */
	void setADIMAGE4TAGLENGTHTOOLONG(int aD_IMAGE_4_TAG_LENGTH_TOO_LONG);
	/*! \brief Get Ad image tag 4 is required because an image link was provided.
	 */
	int getADIMAGE4TAGREQUIRED();

	/*! \brief Set Ad image tag 4 is required because an image link was provided.
	 */
	void setADIMAGE4TAGREQUIRED(int aD_IMAGE_4_TAG_REQUIRED);
	/*! \brief Get ad_image_5_link is duplicated with another ad image link.
	 */
	int getADIMAGE5LINKDUPLICATED();

	/*! \brief Set ad_image_5_link is duplicated with another ad image link.
	 */
	void setADIMAGE5LINKDUPLICATED(int aD_IMAGE_5_LINK_DUPLICATED);
	/*! \brief Get Ad image link 5 length is too long. The maximum length is 2047 characters.
	 */
	int getADIMAGE5LINKLENGTHTOOLONG();

	/*! \brief Set Ad image link 5 length is too long. The maximum length is 2047 characters.
	 */
	void setADIMAGE5LINKLENGTHTOOLONG(int aD_IMAGE_5_LINK_LENGTH_TOO_LONG);
	/*! \brief Get Ad image link 5 is required because an image tag was provided.
	 */
	int getADIMAGE5LINKREQUIRED();

	/*! \brief Set Ad image link 5 is required because an image tag was provided.
	 */
	void setADIMAGE5LINKREQUIRED(int aD_IMAGE_5_LINK_REQUIRED);
	/*! \brief Get Ad image link 5 format is unsupported.
	 */
	int getADIMAGE5LINKWARNING();

	/*! \brief Set Ad image link 5 format is unsupported.
	 */
	void setADIMAGE5LINKWARNING(int aD_IMAGE_5_LINK_WARNING);
	/*! \brief Get ad_image_5_tag is duplicated with another ad image tag.
	 */
	int getADIMAGE5TAGDUPLICATED();

	/*! \brief Set ad_image_5_tag is duplicated with another ad image tag.
	 */
	void setADIMAGE5TAGDUPLICATED(int aD_IMAGE_5_TAG_DUPLICATED);
	/*! \brief Get Ad image tag 5 length is too long. The maximum length is 511 characters.
	 */
	int getADIMAGE5TAGLENGTHTOOLONG();

	/*! \brief Set Ad image tag 5 length is too long. The maximum length is 511 characters.
	 */
	void setADIMAGE5TAGLENGTHTOOLONG(int aD_IMAGE_5_TAG_LENGTH_TOO_LONG);
	/*! \brief Get Ad image tag 5 is required because an image link was provided.
	 */
	int getADIMAGE5TAGREQUIRED();

	/*! \brief Set Ad image tag 5 is required because an image link was provided.
	 */
	void setADIMAGE5TAGREQUIRED(int aD_IMAGE_5_TAG_REQUIRED);
	/*! \brief Get ad_image_6_link is duplicated with another ad image link.
	 */
	int getADIMAGE6LINKDUPLICATED();

	/*! \brief Set ad_image_6_link is duplicated with another ad image link.
	 */
	void setADIMAGE6LINKDUPLICATED(int aD_IMAGE_6_LINK_DUPLICATED);
	/*! \brief Get Ad image link 6 length is too long. The maximum length is 2047 characters.
	 */
	int getADIMAGE6LINKLENGTHTOOLONG();

	/*! \brief Set Ad image link 6 length is too long. The maximum length is 2047 characters.
	 */
	void setADIMAGE6LINKLENGTHTOOLONG(int aD_IMAGE_6_LINK_LENGTH_TOO_LONG);
	/*! \brief Get Ad image link 6 is required because an image tag was provided.
	 */
	int getADIMAGE6LINKREQUIRED();

	/*! \brief Set Ad image link 6 is required because an image tag was provided.
	 */
	void setADIMAGE6LINKREQUIRED(int aD_IMAGE_6_LINK_REQUIRED);
	/*! \brief Get Ad image link 6 format is unsupported.
	 */
	int getADIMAGE6LINKWARNING();

	/*! \brief Set Ad image link 6 format is unsupported.
	 */
	void setADIMAGE6LINKWARNING(int aD_IMAGE_6_LINK_WARNING);
	/*! \brief Get ad_image_6_tag is duplicated with another ad image tag.
	 */
	int getADIMAGE6TAGDUPLICATED();

	/*! \brief Set ad_image_6_tag is duplicated with another ad image tag.
	 */
	void setADIMAGE6TAGDUPLICATED(int aD_IMAGE_6_TAG_DUPLICATED);
	/*! \brief Get Ad image tag 6 length is too long. The maximum length is 511 characters.
	 */
	int getADIMAGE6TAGLENGTHTOOLONG();

	/*! \brief Set Ad image tag 6 length is too long. The maximum length is 511 characters.
	 */
	void setADIMAGE6TAGLENGTHTOOLONG(int aD_IMAGE_6_TAG_LENGTH_TOO_LONG);
	/*! \brief Get Ad image tag 6 is required because an image link was provided.
	 */
	int getADIMAGE6TAGREQUIRED();

	/*! \brief Set Ad image tag 6 is required because an image link was provided.
	 */
	void setADIMAGE6TAGREQUIRED(int aD_IMAGE_6_TAG_REQUIRED);
	/*! \brief Get ad_image_7_link is duplicated with another ad image link.
	 */
	int getADIMAGE7LINKDUPLICATED();

	/*! \brief Set ad_image_7_link is duplicated with another ad image link.
	 */
	void setADIMAGE7LINKDUPLICATED(int aD_IMAGE_7_LINK_DUPLICATED);
	/*! \brief Get Ad image link 7 length is too long. The maximum length is 2047 characters.
	 */
	int getADIMAGE7LINKLENGTHTOOLONG();

	/*! \brief Set Ad image link 7 length is too long. The maximum length is 2047 characters.
	 */
	void setADIMAGE7LINKLENGTHTOOLONG(int aD_IMAGE_7_LINK_LENGTH_TOO_LONG);
	/*! \brief Get Ad image link 7 is required because an image tag was provided.
	 */
	int getADIMAGE7LINKREQUIRED();

	/*! \brief Set Ad image link 7 is required because an image tag was provided.
	 */
	void setADIMAGE7LINKREQUIRED(int aD_IMAGE_7_LINK_REQUIRED);
	/*! \brief Get Ad image link 7 format is unsupported.
	 */
	int getADIMAGE7LINKWARNING();

	/*! \brief Set Ad image link 7 format is unsupported.
	 */
	void setADIMAGE7LINKWARNING(int aD_IMAGE_7_LINK_WARNING);
	/*! \brief Get ad_image_7_tag is duplicated with another ad image tag.
	 */
	int getADIMAGE7TAGDUPLICATED();

	/*! \brief Set ad_image_7_tag is duplicated with another ad image tag.
	 */
	void setADIMAGE7TAGDUPLICATED(int aD_IMAGE_7_TAG_DUPLICATED);
	/*! \brief Get Ad image tag 7 length is too long. The maximum length is 511 characters.
	 */
	int getADIMAGE7TAGLENGTHTOOLONG();

	/*! \brief Set Ad image tag 7 length is too long. The maximum length is 511 characters.
	 */
	void setADIMAGE7TAGLENGTHTOOLONG(int aD_IMAGE_7_TAG_LENGTH_TOO_LONG);
	/*! \brief Get Ad image tag 7 is required because an image link was provided.
	 */
	int getADIMAGE7TAGREQUIRED();

	/*! \brief Set Ad image tag 7 is required because an image link was provided.
	 */
	void setADIMAGE7TAGREQUIRED(int aD_IMAGE_7_TAG_REQUIRED);
	/*! \brief Get ad_image_8_link is duplicated with another ad image link.
	 */
	int getADIMAGE8LINKDUPLICATED();

	/*! \brief Set ad_image_8_link is duplicated with another ad image link.
	 */
	void setADIMAGE8LINKDUPLICATED(int aD_IMAGE_8_LINK_DUPLICATED);
	/*! \brief Get Ad image link 8 length is too long. The maximum length is 2047 characters.
	 */
	int getADIMAGE8LINKLENGTHTOOLONG();

	/*! \brief Set Ad image link 8 length is too long. The maximum length is 2047 characters.
	 */
	void setADIMAGE8LINKLENGTHTOOLONG(int aD_IMAGE_8_LINK_LENGTH_TOO_LONG);
	/*! \brief Get Ad image link 8 is required because an image tag was provided.
	 */
	int getADIMAGE8LINKREQUIRED();

	/*! \brief Set Ad image link 8 is required because an image tag was provided.
	 */
	void setADIMAGE8LINKREQUIRED(int aD_IMAGE_8_LINK_REQUIRED);
	/*! \brief Get Ad image link 8 format is unsupported.
	 */
	int getADIMAGE8LINKWARNING();

	/*! \brief Set Ad image link 8 format is unsupported.
	 */
	void setADIMAGE8LINKWARNING(int aD_IMAGE_8_LINK_WARNING);
	/*! \brief Get ad_image_8_tag is duplicated with another ad image tag.
	 */
	int getADIMAGE8TAGDUPLICATED();

	/*! \brief Set ad_image_8_tag is duplicated with another ad image tag.
	 */
	void setADIMAGE8TAGDUPLICATED(int aD_IMAGE_8_TAG_DUPLICATED);
	/*! \brief Get Ad image tag 8 length is too long. The maximum length is 511 characters.
	 */
	int getADIMAGE8TAGLENGTHTOOLONG();

	/*! \brief Set Ad image tag 8 length is too long. The maximum length is 511 characters.
	 */
	void setADIMAGE8TAGLENGTHTOOLONG(int aD_IMAGE_8_TAG_LENGTH_TOO_LONG);
	/*! \brief Get Ad image tag 8 is required because an image link was provided.
	 */
	int getADIMAGE8TAGREQUIRED();

	/*! \brief Set Ad image tag 8 is required because an image link was provided.
	 */
	void setADIMAGE8TAGREQUIRED(int aD_IMAGE_8_TAG_REQUIRED);
	/*! \brief Get ad_image_9_link is duplicated with another ad image link.
	 */
	int getADIMAGE9LINKDUPLICATED();

	/*! \brief Set ad_image_9_link is duplicated with another ad image link.
	 */
	void setADIMAGE9LINKDUPLICATED(int aD_IMAGE_9_LINK_DUPLICATED);
	/*! \brief Get Ad image link 9 length is too long. The maximum length is 2047 characters.
	 */
	int getADIMAGE9LINKLENGTHTOOLONG();

	/*! \brief Set Ad image link 9 length is too long. The maximum length is 2047 characters.
	 */
	void setADIMAGE9LINKLENGTHTOOLONG(int aD_IMAGE_9_LINK_LENGTH_TOO_LONG);
	/*! \brief Get Ad image link 9 is required because an image tag was provided.
	 */
	int getADIMAGE9LINKREQUIRED();

	/*! \brief Set Ad image link 9 is required because an image tag was provided.
	 */
	void setADIMAGE9LINKREQUIRED(int aD_IMAGE_9_LINK_REQUIRED);
	/*! \brief Get Ad image link 9 format is unsupported.
	 */
	int getADIMAGE9LINKWARNING();

	/*! \brief Set Ad image link 9 format is unsupported.
	 */
	void setADIMAGE9LINKWARNING(int aD_IMAGE_9_LINK_WARNING);
	/*! \brief Get ad_image_9_tag is duplicated with another ad image tag.
	 */
	int getADIMAGE9TAGDUPLICATED();

	/*! \brief Set ad_image_9_tag is duplicated with another ad image tag.
	 */
	void setADIMAGE9TAGDUPLICATED(int aD_IMAGE_9_TAG_DUPLICATED);
	/*! \brief Get Ad image tag 9 length is too long. The maximum length is 511 characters.
	 */
	int getADIMAGE9TAGLENGTHTOOLONG();

	/*! \brief Set Ad image tag 9 length is too long. The maximum length is 511 characters.
	 */
	void setADIMAGE9TAGLENGTHTOOLONG(int aD_IMAGE_9_TAG_LENGTH_TOO_LONG);
	/*! \brief Get Ad image tag 9 is required because an image link was provided.
	 */
	int getADIMAGE9TAGREQUIRED();

	/*! \brief Set Ad image tag 9 is required because an image link was provided.
	 */
	void setADIMAGE9TAGREQUIRED(int aD_IMAGE_9_TAG_REQUIRED);
	/*! \brief Get Some items have ad links that are formatted incorrectly.
	 */
	int getADLINKFORMATWARNING();

	/*! \brief Set Some items have ad links that are formatted incorrectly.
	 */
	void setADLINKFORMATWARNING(int aD_LINK_FORMAT_WARNING);
	/*! \brief Get Some items have ad link URLs that are duplicates of the link URLs for those items.
	 */
	int getADLINKSAMEASLINK();

	/*! \brief Set Some items have ad link URLs that are duplicates of the link URLs for those items.
	 */
	void setADLINKSAMEASLINK(int aD_LINK_SAME_AS_LINK);
	/*! \brief Get ad_video_0_link is duplicated with another ad video link.
	 */
	int getADVIDEO0LINKDUPLICATED();

	/*! \brief Set ad_video_0_link is duplicated with another ad video link.
	 */
	void setADVIDEO0LINKDUPLICATED(int aD_VIDEO_0_LINK_DUPLICATED);
	/*! \brief Get ad_video_0_link length is too long. The maximum length is 511 characters.
	 */
	int getADVIDEO0LINKLENGTHTOOLONG();

	/*! \brief Set ad_video_0_link length is too long. The maximum length is 511 characters.
	 */
	void setADVIDEO0LINKLENGTHTOOLONG(int aD_VIDEO_0_LINK_LENGTH_TOO_LONG);
	/*! \brief Get ad_video_0_link is required for this item because ad_video_0_tag was provided.
	 */
	int getADVIDEO0LINKREQUIRED();

	/*! \brief Set ad_video_0_link is required for this item because ad_video_0_tag was provided.
	 */
	void setADVIDEO0LINKREQUIRED(int aD_VIDEO_0_LINK_REQUIRED);
	/*! \brief Get ad_video_0_link is formatted incorrectly and will not be published with your items.
	 */
	int getADVIDEO0LINKWARNING();

	/*! \brief Set ad_video_0_link is formatted incorrectly and will not be published with your items.
	 */
	void setADVIDEO0LINKWARNING(int aD_VIDEO_0_LINK_WARNING);
	/*! \brief Get ad_video_0_tag is duplicated with another ad video tag.
	 */
	int getADVIDEO0TAGDUPLICATED();

	/*! \brief Set ad_video_0_tag is duplicated with another ad video tag.
	 */
	void setADVIDEO0TAGDUPLICATED(int aD_VIDEO_0_TAG_DUPLICATED);
	/*! \brief Get ad_video_0_tag length is too long. The maximum length is 511 characters.
	 */
	int getADVIDEO0TAGLENGTHTOOLONG();

	/*! \brief Set ad_video_0_tag length is too long. The maximum length is 511 characters.
	 */
	void setADVIDEO0TAGLENGTHTOOLONG(int aD_VIDEO_0_TAG_LENGTH_TOO_LONG);
	/*! \brief Get ad_video_0_tag is required because ad_video_0_link was provided.
	 */
	int getADVIDEO0TAGREQUIRED();

	/*! \brief Set ad_video_0_tag is required because ad_video_0_link was provided.
	 */
	void setADVIDEO0TAGREQUIRED(int aD_VIDEO_0_TAG_REQUIRED);
	/*! \brief Get ad_video_1_link is duplicated with another ad video link.
	 */
	int getADVIDEO1LINKDUPLICATED();

	/*! \brief Set ad_video_1_link is duplicated with another ad video link.
	 */
	void setADVIDEO1LINKDUPLICATED(int aD_VIDEO_1_LINK_DUPLICATED);
	/*! \brief Get ad_video_1_link length is too long. The maximum length is 511 characters.
	 */
	int getADVIDEO1LINKLENGTHTOOLONG();

	/*! \brief Set ad_video_1_link length is too long. The maximum length is 511 characters.
	 */
	void setADVIDEO1LINKLENGTHTOOLONG(int aD_VIDEO_1_LINK_LENGTH_TOO_LONG);
	/*! \brief Get ad_video_1_link is required for this item because ad_video_1_tag was provided.
	 */
	int getADVIDEO1LINKREQUIRED();

	/*! \brief Set ad_video_1_link is required for this item because ad_video_1_tag was provided.
	 */
	void setADVIDEO1LINKREQUIRED(int aD_VIDEO_1_LINK_REQUIRED);
	/*! \brief Get ad_video_1_link is formatted incorrectly and will not be published with your items.
	 */
	int getADVIDEO1LINKWARNING();

	/*! \brief Set ad_video_1_link is formatted incorrectly and will not be published with your items.
	 */
	void setADVIDEO1LINKWARNING(int aD_VIDEO_1_LINK_WARNING);
	/*! \brief Get ad_video_1_tag is duplicated with another ad video tag.
	 */
	int getADVIDEO1TAGDUPLICATED();

	/*! \brief Set ad_video_1_tag is duplicated with another ad video tag.
	 */
	void setADVIDEO1TAGDUPLICATED(int aD_VIDEO_1_TAG_DUPLICATED);
	/*! \brief Get ad_video_1_tag length is too long. The maximum length is 511 characters.
	 */
	int getADVIDEO1TAGLENGTHTOOLONG();

	/*! \brief Set ad_video_1_tag length is too long. The maximum length is 511 characters.
	 */
	void setADVIDEO1TAGLENGTHTOOLONG(int aD_VIDEO_1_TAG_LENGTH_TOO_LONG);
	/*! \brief Get ad_video_1_tag is required because ad_video_1_link was provided.
	 */
	int getADVIDEO1TAGREQUIRED();

	/*! \brief Set ad_video_1_tag is required because ad_video_1_link was provided.
	 */
	void setADVIDEO1TAGREQUIRED(int aD_VIDEO_1_TAG_REQUIRED);
	/*! \brief Get ad_video_2_link is duplicated with another ad video link.
	 */
	int getADVIDEO2LINKDUPLICATED();

	/*! \brief Set ad_video_2_link is duplicated with another ad video link.
	 */
	void setADVIDEO2LINKDUPLICATED(int aD_VIDEO_2_LINK_DUPLICATED);
	/*! \brief Get ad_video_2_link length is too long. The maximum length is 511 characters.
	 */
	int getADVIDEO2LINKLENGTHTOOLONG();

	/*! \brief Set ad_video_2_link length is too long. The maximum length is 511 characters.
	 */
	void setADVIDEO2LINKLENGTHTOOLONG(int aD_VIDEO_2_LINK_LENGTH_TOO_LONG);
	/*! \brief Get ad_video_2_link is required for this item because ad_video_2_tag was provided.
	 */
	int getADVIDEO2LINKREQUIRED();

	/*! \brief Set ad_video_2_link is required for this item because ad_video_2_tag was provided.
	 */
	void setADVIDEO2LINKREQUIRED(int aD_VIDEO_2_LINK_REQUIRED);
	/*! \brief Get ad_video_2_link is formatted incorrectly and will not be published with your items.
	 */
	int getADVIDEO2LINKWARNING();

	/*! \brief Set ad_video_2_link is formatted incorrectly and will not be published with your items.
	 */
	void setADVIDEO2LINKWARNING(int aD_VIDEO_2_LINK_WARNING);
	/*! \brief Get ad_video_2_tag is duplicated with another ad video tag.
	 */
	int getADVIDEO2TAGDUPLICATED();

	/*! \brief Set ad_video_2_tag is duplicated with another ad video tag.
	 */
	void setADVIDEO2TAGDUPLICATED(int aD_VIDEO_2_TAG_DUPLICATED);
	/*! \brief Get ad_video_2_tag length is too long. The maximum length is 511 characters.
	 */
	int getADVIDEO2TAGLENGTHTOOLONG();

	/*! \brief Set ad_video_2_tag length is too long. The maximum length is 511 characters.
	 */
	void setADVIDEO2TAGLENGTHTOOLONG(int aD_VIDEO_2_TAG_LENGTH_TOO_LONG);
	/*! \brief Get ad_video_2_tag is required because ad_video_2_link was provided.
	 */
	int getADVIDEO2TAGREQUIRED();

	/*! \brief Set ad_video_2_tag is required because ad_video_2_link was provided.
	 */
	void setADVIDEO2TAGREQUIRED(int aD_VIDEO_2_TAG_REQUIRED);
	/*! \brief Get Some items have additional_image_link URLs that contain too many characters, so those items will not be published.
	 */
	int getADDITIONALIMAGELINKLENGTHTOOLONG();

	/*! \brief Set Some items have additional_image_link URLs that contain too many characters, so those items will not be published.
	 */
	void setADDITIONALIMAGELINKLENGTHTOOLONG(int aDDITIONAL_IMAGE_LINK_LENGTH_TOO_LONG);
	/*! \brief Get Some items have additional_image_link URLs that are formatted incorrectly and will not be published with your items.
	 */
	int getADDITIONALIMAGELINKWARNING();

	/*! \brief Set Some items have additional_image_link URLs that are formatted incorrectly and will not be published with your items.
	 */
	void setADDITIONALIMAGELINKWARNING(int aDDITIONAL_IMAGE_LINK_WARNING);
	/*! \brief Get Some items have adwords_redirect links that are formatted incorrectly.
	 */
	int getADWORDSFORMATWARNING();

	/*! \brief Set Some items have adwords_redirect links that are formatted incorrectly.
	 */
	void setADWORDSFORMATWARNING(int aDWORDS_FORMAT_WARNING);
	/*! \brief Get Some items have adwords_redirect URLs that are duplicates of the link URLs for those items.
	 */
	int getADWORDSSAMEASLINK();

	/*! \brief Set Some items have adwords_redirect URLs that are duplicates of the link URLs for those items.
	 */
	void setADWORDSSAMEASLINK(int aDWORDS_SAME_AS_LINK);
	/*! \brief Get Some items have age group values that are formatted incorrectly, which may limit visibility in recommendations, search results and shopping experiences.
	 */
	int getAGEGROUPINVALID();

	/*! \brief Set Some items have age group values that are formatted incorrectly, which may limit visibility in recommendations, search results and shopping experiences.
	 */
	void setAGEGROUPINVALID(int aGE_GROUP_INVALID);
	/*! \brief Get Some items include invalid android_deep_link.
	 */
	int getANDROIDDEEPLINKINVALID();

	/*! \brief Set Some items include invalid android_deep_link.
	 */
	void setANDROIDDEEPLINKINVALID(int aNDROID_DEEP_LINK_INVALID);
	/*! \brief Get Some items have availability_date values that are formatted incorrectly, those items will be published without an availability date.
	 */
	int getAVAILABILITYDATEINVALID();

	/*! \brief Set Some items have availability_date values that are formatted incorrectly, those items will be published without an availability date.
	 */
	void setAVAILABILITYDATEINVALID(int aVAILABILITY_DATE_INVALID);
	/*! \brief Get Some items include a currency that doesn't match the usual currency for the location where that product is sold or shipped.
	 */
	int getCOUNTRYDOESNOTMAPTOCURRENCY();

	/*! \brief Set Some items include a currency that doesn't match the usual currency for the location where that product is sold or shipped.
	 */
	void setCOUNTRYDOESNOTMAPTOCURRENCY(int cOUNTRY_DOES_NOT_MAP_TO_CURRENCY);
	/*! \brief Get Some items have custom_label values that are too long, those items will be published without that custom label.
	 */
	int getCUSTOMLABELLENGTHTOOLONG();

	/*! \brief Set Some items have custom_label values that are too long, those items will be published without that custom label.
	 */
	void setCUSTOMLABELLENGTHTOOLONG(int cUSTOM_LABEL_LENGTH_TOO_LONG);
	/*! \brief Get The description for some items were truncated because they contain too many characters.
	 */
	int getDESCRIPTIONLENGTHTOOLONG();

	/*! \brief Set The description for some items were truncated because they contain too many characters.
	 */
	void setDESCRIPTIONLENGTHTOOLONG(int dESCRIPTION_LENGTH_TOO_LONG);
	/*! \brief Get Your feed contains duplicate headers.
	 */
	int getDUPLICATEHEADERS();

	/*! \brief Set Your feed contains duplicate headers.
	 */
	void setDUPLICATEHEADERS(int dUPLICATE_HEADERS);
	/*! \brief Get Some items have expiration_date values that are formatted incorrectly, those items will be published without an expiration date.
	 */
	int getEXPIRATIONDATEINVALID();

	/*! \brief Set Some items have expiration_date values that are formatted incorrectly, those items will be published without an expiration date.
	 */
	void setEXPIRATIONDATEINVALID(int eXPIRATION_DATE_INVALID);
	/*! \brief Get Ingestion completed early because there are no changes to your feed since the last successful update.
	 */
	int getFETCHSAMESIGNATURE();

	/*! \brief Set Ingestion completed early because there are no changes to your feed since the last successful update.
	 */
	void setFETCHSAMESIGNATURE(int fETCH_SAME_SIGNATURE);
	/*! \brief Get Some items have gender values that are formatted incorrectly, which may limit visibility in recommendations, search results and shopping experiences.
	 */
	int getGENDERINVALID();

	/*! \brief Set Some items have gender values that are formatted incorrectly, which may limit visibility in recommendations, search results and shopping experiences.
	 */
	void setGENDERINVALID(int gENDER_INVALID);
	/*! \brief Get Some items include incorrectly formatted GTINs.
	 */
	int getGTININVALID();

	/*! \brief Set Some items include incorrectly formatted GTINs.
	 */
	void setGTININVALID(int gTIN_INVALID);
	/*! \brief Get Some items have image_link URLs that are formatted incorrectly and will not be published with those items.
	 */
	int getIMAGELINKWARNING();

	/*! \brief Set Some items have image_link URLs that are formatted incorrectly and will not be published with those items.
	 */
	void setIMAGELINKWARNING(int iMAGE_LINK_WARNING);
	/*! \brief Get Some items include inconsistent currencies in price fields.
	 */
	int getINCONSISTENTCURRENCYVALUES();

	/*! \brief Set Some items include inconsistent currencies in price fields.
	 */
	void setINCONSISTENTCURRENCYVALUES(int iNCONSISTENT_CURRENCY_VALUES);
	/*! \brief Get The product count has increased or decreased significantly compared to the last successful ingestion.
	 */
	int getINDEXEDPRODUCTCOUNTLARGEDELTA();

	/*! \brief Set The product count has increased or decreased significantly compared to the last successful ingestion.
	 */
	void setINDEXEDPRODUCTCOUNTLARGEDELTA(int iNDEXED_PRODUCT_COUNT_LARGE_DELTA);
	/*! \brief Get Some items include invalid ios_deep_link values.
	 */
	int getIOSDEEPLINKINVALID();

	/*! \brief Set Some items include invalid ios_deep_link values.
	 */
	void setIOSDEEPLINKINVALID(int iOS_DEEP_LINK_INVALID);
	/*! \brief Get Some items have is_bundle values that are formatted incorrectly, those items will be published without being bundled with other products.
	 */
	int getISBUNDLEINVALID();

	/*! \brief Set Some items have is_bundle values that are formatted incorrectly, those items will be published without being bundled with other products.
	 */
	void setISBUNDLEINVALID(int iS_BUNDLE_INVALID);
	/*! \brief Get Some items include additional_image_links that can't be found.
	 */
	int getITEMADDITIONALIMAGEDOWNLOADFAILURE();

	/*! \brief Set Some items include additional_image_links that can't be found.
	 */
	void setITEMADDITIONALIMAGEDOWNLOADFAILURE(int iTEM_ADDITIONAL_IMAGE_DOWNLOAD_FAILURE);
	/*! \brief Get Some items have an invalid product link which contains invalid UTM tracking paramaters.
	 */
	int getLINKFORMATWARNING();

	/*! \brief Set Some items have an invalid product link which contains invalid UTM tracking paramaters.
	 */
	void setLINKFORMATWARNING(int lINK_FORMAT_WARNING);
	/*! \brief Get Some items include min_ad_price values that are formatted incorrectly.
	 */
	int getMINADPRICEINVALID();

	/*! \brief Set Some items include min_ad_price values that are formatted incorrectly.
	 */
	void setMINADPRICEINVALID(int mIN_AD_PRICE_INVALID);
	/*! \brief Get Some items include incorrectly formatted MPNs.
	 */
	int getMPNINVALID();

	/*! \brief Set Some items include incorrectly formatted MPNs.
	 */
	void setMPNINVALID(int mPN_INVALID);
	/*! \brief Get Some items have invalid multipack values.
	 */
	int getMULTIPACKINVALID();

	/*! \brief Set Some items have invalid multipack values.
	 */
	void setMULTIPACKINVALID(int mULTIPACK_INVALID);
	/*! \brief Get Some items include condition values that are formatted incorrectly, which may limit visibility in recommendations, search results and shopping experiences.
	 */
	int getOPTIONALCONDITIONINVALID();

	/*! \brief Set Some items include condition values that are formatted incorrectly, which may limit visibility in recommendations, search results and shopping experiences.
	 */
	void setOPTIONALCONDITIONINVALID(int oPTIONAL_CONDITION_INVALID);
	/*! \brief Get Some items are missing a condition value, which may limit visibility in recommendations, search results and shopping experiences.
	 */
	int getOPTIONALCONDITIONMISSING();

	/*! \brief Set Some items are missing a condition value, which may limit visibility in recommendations, search results and shopping experiences.
	 */
	void setOPTIONALCONDITIONMISSING(int oPTIONAL_CONDITION_MISSING);
	/*! \brief Get Some items include google_product_category values that are not formatted correctly according to the GPC taxonomy.
	 */
	int getOPTIONALPRODUCTCATEGORYINVALID();

	/*! \brief Set Some items include google_product_category values that are not formatted correctly according to the GPC taxonomy.
	 */
	void setOPTIONALPRODUCTCATEGORYINVALID(int oPTIONAL_PRODUCT_CATEGORY_INVALID);
	/*! \brief Get Some items are missing a google_product_category.
	 */
	int getOPTIONALPRODUCTCATEGORYMISSING();

	/*! \brief Set Some items are missing a google_product_category.
	 */
	void setOPTIONALPRODUCTCATEGORYMISSING(int oPTIONAL_PRODUCT_CATEGORY_MISSING);
	/*! \brief Get Some items only have 1 or 2 levels of google_product_category values, which may limit visibility in recommendations, search results and shopping experiences.
	 */
	int getPRODUCTCATEGORYDEPTHWARNING();

	/*! \brief Set Some items only have 1 or 2 levels of google_product_category values, which may limit visibility in recommendations, search results and shopping experiences.
	 */
	void setPRODUCTCATEGORYDEPTHWARNING(int pRODUCT_CATEGORY_DEPTH_WARNING);
	/*! \brief Get Some items have product_type values that are too long, those items will be published without that product type.
	 */
	int getPRODUCTTYPELENGTHTOOLONG();

	/*! \brief Set Some items have product_type values that are too long, those items will be published without that product type.
	 */
	void setPRODUCTTYPELENGTHTOOLONG(int pRODUCT_TYPE_LENGTH_TOO_LONG);
	/*! \brief Get Some items have sale_price_effective_date values that are formatted incorrectly, those items will be published without a sale date.
	 */
	int getSALEDATEINVALID();

	/*! \brief Set Some items have sale_price_effective_date values that are formatted incorrectly, those items will be published without a sale date.
	 */
	void setSALEDATEINVALID(int sALE_DATE_INVALID);
	/*! \brief Get Some items have sale price values that are higher than the original price of the item.
	 */
	int getSALESPRICEINVALID();

	/*! \brief Set Some items have sale price values that are higher than the original price of the item.
	 */
	void setSALESPRICEINVALID(int sALES_PRICE_INVALID);
	/*! \brief Get Some items include a sales price that is higher than the list price. The sales price has been defaulted to the list price.
	 */
	int getSALESPRICETOOHIGH();

	/*! \brief Set Some items include a sales price that is higher than the list price. The sales price has been defaulted to the list price.
	 */
	void setSALESPRICETOOHIGH(int sALES_PRICE_TOO_HIGH);
	/*! \brief Get Some items include sales price that is much lower than the list price.
	 */
	int getSALESPRICETOOLOW();

	/*! \brief Set Some items include sales price that is much lower than the list price.
	 */
	void setSALESPRICETOOLOW(int sALES_PRICE_TOO_LOW);
	/*! \brief Get Some items include incorrectly formatted shipping_height.
	 */
	int getSHIPPINGHEIGHTINVALID();

	/*! \brief Set Some items include incorrectly formatted shipping_height.
	 */
	void setSHIPPINGHEIGHTINVALID(int sHIPPING_HEIGHT_INVALID);
	/*! \brief Get Some items have shipping values that are formatted incorrectly.
	 */
	int getSHIPPINGINVALID();

	/*! \brief Set Some items have shipping values that are formatted incorrectly.
	 */
	void setSHIPPINGINVALID(int sHIPPING_INVALID);
	/*! \brief Get Some items have invalid shipping_weight values.
	 */
	int getSHIPPINGWEIGHTINVALID();

	/*! \brief Set Some items have invalid shipping_weight values.
	 */
	void setSHIPPINGWEIGHTINVALID(int sHIPPING_WEIGHT_INVALID);
	/*! \brief Get Some items include incorrectly formatted shipping_width.
	 */
	int getSHIPPINGWIDTHINVALID();

	/*! \brief Set Some items include incorrectly formatted shipping_width.
	 */
	void setSHIPPINGWIDTHINVALID(int sHIPPING_WIDTH_INVALID);
	/*! \brief Get Some items have size system values which are not one of the supported size systems.
	 */
	int getSIZESYSTEMINVALID();

	/*! \brief Set Some items have size system values which are not one of the supported size systems.
	 */
	void setSIZESYSTEMINVALID(int sIZE_SYSTEM_INVALID);
	/*! \brief Get Some items have size type values that are formatted incorrectly, which may limit visibility in recommendations, search results and shopping experiences.
	 */
	int getSIZETYPEINVALID();

	/*! \brief Set Some items have size type values that are formatted incorrectly, which may limit visibility in recommendations, search results and shopping experiences.
	 */
	void setSIZETYPEINVALID(int sIZE_TYPE_INVALID);
	/*! \brief Get Some items have tax values that are formatted incorrectly.
	 */
	int getTAXINVALID();

	/*! \brief Set Some items have tax values that are formatted incorrectly.
	 */
	void setTAXINVALID(int tAX_INVALID);
	/*! \brief Get The title for some items were truncated because they contain too many characters.
	 */
	int getTITLELENGTHTOOLONG();

	/*! \brief Set The title for some items were truncated because they contain too many characters.
	 */
	void setTITLELENGTHTOOLONG(int tITLE_LENGTH_TOO_LONG);
	/*! \brief Get Some items have additional_image_link values that exceed the limit for additional images, those items will be published without some of your images.
	 */
	int getTOOMANYADDITIONALIMAGELINKS();

	/*! \brief Set Some items have additional_image_link values that exceed the limit for additional images, those items will be published without some of your images.
	 */
	void setTOOMANYADDITIONALIMAGELINKS(int tOO_MANY_ADDITIONAL_IMAGE_LINKS);
	/*! \brief Get Some items have updated_time values thate are formatted incorrectly, those items will be published without an updated time.
	 */
	int getUPDATEDTIMEINVALID();

	/*! \brief Set Some items have updated_time values thate are formatted incorrectly, those items will be published without an updated time.
	 */
	void setUPDATEDTIMEINVALID(int uPDATED_TIME_INVALID);
	/*! \brief Get Some items include utm_source values that are formatted incorrectly and have been automatically corrected.
	 */
	int getUTMSOURCEAUTOCORRECTED();

	/*! \brief Set Some items include utm_source values that are formatted incorrectly and have been automatically corrected.
	 */
	void setUTMSOURCEAUTOCORRECTED(int uTM_SOURCE_AUTO_CORRECTED);
	/*! \brief Get A video is required in the item when ad_video fields are provided.
	 */
	int getVIDEOREQUIREDWHENADVIDEOPROVIDED();

	/*! \brief Set A video is required in the item when ad_video fields are provided.
	 */
	void setVIDEOREQUIREDWHENADVIDEOPROVIDED(int vIDEO_REQUIRED_WHEN_AD_VIDEO_PROVIDED);
	/*! \brief Get Some items have weight_unit values that are formatted incorrectly, those items will be published without a weight unit.
	 */
	int getWEIGHTUNITINVALID();

	/*! \brief Set Some items have weight_unit values that are formatted incorrectly, those items will be published without a weight unit.
	 */
	void setWEIGHTUNITINVALID(int wEIGHT_UNIT_INVALID);


    private:
    int aD_IMAGE_0_LINK_DUPLICATED{};
    int aD_IMAGE_0_LINK_LENGTH_TOO_LONG{};
    int aD_IMAGE_0_LINK_REQUIRED{};
    int aD_IMAGE_0_LINK_WARNING{};
    int aD_IMAGE_0_TAG_DUPLICATED{};
    int aD_IMAGE_0_TAG_LENGTH_TOO_LONG{};
    int aD_IMAGE_0_TAG_REQUIRED{};
    int aD_IMAGE_10_LINK_DUPLICATED{};
    int aD_IMAGE_10_LINK_LENGTH_TOO_LONG{};
    int aD_IMAGE_10_LINK_REQUIRED{};
    int aD_IMAGE_10_LINK_WARNING{};
    int aD_IMAGE_10_TAG_DUPLICATED{};
    int aD_IMAGE_10_TAG_LENGTH_TOO_LONG{};
    int aD_IMAGE_10_TAG_REQUIRED{};
    int aD_IMAGE_11_LINK_DUPLICATED{};
    int aD_IMAGE_11_LINK_LENGTH_TOO_LONG{};
    int aD_IMAGE_11_LINK_REQUIRED{};
    int aD_IMAGE_11_LINK_WARNING{};
    int aD_IMAGE_11_TAG_DUPLICATED{};
    int aD_IMAGE_11_TAG_LENGTH_TOO_LONG{};
    int aD_IMAGE_11_TAG_REQUIRED{};
    int aD_IMAGE_12_LINK_DUPLICATED{};
    int aD_IMAGE_12_LINK_LENGTH_TOO_LONG{};
    int aD_IMAGE_12_LINK_REQUIRED{};
    int aD_IMAGE_12_LINK_WARNING{};
    int aD_IMAGE_12_TAG_DUPLICATED{};
    int aD_IMAGE_12_TAG_LENGTH_TOO_LONG{};
    int aD_IMAGE_12_TAG_REQUIRED{};
    int aD_IMAGE_13_LINK_DUPLICATED{};
    int aD_IMAGE_13_LINK_LENGTH_TOO_LONG{};
    int aD_IMAGE_13_LINK_REQUIRED{};
    int aD_IMAGE_13_LINK_WARNING{};
    int aD_IMAGE_13_TAG_DUPLICATED{};
    int aD_IMAGE_13_TAG_LENGTH_TOO_LONG{};
    int aD_IMAGE_13_TAG_REQUIRED{};
    int aD_IMAGE_14_LINK_DUPLICATED{};
    int aD_IMAGE_14_LINK_LENGTH_TOO_LONG{};
    int aD_IMAGE_14_LINK_REQUIRED{};
    int aD_IMAGE_14_LINK_WARNING{};
    int aD_IMAGE_14_TAG_DUPLICATED{};
    int aD_IMAGE_14_TAG_LENGTH_TOO_LONG{};
    int aD_IMAGE_14_TAG_REQUIRED{};
    int aD_IMAGE_15_LINK_DUPLICATED{};
    int aD_IMAGE_15_LINK_LENGTH_TOO_LONG{};
    int aD_IMAGE_15_LINK_REQUIRED{};
    int aD_IMAGE_15_LINK_WARNING{};
    int aD_IMAGE_15_TAG_DUPLICATED{};
    int aD_IMAGE_15_TAG_LENGTH_TOO_LONG{};
    int aD_IMAGE_15_TAG_REQUIRED{};
    int aD_IMAGE_16_LINK_DUPLICATED{};
    int aD_IMAGE_16_LINK_LENGTH_TOO_LONG{};
    int aD_IMAGE_16_LINK_REQUIRED{};
    int aD_IMAGE_16_LINK_WARNING{};
    int aD_IMAGE_16_TAG_DUPLICATED{};
    int aD_IMAGE_16_TAG_LENGTH_TOO_LONG{};
    int aD_IMAGE_16_TAG_REQUIRED{};
    int aD_IMAGE_17_LINK_DUPLICATED{};
    int aD_IMAGE_17_LINK_LENGTH_TOO_LONG{};
    int aD_IMAGE_17_LINK_REQUIRED{};
    int aD_IMAGE_17_LINK_WARNING{};
    int aD_IMAGE_17_TAG_DUPLICATED{};
    int aD_IMAGE_17_TAG_LENGTH_TOO_LONG{};
    int aD_IMAGE_17_TAG_REQUIRED{};
    int aD_IMAGE_18_LINK_DUPLICATED{};
    int aD_IMAGE_18_LINK_LENGTH_TOO_LONG{};
    int aD_IMAGE_18_LINK_REQUIRED{};
    int aD_IMAGE_18_LINK_WARNING{};
    int aD_IMAGE_18_TAG_DUPLICATED{};
    int aD_IMAGE_18_TAG_LENGTH_TOO_LONG{};
    int aD_IMAGE_18_TAG_REQUIRED{};
    int aD_IMAGE_19_LINK_DUPLICATED{};
    int aD_IMAGE_19_LINK_LENGTH_TOO_LONG{};
    int aD_IMAGE_19_LINK_REQUIRED{};
    int aD_IMAGE_19_LINK_WARNING{};
    int aD_IMAGE_19_TAG_DUPLICATED{};
    int aD_IMAGE_19_TAG_LENGTH_TOO_LONG{};
    int aD_IMAGE_19_TAG_REQUIRED{};
    int aD_IMAGE_1_LINK_DUPLICATED{};
    int aD_IMAGE_1_LINK_LENGTH_TOO_LONG{};
    int aD_IMAGE_1_LINK_REQUIRED{};
    int aD_IMAGE_1_LINK_WARNING{};
    int aD_IMAGE_1_TAG_DUPLICATED{};
    int aD_IMAGE_1_TAG_LENGTH_TOO_LONG{};
    int aD_IMAGE_1_TAG_REQUIRED{};
    int aD_IMAGE_2_LINK_DUPLICATED{};
    int aD_IMAGE_2_LINK_LENGTH_TOO_LONG{};
    int aD_IMAGE_2_LINK_REQUIRED{};
    int aD_IMAGE_2_LINK_WARNING{};
    int aD_IMAGE_2_TAG_DUPLICATED{};
    int aD_IMAGE_2_TAG_LENGTH_TOO_LONG{};
    int aD_IMAGE_2_TAG_REQUIRED{};
    int aD_IMAGE_3_LINK_DUPLICATED{};
    int aD_IMAGE_3_LINK_LENGTH_TOO_LONG{};
    int aD_IMAGE_3_LINK_REQUIRED{};
    int aD_IMAGE_3_LINK_WARNING{};
    int aD_IMAGE_3_TAG_DUPLICATED{};
    int aD_IMAGE_3_TAG_LENGTH_TOO_LONG{};
    int aD_IMAGE_3_TAG_REQUIRED{};
    int aD_IMAGE_4_LINK_DUPLICATED{};
    int aD_IMAGE_4_LINK_LENGTH_TOO_LONG{};
    int aD_IMAGE_4_LINK_REQUIRED{};
    int aD_IMAGE_4_LINK_WARNING{};
    int aD_IMAGE_4_TAG_DUPLICATED{};
    int aD_IMAGE_4_TAG_LENGTH_TOO_LONG{};
    int aD_IMAGE_4_TAG_REQUIRED{};
    int aD_IMAGE_5_LINK_DUPLICATED{};
    int aD_IMAGE_5_LINK_LENGTH_TOO_LONG{};
    int aD_IMAGE_5_LINK_REQUIRED{};
    int aD_IMAGE_5_LINK_WARNING{};
    int aD_IMAGE_5_TAG_DUPLICATED{};
    int aD_IMAGE_5_TAG_LENGTH_TOO_LONG{};
    int aD_IMAGE_5_TAG_REQUIRED{};
    int aD_IMAGE_6_LINK_DUPLICATED{};
    int aD_IMAGE_6_LINK_LENGTH_TOO_LONG{};
    int aD_IMAGE_6_LINK_REQUIRED{};
    int aD_IMAGE_6_LINK_WARNING{};
    int aD_IMAGE_6_TAG_DUPLICATED{};
    int aD_IMAGE_6_TAG_LENGTH_TOO_LONG{};
    int aD_IMAGE_6_TAG_REQUIRED{};
    int aD_IMAGE_7_LINK_DUPLICATED{};
    int aD_IMAGE_7_LINK_LENGTH_TOO_LONG{};
    int aD_IMAGE_7_LINK_REQUIRED{};
    int aD_IMAGE_7_LINK_WARNING{};
    int aD_IMAGE_7_TAG_DUPLICATED{};
    int aD_IMAGE_7_TAG_LENGTH_TOO_LONG{};
    int aD_IMAGE_7_TAG_REQUIRED{};
    int aD_IMAGE_8_LINK_DUPLICATED{};
    int aD_IMAGE_8_LINK_LENGTH_TOO_LONG{};
    int aD_IMAGE_8_LINK_REQUIRED{};
    int aD_IMAGE_8_LINK_WARNING{};
    int aD_IMAGE_8_TAG_DUPLICATED{};
    int aD_IMAGE_8_TAG_LENGTH_TOO_LONG{};
    int aD_IMAGE_8_TAG_REQUIRED{};
    int aD_IMAGE_9_LINK_DUPLICATED{};
    int aD_IMAGE_9_LINK_LENGTH_TOO_LONG{};
    int aD_IMAGE_9_LINK_REQUIRED{};
    int aD_IMAGE_9_LINK_WARNING{};
    int aD_IMAGE_9_TAG_DUPLICATED{};
    int aD_IMAGE_9_TAG_LENGTH_TOO_LONG{};
    int aD_IMAGE_9_TAG_REQUIRED{};
    int aD_LINK_FORMAT_WARNING{};
    int aD_LINK_SAME_AS_LINK{};
    int aD_VIDEO_0_LINK_DUPLICATED{};
    int aD_VIDEO_0_LINK_LENGTH_TOO_LONG{};
    int aD_VIDEO_0_LINK_REQUIRED{};
    int aD_VIDEO_0_LINK_WARNING{};
    int aD_VIDEO_0_TAG_DUPLICATED{};
    int aD_VIDEO_0_TAG_LENGTH_TOO_LONG{};
    int aD_VIDEO_0_TAG_REQUIRED{};
    int aD_VIDEO_1_LINK_DUPLICATED{};
    int aD_VIDEO_1_LINK_LENGTH_TOO_LONG{};
    int aD_VIDEO_1_LINK_REQUIRED{};
    int aD_VIDEO_1_LINK_WARNING{};
    int aD_VIDEO_1_TAG_DUPLICATED{};
    int aD_VIDEO_1_TAG_LENGTH_TOO_LONG{};
    int aD_VIDEO_1_TAG_REQUIRED{};
    int aD_VIDEO_2_LINK_DUPLICATED{};
    int aD_VIDEO_2_LINK_LENGTH_TOO_LONG{};
    int aD_VIDEO_2_LINK_REQUIRED{};
    int aD_VIDEO_2_LINK_WARNING{};
    int aD_VIDEO_2_TAG_DUPLICATED{};
    int aD_VIDEO_2_TAG_LENGTH_TOO_LONG{};
    int aD_VIDEO_2_TAG_REQUIRED{};
    int aDDITIONAL_IMAGE_LINK_LENGTH_TOO_LONG{};
    int aDDITIONAL_IMAGE_LINK_WARNING{};
    int aDWORDS_FORMAT_WARNING{};
    int aDWORDS_SAME_AS_LINK{};
    int aGE_GROUP_INVALID{};
    int aNDROID_DEEP_LINK_INVALID{};
    int aVAILABILITY_DATE_INVALID{};
    int cOUNTRY_DOES_NOT_MAP_TO_CURRENCY{};
    int cUSTOM_LABEL_LENGTH_TOO_LONG{};
    int dESCRIPTION_LENGTH_TOO_LONG{};
    int dUPLICATE_HEADERS{};
    int eXPIRATION_DATE_INVALID{};
    int fETCH_SAME_SIGNATURE{};
    int gENDER_INVALID{};
    int gTIN_INVALID{};
    int iMAGE_LINK_WARNING{};
    int iNCONSISTENT_CURRENCY_VALUES{};
    int iNDEXED_PRODUCT_COUNT_LARGE_DELTA{};
    int iOS_DEEP_LINK_INVALID{};
    int iS_BUNDLE_INVALID{};
    int iTEM_ADDITIONAL_IMAGE_DOWNLOAD_FAILURE{};
    int lINK_FORMAT_WARNING{};
    int mIN_AD_PRICE_INVALID{};
    int mPN_INVALID{};
    int mULTIPACK_INVALID{};
    int oPTIONAL_CONDITION_INVALID{};
    int oPTIONAL_CONDITION_MISSING{};
    int oPTIONAL_PRODUCT_CATEGORY_INVALID{};
    int oPTIONAL_PRODUCT_CATEGORY_MISSING{};
    int pRODUCT_CATEGORY_DEPTH_WARNING{};
    int pRODUCT_TYPE_LENGTH_TOO_LONG{};
    int sALE_DATE_INVALID{};
    int sALES_PRICE_INVALID{};
    int sALES_PRICE_TOO_HIGH{};
    int sALES_PRICE_TOO_LOW{};
    int sHIPPING_HEIGHT_INVALID{};
    int sHIPPING_INVALID{};
    int sHIPPING_WEIGHT_INVALID{};
    int sHIPPING_WIDTH_INVALID{};
    int sIZE_SYSTEM_INVALID{};
    int sIZE_TYPE_INVALID{};
    int tAX_INVALID{};
    int tITLE_LENGTH_TOO_LONG{};
    int tOO_MANY_ADDITIONAL_IMAGE_LINKS{};
    int uPDATED_TIME_INVALID{};
    int uTM_SOURCE_AUTO_CORRECTED{};
    int vIDEO_REQUIRED_WHEN_AD_VIDEO_PROVIDED{};
    int wEIGHT_UNIT_INVALID{};
};
}

#endif /* TINY_CPP_CLIENT_CatalogsFeedValidationWarnings_H_ */
