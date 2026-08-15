
/*
 * UpdatableItemAttributes.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_UpdatableItemAttributes_H_
#define TINY_CPP_CLIENT_UpdatableItemAttributes_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "UpdatableItemAttributes_gtin.h"
#include <list>

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class UpdatableItemAttributes{
public:

    /*! \brief Constructor.
	 */
    UpdatableItemAttributes();
    UpdatableItemAttributes(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~UpdatableItemAttributes();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a> <p><= 2000 characters</p> <p>Ad image link that supplements main image for shopping campaigns.</p> <p>Image format:</p> <ul>   <li>Pixel size at least 75 x 75</li> </ul> <p>Link guidelines:</p> <ul>   <li>Include extension in file name</li>   <li>Do not include template or placeholder images in link</li>   <li>Make URL accessible to Pinterest user-agent</li>   <li>Must start with http:// or https://</li> </ul>
	 */
	std::string getAdImage0Link();

	/*! \brief Set <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a> <p><= 2000 characters</p> <p>Ad image link that supplements main image for shopping campaigns.</p> <p>Image format:</p> <ul>   <li>Pixel size at least 75 x 75</li> </ul> <p>Link guidelines:</p> <ul>   <li>Include extension in file name</li>   <li>Do not include template or placeholder images in link</li>   <li>Make URL accessible to Pinterest user-agent</li>   <li>Must start with http:// or https://</li> </ul>
	 */
	void setAdImage0Link(std::string  ad_image_0_link);
	/*! \brief Get <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a> <p><= 511 characters</p> <p>If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.</p>
	 */
	std::string getAdImage0Tag();

	/*! \brief Set <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a> <p><= 511 characters</p> <p>If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.</p>
	 */
	void setAdImage0Tag(std::string  ad_image_0_tag);
	/*! \brief Get <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a> <p><= 2000 characters</p> <p>Ad image link that supplements main image for shopping campaigns.</p> <p>Image format:</p> <ul>   <li>Pixel size at least 75 x 75</li> </ul> <p>Link guidelines:</p> <ul>   <li>Include extension in file name</li>   <li>Do not include template or placeholder images in link</li>   <li>Make URL accessible to Pinterest user-agent</li>   <li>Must start with http:// or https://</li> </ul>
	 */
	std::string getAdImage10Link();

	/*! \brief Set <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a> <p><= 2000 characters</p> <p>Ad image link that supplements main image for shopping campaigns.</p> <p>Image format:</p> <ul>   <li>Pixel size at least 75 x 75</li> </ul> <p>Link guidelines:</p> <ul>   <li>Include extension in file name</li>   <li>Do not include template or placeholder images in link</li>   <li>Make URL accessible to Pinterest user-agent</li>   <li>Must start with http:// or https://</li> </ul>
	 */
	void setAdImage10Link(std::string  ad_image_10_link);
	/*! \brief Get <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a> <p><= 511 characters</p> <p>If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.</p>
	 */
	std::string getAdImage10Tag();

	/*! \brief Set <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a> <p><= 511 characters</p> <p>If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.</p>
	 */
	void setAdImage10Tag(std::string  ad_image_10_tag);
	/*! \brief Get <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a> <p><= 2000 characters</p> <p>Ad image link that supplements main image for shopping campaigns.</p> <p>Image format:</p> <ul>   <li>Pixel size at least 75 x 75</li> </ul> <p>Link guidelines:</p> <ul>   <li>Include extension in file name</li>   <li>Do not include template or placeholder images in link</li>   <li>Make URL accessible to Pinterest user-agent</li>   <li>Must start with http:// or https://</li> </ul>
	 */
	std::string getAdImage11Link();

	/*! \brief Set <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a> <p><= 2000 characters</p> <p>Ad image link that supplements main image for shopping campaigns.</p> <p>Image format:</p> <ul>   <li>Pixel size at least 75 x 75</li> </ul> <p>Link guidelines:</p> <ul>   <li>Include extension in file name</li>   <li>Do not include template or placeholder images in link</li>   <li>Make URL accessible to Pinterest user-agent</li>   <li>Must start with http:// or https://</li> </ul>
	 */
	void setAdImage11Link(std::string  ad_image_11_link);
	/*! \brief Get <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a> <p><= 511 characters</p> <p>If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.</p>
	 */
	std::string getAdImage11Tag();

	/*! \brief Set <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a> <p><= 511 characters</p> <p>If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.</p>
	 */
	void setAdImage11Tag(std::string  ad_image_11_tag);
	/*! \brief Get <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a> <p><= 2000 characters</p> <p>Ad image link that supplements main image for shopping campaigns.</p> <p>Image format:</p> <ul>   <li>Pixel size at least 75 x 75</li> </ul> <p>Link guidelines:</p> <ul>   <li>Include extension in file name</li>   <li>Do not include template or placeholder images in link</li>   <li>Make URL accessible to Pinterest user-agent</li>   <li>Must start with http:// or https://</li> </ul>
	 */
	std::string getAdImage12Link();

	/*! \brief Set <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a> <p><= 2000 characters</p> <p>Ad image link that supplements main image for shopping campaigns.</p> <p>Image format:</p> <ul>   <li>Pixel size at least 75 x 75</li> </ul> <p>Link guidelines:</p> <ul>   <li>Include extension in file name</li>   <li>Do not include template or placeholder images in link</li>   <li>Make URL accessible to Pinterest user-agent</li>   <li>Must start with http:// or https://</li> </ul>
	 */
	void setAdImage12Link(std::string  ad_image_12_link);
	/*! \brief Get <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a> <p><= 511 characters</p> <p>If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.</p>
	 */
	std::string getAdImage12Tag();

	/*! \brief Set <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a> <p><= 511 characters</p> <p>If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.</p>
	 */
	void setAdImage12Tag(std::string  ad_image_12_tag);
	/*! \brief Get <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a> <p><= 2000 characters</p> <p>Ad image link that supplements main image for shopping campaigns.</p> <p>Image format:</p> <ul>   <li>Pixel size at least 75 x 75</li> </ul> <p>Link guidelines:</p> <ul>   <li>Include extension in file name</li>   <li>Do not include template or placeholder images in link</li>   <li>Make URL accessible to Pinterest user-agent</li>   <li>Must start with http:// or https://</li> </ul>
	 */
	std::string getAdImage13Link();

	/*! \brief Set <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a> <p><= 2000 characters</p> <p>Ad image link that supplements main image for shopping campaigns.</p> <p>Image format:</p> <ul>   <li>Pixel size at least 75 x 75</li> </ul> <p>Link guidelines:</p> <ul>   <li>Include extension in file name</li>   <li>Do not include template or placeholder images in link</li>   <li>Make URL accessible to Pinterest user-agent</li>   <li>Must start with http:// or https://</li> </ul>
	 */
	void setAdImage13Link(std::string  ad_image_13_link);
	/*! \brief Get <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a> <p><= 511 characters</p> <p>If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.</p>
	 */
	std::string getAdImage13Tag();

	/*! \brief Set <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a> <p><= 511 characters</p> <p>If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.</p>
	 */
	void setAdImage13Tag(std::string  ad_image_13_tag);
	/*! \brief Get <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a> <p><= 2000 characters</p> <p>Ad image link that supplements main image for shopping campaigns.</p> <p>Image format:</p> <ul>   <li>Pixel size at least 75 x 75</li> </ul> <p>Link guidelines:</p> <ul>   <li>Include extension in file name</li>   <li>Do not include template or placeholder images in link</li>   <li>Make URL accessible to Pinterest user-agent</li>   <li>Must start with http:// or https://</li> </ul>
	 */
	std::string getAdImage14Link();

	/*! \brief Set <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a> <p><= 2000 characters</p> <p>Ad image link that supplements main image for shopping campaigns.</p> <p>Image format:</p> <ul>   <li>Pixel size at least 75 x 75</li> </ul> <p>Link guidelines:</p> <ul>   <li>Include extension in file name</li>   <li>Do not include template or placeholder images in link</li>   <li>Make URL accessible to Pinterest user-agent</li>   <li>Must start with http:// or https://</li> </ul>
	 */
	void setAdImage14Link(std::string  ad_image_14_link);
	/*! \brief Get <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a> <p><= 511 characters</p> <p>If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.</p>
	 */
	std::string getAdImage14Tag();

	/*! \brief Set <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a> <p><= 511 characters</p> <p>If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.</p>
	 */
	void setAdImage14Tag(std::string  ad_image_14_tag);
	/*! \brief Get <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a> <p><= 2000 characters</p> <p>Ad image link that supplements main image for shopping campaigns.</p> <p>Image format:</p> <ul>   <li>Pixel size at least 75 x 75</li> </ul> <p>Link guidelines:</p> <ul>   <li>Include extension in file name</li>   <li>Do not include template or placeholder images in link</li>   <li>Make URL accessible to Pinterest user-agent</li>   <li>Must start with http:// or https://</li> </ul>
	 */
	std::string getAdImage15Link();

	/*! \brief Set <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a> <p><= 2000 characters</p> <p>Ad image link that supplements main image for shopping campaigns.</p> <p>Image format:</p> <ul>   <li>Pixel size at least 75 x 75</li> </ul> <p>Link guidelines:</p> <ul>   <li>Include extension in file name</li>   <li>Do not include template or placeholder images in link</li>   <li>Make URL accessible to Pinterest user-agent</li>   <li>Must start with http:// or https://</li> </ul>
	 */
	void setAdImage15Link(std::string  ad_image_15_link);
	/*! \brief Get <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a> <p><= 511 characters</p> <p>If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.</p>
	 */
	std::string getAdImage15Tag();

	/*! \brief Set <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a> <p><= 511 characters</p> <p>If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.</p>
	 */
	void setAdImage15Tag(std::string  ad_image_15_tag);
	/*! \brief Get <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a> <p><= 2000 characters</p> <p>Ad image link that supplements main image for shopping campaigns.</p> <p>Image format:</p> <ul>   <li>Pixel size at least 75 x 75</li> </ul> <p>Link guidelines:</p> <ul>   <li>Include extension in file name</li>   <li>Do not include template or placeholder images in link</li>   <li>Make URL accessible to Pinterest user-agent</li>   <li>Must start with http:// or https://</li> </ul>
	 */
	std::string getAdImage16Link();

	/*! \brief Set <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a> <p><= 2000 characters</p> <p>Ad image link that supplements main image for shopping campaigns.</p> <p>Image format:</p> <ul>   <li>Pixel size at least 75 x 75</li> </ul> <p>Link guidelines:</p> <ul>   <li>Include extension in file name</li>   <li>Do not include template or placeholder images in link</li>   <li>Make URL accessible to Pinterest user-agent</li>   <li>Must start with http:// or https://</li> </ul>
	 */
	void setAdImage16Link(std::string  ad_image_16_link);
	/*! \brief Get <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a> <p><= 511 characters</p> <p>If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.</p>
	 */
	std::string getAdImage16Tag();

	/*! \brief Set <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a> <p><= 511 characters</p> <p>If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.</p>
	 */
	void setAdImage16Tag(std::string  ad_image_16_tag);
	/*! \brief Get <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a> <p><= 2000 characters</p> <p>Ad image link that supplements main image for shopping campaigns.</p> <p>Image format:</p> <ul>   <li>Pixel size at least 75 x 75</li> </ul> <p>Link guidelines:</p> <ul>   <li>Include extension in file name</li>   <li>Do not include template or placeholder images in link</li>   <li>Make URL accessible to Pinterest user-agent</li>   <li>Must start with http:// or https://</li> </ul>
	 */
	std::string getAdImage17Link();

	/*! \brief Set <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a> <p><= 2000 characters</p> <p>Ad image link that supplements main image for shopping campaigns.</p> <p>Image format:</p> <ul>   <li>Pixel size at least 75 x 75</li> </ul> <p>Link guidelines:</p> <ul>   <li>Include extension in file name</li>   <li>Do not include template or placeholder images in link</li>   <li>Make URL accessible to Pinterest user-agent</li>   <li>Must start with http:// or https://</li> </ul>
	 */
	void setAdImage17Link(std::string  ad_image_17_link);
	/*! \brief Get <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a> <p><= 511 characters</p> <p>If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.</p>
	 */
	std::string getAdImage17Tag();

	/*! \brief Set <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a> <p><= 511 characters</p> <p>If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.</p>
	 */
	void setAdImage17Tag(std::string  ad_image_17_tag);
	/*! \brief Get <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a> <p><= 2000 characters</p> <p>Ad image link that supplements main image for shopping campaigns.</p> <p>Image format:</p> <ul>   <li>Pixel size at least 75 x 75</li> </ul> <p>Link guidelines:</p> <ul>   <li>Include extension in file name</li>   <li>Do not include template or placeholder images in link</li>   <li>Make URL accessible to Pinterest user-agent</li>   <li>Must start with http:// or https://</li> </ul>
	 */
	std::string getAdImage18Link();

	/*! \brief Set <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a> <p><= 2000 characters</p> <p>Ad image link that supplements main image for shopping campaigns.</p> <p>Image format:</p> <ul>   <li>Pixel size at least 75 x 75</li> </ul> <p>Link guidelines:</p> <ul>   <li>Include extension in file name</li>   <li>Do not include template or placeholder images in link</li>   <li>Make URL accessible to Pinterest user-agent</li>   <li>Must start with http:// or https://</li> </ul>
	 */
	void setAdImage18Link(std::string  ad_image_18_link);
	/*! \brief Get <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a> <p><= 511 characters</p> <p>If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.</p>
	 */
	std::string getAdImage18Tag();

	/*! \brief Set <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a> <p><= 511 characters</p> <p>If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.</p>
	 */
	void setAdImage18Tag(std::string  ad_image_18_tag);
	/*! \brief Get <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a> <p><= 2000 characters</p> <p>Ad image link that supplements main image for shopping campaigns.</p> <p>Image format:</p> <ul>   <li>Pixel size at least 75 x 75</li> </ul> <p>Link guidelines:</p> <ul>   <li>Include extension in file name</li>   <li>Do not include template or placeholder images in link</li>   <li>Make URL accessible to Pinterest user-agent</li>   <li>Must start with http:// or https://</li> </ul>
	 */
	std::string getAdImage19Link();

	/*! \brief Set <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a> <p><= 2000 characters</p> <p>Ad image link that supplements main image for shopping campaigns.</p> <p>Image format:</p> <ul>   <li>Pixel size at least 75 x 75</li> </ul> <p>Link guidelines:</p> <ul>   <li>Include extension in file name</li>   <li>Do not include template or placeholder images in link</li>   <li>Make URL accessible to Pinterest user-agent</li>   <li>Must start with http:// or https://</li> </ul>
	 */
	void setAdImage19Link(std::string  ad_image_19_link);
	/*! \brief Get <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a> <p><= 511 characters</p> <p>If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.</p>
	 */
	std::string getAdImage19Tag();

	/*! \brief Set <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a> <p><= 511 characters</p> <p>If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.</p>
	 */
	void setAdImage19Tag(std::string  ad_image_19_tag);
	/*! \brief Get <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a> <p><= 2000 characters</p> <p>Ad image link that supplements main image for shopping campaigns.</p> <p>Image format:</p> <ul>   <li>Pixel size at least 75 x 75</li> </ul> <p>Link guidelines:</p> <ul>   <li>Include extension in file name</li>   <li>Do not include template or placeholder images in link</li>   <li>Make URL accessible to Pinterest user-agent</li>   <li>Must start with http:// or https://</li> </ul>
	 */
	std::string getAdImage1Link();

	/*! \brief Set <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a> <p><= 2000 characters</p> <p>Ad image link that supplements main image for shopping campaigns.</p> <p>Image format:</p> <ul>   <li>Pixel size at least 75 x 75</li> </ul> <p>Link guidelines:</p> <ul>   <li>Include extension in file name</li>   <li>Do not include template or placeholder images in link</li>   <li>Make URL accessible to Pinterest user-agent</li>   <li>Must start with http:// or https://</li> </ul>
	 */
	void setAdImage1Link(std::string  ad_image_1_link);
	/*! \brief Get <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a> <p><= 511 characters</p> <p>If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.</p>
	 */
	std::string getAdImage1Tag();

	/*! \brief Set <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a> <p><= 511 characters</p> <p>If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.</p>
	 */
	void setAdImage1Tag(std::string  ad_image_1_tag);
	/*! \brief Get <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a> <p><= 2000 characters</p> <p>Ad image link that supplements main image for shopping campaigns.</p> <p>Image format:</p> <ul>   <li>Pixel size at least 75 x 75</li> </ul> <p>Link guidelines:</p> <ul>   <li>Include extension in file name</li>   <li>Do not include template or placeholder images in link</li>   <li>Make URL accessible to Pinterest user-agent</li>   <li>Must start with http:// or https://</li> </ul>
	 */
	std::string getAdImage2Link();

	/*! \brief Set <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a> <p><= 2000 characters</p> <p>Ad image link that supplements main image for shopping campaigns.</p> <p>Image format:</p> <ul>   <li>Pixel size at least 75 x 75</li> </ul> <p>Link guidelines:</p> <ul>   <li>Include extension in file name</li>   <li>Do not include template or placeholder images in link</li>   <li>Make URL accessible to Pinterest user-agent</li>   <li>Must start with http:// or https://</li> </ul>
	 */
	void setAdImage2Link(std::string  ad_image_2_link);
	/*! \brief Get <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a> <p><= 511 characters</p> <p>If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.</p>
	 */
	std::string getAdImage2Tag();

	/*! \brief Set <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a> <p><= 511 characters</p> <p>If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.</p>
	 */
	void setAdImage2Tag(std::string  ad_image_2_tag);
	/*! \brief Get <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a> <p><= 2000 characters</p> <p>Ad image link that supplements main image for shopping campaigns.</p> <p>Image format:</p> <ul>   <li>Pixel size at least 75 x 75</li> </ul> <p>Link guidelines:</p> <ul>   <li>Include extension in file name</li>   <li>Do not include template or placeholder images in link</li>   <li>Make URL accessible to Pinterest user-agent</li>   <li>Must start with http:// or https://</li> </ul>
	 */
	std::string getAdImage3Link();

	/*! \brief Set <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a> <p><= 2000 characters</p> <p>Ad image link that supplements main image for shopping campaigns.</p> <p>Image format:</p> <ul>   <li>Pixel size at least 75 x 75</li> </ul> <p>Link guidelines:</p> <ul>   <li>Include extension in file name</li>   <li>Do not include template or placeholder images in link</li>   <li>Make URL accessible to Pinterest user-agent</li>   <li>Must start with http:// or https://</li> </ul>
	 */
	void setAdImage3Link(std::string  ad_image_3_link);
	/*! \brief Get <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a> <p><= 511 characters</p> <p>If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.</p>
	 */
	std::string getAdImage3Tag();

	/*! \brief Set <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a> <p><= 511 characters</p> <p>If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.</p>
	 */
	void setAdImage3Tag(std::string  ad_image_3_tag);
	/*! \brief Get <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a> <p><= 2000 characters</p> <p>Ad image link that supplements main image for shopping campaigns.</p> <p>Image format:</p> <ul>   <li>Pixel size at least 75 x 75</li> </ul> <p>Link guidelines:</p> <ul>   <li>Include extension in file name</li>   <li>Do not include template or placeholder images in link</li>   <li>Make URL accessible to Pinterest user-agent</li>   <li>Must start with http:// or https://</li> </ul>
	 */
	std::string getAdImage4Link();

	/*! \brief Set <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a> <p><= 2000 characters</p> <p>Ad image link that supplements main image for shopping campaigns.</p> <p>Image format:</p> <ul>   <li>Pixel size at least 75 x 75</li> </ul> <p>Link guidelines:</p> <ul>   <li>Include extension in file name</li>   <li>Do not include template or placeholder images in link</li>   <li>Make URL accessible to Pinterest user-agent</li>   <li>Must start with http:// or https://</li> </ul>
	 */
	void setAdImage4Link(std::string  ad_image_4_link);
	/*! \brief Get <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a> <p><= 511 characters</p> <p>If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.</p>
	 */
	std::string getAdImage4Tag();

	/*! \brief Set <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a> <p><= 511 characters</p> <p>If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.</p>
	 */
	void setAdImage4Tag(std::string  ad_image_4_tag);
	/*! \brief Get <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a> <p><= 2000 characters</p> <p>Ad image link that supplements main image for shopping campaigns.</p> <p>Image format:</p> <ul>   <li>Pixel size at least 75 x 75</li> </ul> <p>Link guidelines:</p> <ul>   <li>Include extension in file name</li>   <li>Do not include template or placeholder images in link</li>   <li>Make URL accessible to Pinterest user-agent</li>   <li>Must start with http:// or https://</li> </ul>
	 */
	std::string getAdImage5Link();

	/*! \brief Set <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a> <p><= 2000 characters</p> <p>Ad image link that supplements main image for shopping campaigns.</p> <p>Image format:</p> <ul>   <li>Pixel size at least 75 x 75</li> </ul> <p>Link guidelines:</p> <ul>   <li>Include extension in file name</li>   <li>Do not include template or placeholder images in link</li>   <li>Make URL accessible to Pinterest user-agent</li>   <li>Must start with http:// or https://</li> </ul>
	 */
	void setAdImage5Link(std::string  ad_image_5_link);
	/*! \brief Get <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a> <p><= 511 characters</p> <p>If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.</p>
	 */
	std::string getAdImage5Tag();

	/*! \brief Set <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a> <p><= 511 characters</p> <p>If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.</p>
	 */
	void setAdImage5Tag(std::string  ad_image_5_tag);
	/*! \brief Get <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a> <p><= 2000 characters</p> <p>Ad image link that supplements main image for shopping campaigns.</p> <p>Image format:</p> <ul>   <li>Pixel size at least 75 x 75</li> </ul> <p>Link guidelines:</p> <ul>   <li>Include extension in file name</li>   <li>Do not include template or placeholder images in link</li>   <li>Make URL accessible to Pinterest user-agent</li>   <li>Must start with http:// or https://</li> </ul>
	 */
	std::string getAdImage6Link();

	/*! \brief Set <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a> <p><= 2000 characters</p> <p>Ad image link that supplements main image for shopping campaigns.</p> <p>Image format:</p> <ul>   <li>Pixel size at least 75 x 75</li> </ul> <p>Link guidelines:</p> <ul>   <li>Include extension in file name</li>   <li>Do not include template or placeholder images in link</li>   <li>Make URL accessible to Pinterest user-agent</li>   <li>Must start with http:// or https://</li> </ul>
	 */
	void setAdImage6Link(std::string  ad_image_6_link);
	/*! \brief Get <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a> <p><= 511 characters</p> <p>If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.</p>
	 */
	std::string getAdImage6Tag();

	/*! \brief Set <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a> <p><= 511 characters</p> <p>If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.</p>
	 */
	void setAdImage6Tag(std::string  ad_image_6_tag);
	/*! \brief Get <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a> <p><= 2000 characters</p> <p>Ad image link that supplements main image for shopping campaigns.</p> <p>Image format:</p> <ul>   <li>Pixel size at least 75 x 75</li> </ul> <p>Link guidelines:</p> <ul>   <li>Include extension in file name</li>   <li>Do not include template or placeholder images in link</li>   <li>Make URL accessible to Pinterest user-agent</li>   <li>Must start with http:// or https://</li> </ul>
	 */
	std::string getAdImage7Link();

	/*! \brief Set <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a> <p><= 2000 characters</p> <p>Ad image link that supplements main image for shopping campaigns.</p> <p>Image format:</p> <ul>   <li>Pixel size at least 75 x 75</li> </ul> <p>Link guidelines:</p> <ul>   <li>Include extension in file name</li>   <li>Do not include template or placeholder images in link</li>   <li>Make URL accessible to Pinterest user-agent</li>   <li>Must start with http:// or https://</li> </ul>
	 */
	void setAdImage7Link(std::string  ad_image_7_link);
	/*! \brief Get <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a> <p><= 511 characters</p> <p>If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.</p>
	 */
	std::string getAdImage7Tag();

	/*! \brief Set <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a> <p><= 511 characters</p> <p>If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.</p>
	 */
	void setAdImage7Tag(std::string  ad_image_7_tag);
	/*! \brief Get <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a> <p><= 2000 characters</p> <p>Ad image link that supplements main image for shopping campaigns.</p> <p>Image format:</p> <ul>   <li>Pixel size at least 75 x 75</li> </ul> <p>Link guidelines:</p> <ul>   <li>Include extension in file name</li>   <li>Do not include template or placeholder images in link</li>   <li>Make URL accessible to Pinterest user-agent</li>   <li>Must start with http:// or https://</li> </ul>
	 */
	std::string getAdImage8Link();

	/*! \brief Set <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a> <p><= 2000 characters</p> <p>Ad image link that supplements main image for shopping campaigns.</p> <p>Image format:</p> <ul>   <li>Pixel size at least 75 x 75</li> </ul> <p>Link guidelines:</p> <ul>   <li>Include extension in file name</li>   <li>Do not include template or placeholder images in link</li>   <li>Make URL accessible to Pinterest user-agent</li>   <li>Must start with http:// or https://</li> </ul>
	 */
	void setAdImage8Link(std::string  ad_image_8_link);
	/*! \brief Get <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a> <p><= 511 characters</p> <p>If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.</p>
	 */
	std::string getAdImage8Tag();

	/*! \brief Set <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a> <p><= 511 characters</p> <p>If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.</p>
	 */
	void setAdImage8Tag(std::string  ad_image_8_tag);
	/*! \brief Get <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a> <p><= 2000 characters</p> <p>Ad image link that supplements main image for shopping campaigns.</p> <p>Image format:</p> <ul>   <li>Pixel size at least 75 x 75</li> </ul> <p>Link guidelines:</p> <ul>   <li>Include extension in file name</li>   <li>Do not include template or placeholder images in link</li>   <li>Make URL accessible to Pinterest user-agent</li>   <li>Must start with http:// or https://</li> </ul>
	 */
	std::string getAdImage9Link();

	/*! \brief Set <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a> <p><= 2000 characters</p> <p>Ad image link that supplements main image for shopping campaigns.</p> <p>Image format:</p> <ul>   <li>Pixel size at least 75 x 75</li> </ul> <p>Link guidelines:</p> <ul>   <li>Include extension in file name</li>   <li>Do not include template or placeholder images in link</li>   <li>Make URL accessible to Pinterest user-agent</li>   <li>Must start with http:// or https://</li> </ul>
	 */
	void setAdImage9Link(std::string  ad_image_9_link);
	/*! \brief Get <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a> <p><= 511 characters</p> <p>If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.</p>
	 */
	std::string getAdImage9Tag();

	/*! \brief Set <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a> <p><= 511 characters</p> <p>If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.</p>
	 */
	void setAdImage9Tag(std::string  ad_image_9_tag);
	/*! \brief Get Allows advertisers to specify a separate URL that can be used to track traffic coming from Pinterest shopping ads. Must send full URL including tracking—do not send tracking parameters only. At this time we do not support impression tracking. Must begin with http:// or https://.
	 */
	std::string getAdLink();

	/*! \brief Set Allows advertisers to specify a separate URL that can be used to track traffic coming from Pinterest shopping ads. Must send full URL including tracking—do not send tracking parameters only. At this time we do not support impression tracking. Must begin with http:// or https://.
	 */
	void setAdLink(std::string  ad_link);
	/*! \brief Get <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a> <p><= 2000 characters</p> <p>Ad video link that supplements main video for shopping campaigns.</p> <p>Video format:</p> <ul>   <li>Pixel size between 75 x 75 and 9450 x 9450</li>   <li>File size smaller than 2 GB</li>   <li>Time span between 4 seconds and 15 minutes</li>   <li>Accepted formats: .MP4, .MOV, .M4V</li> </ul> <p>Link guidelines:</p> <ul>   <li>Include extension in file name</li>   <li>Do not include template or placeholder videos in link</li>   <li>Make URL accessible to Pinterest user-agent</li>   <li>Must start with http:// or https://</li> </ul>
	 */
	std::string getAdVideo0Link();

	/*! \brief Set <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a> <p><= 2000 characters</p> <p>Ad video link that supplements main video for shopping campaigns.</p> <p>Video format:</p> <ul>   <li>Pixel size between 75 x 75 and 9450 x 9450</li>   <li>File size smaller than 2 GB</li>   <li>Time span between 4 seconds and 15 minutes</li>   <li>Accepted formats: .MP4, .MOV, .M4V</li> </ul> <p>Link guidelines:</p> <ul>   <li>Include extension in file name</li>   <li>Do not include template or placeholder videos in link</li>   <li>Make URL accessible to Pinterest user-agent</li>   <li>Must start with http:// or https://</li> </ul>
	 */
	void setAdVideo0Link(std::string  ad_video_0_link);
	/*! \brief Get <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a> <p><= 511 characters</p> <p>If you provide an ad_video_x_link, include the video tag with the corresponding ad_video_x_tag attribute.</p>
	 */
	std::string getAdVideo0Tag();

	/*! \brief Set <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a> <p><= 511 characters</p> <p>If you provide an ad_video_x_link, include the video tag with the corresponding ad_video_x_tag attribute.</p>
	 */
	void setAdVideo0Tag(std::string  ad_video_0_tag);
	/*! \brief Get <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a> <p><= 2000 characters</p> <p>Ad video link that supplements main video for shopping campaigns.</p> <p>Video format:</p> <ul>   <li>Pixel size between 75 x 75 and 9450 x 9450</li>   <li>File size smaller than 2 GB</li>   <li>Time span between 4 seconds and 15 minutes</li>   <li>Accepted formats: .MP4, .MOV, .M4V</li> </ul> <p>Link guidelines:</p> <ul>   <li>Include extension in file name</li>   <li>Do not include template or placeholder videos in link</li>   <li>Make URL accessible to Pinterest user-agent</li>   <li>Must start with http:// or https://</li> </ul>
	 */
	std::string getAdVideo1Link();

	/*! \brief Set <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a> <p><= 2000 characters</p> <p>Ad video link that supplements main video for shopping campaigns.</p> <p>Video format:</p> <ul>   <li>Pixel size between 75 x 75 and 9450 x 9450</li>   <li>File size smaller than 2 GB</li>   <li>Time span between 4 seconds and 15 minutes</li>   <li>Accepted formats: .MP4, .MOV, .M4V</li> </ul> <p>Link guidelines:</p> <ul>   <li>Include extension in file name</li>   <li>Do not include template or placeholder videos in link</li>   <li>Make URL accessible to Pinterest user-agent</li>   <li>Must start with http:// or https://</li> </ul>
	 */
	void setAdVideo1Link(std::string  ad_video_1_link);
	/*! \brief Get <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a> <p><= 511 characters</p> <p>If you provide an ad_video_x_link, include the video tag with the corresponding ad_video_x_tag attribute.</p>
	 */
	std::string getAdVideo1Tag();

	/*! \brief Set <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a> <p><= 511 characters</p> <p>If you provide an ad_video_x_link, include the video tag with the corresponding ad_video_x_tag attribute.</p>
	 */
	void setAdVideo1Tag(std::string  ad_video_1_tag);
	/*! \brief Get <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a> <p><= 2000 characters</p> <p>Ad video link that supplements main video for shopping campaigns.</p> <p>Video format:</p> <ul>   <li>Pixel size between 75 x 75 and 9450 x 9450</li>   <li>File size smaller than 2 GB</li>   <li>Time span between 4 seconds and 15 minutes</li>   <li>Accepted formats: .MP4, .MOV, .M4V</li> </ul> <p>Link guidelines:</p> <ul>   <li>Include extension in file name</li>   <li>Do not include template or placeholder videos in link</li>   <li>Make URL accessible to Pinterest user-agent</li>   <li>Must start with http:// or https://</li> </ul>
	 */
	std::string getAdVideo2Link();

	/*! \brief Set <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a> <p><= 2000 characters</p> <p>Ad video link that supplements main video for shopping campaigns.</p> <p>Video format:</p> <ul>   <li>Pixel size between 75 x 75 and 9450 x 9450</li>   <li>File size smaller than 2 GB</li>   <li>Time span between 4 seconds and 15 minutes</li>   <li>Accepted formats: .MP4, .MOV, .M4V</li> </ul> <p>Link guidelines:</p> <ul>   <li>Include extension in file name</li>   <li>Do not include template or placeholder videos in link</li>   <li>Make URL accessible to Pinterest user-agent</li>   <li>Must start with http:// or https://</li> </ul>
	 */
	void setAdVideo2Link(std::string  ad_video_2_link);
	/*! \brief Get <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a> <p><= 511 characters</p> <p>If you provide an ad_video_x_link, include the video tag with the corresponding ad_video_x_tag attribute.</p>
	 */
	std::string getAdVideo2Tag();

	/*! \brief Set <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a> <p><= 511 characters</p> <p>If you provide an ad_video_x_link, include the video tag with the corresponding ad_video_x_tag attribute.</p>
	 */
	void setAdVideo2Tag(std::string  ad_video_2_tag);
	/*! \brief Get Set this attribute to TRUE if you're submitting items that are considered “adult”. These will not be shown on Pinterest.
	 */
	bool isAdult();

	/*! \brief Set Set this attribute to TRUE if you're submitting items that are considered “adult”. These will not be shown on Pinterest.
	 */
	void setAdult(bool  adult);
	/*! \brief Get The age group to apply a demographic range to the product. Must be one of the following values (upper or lowercased): ‘newborn’, ‘infant’, ‘toddler’, ‘kids’, or ‘adult’.
	 */
	std::string getAgeGroup();

	/*! \brief Set The age group to apply a demographic range to the product. Must be one of the following values (upper or lowercased): ‘newborn’, ‘infant’, ‘toddler’, ‘kids’, or ‘adult’.
	 */
	void setAgeGroup(std::string  age_group);
	/*! \brief Get The deep link to the product on the Android app.
	 */
	std::string getAndroidDeepLink();

	/*! \brief Set The deep link to the product on the Android app.
	 */
	void setAndroidDeepLink(std::string  android_deep_link);
	/*! \brief Get The availability of the product. Must be one of the following values (upper or lowercased): ‘in stock’, ‘out of stock’, ‘preorder’.
	 */
	std::string getAvailability();

	/*! \brief Set The availability of the product. Must be one of the following values (upper or lowercased): ‘in stock’, ‘out of stock’, ‘preorder’.
	 */
	void setAvailability(std::string  availability);
	/*! \brief Get Average reviews for the item. Can be a number from 1-5.
	 */
	long getAverageReviewRating();

	/*! \brief Set Average reviews for the item. Can be a number from 1-5.
	 */
	void setAverageReviewRating(long  average_review_rating);
	/*! \brief Get The brand of the product.
	 */
	std::string getBrand();

	/*! \brief Set The brand of the product.
	 */
	void setBrand(std::string  brand);
	/*! \brief Get This attribute is not supported anymore.
	 */
	bool isCheckoutEnabled();

	/*! \brief Set This attribute is not supported anymore.
	 */
	void setCheckoutEnabled(bool  checkout_enabled);
	/*! \brief Get The primary color of the product.
	 */
	std::string getColor();

	/*! \brief Set The primary color of the product.
	 */
	void setColor(std::string  color);
	/*! \brief Get The condition of the product. Must be one of the following values (upper or lowercased): ‘new’, ‘used’, or ‘refurbished’.
	 */
	std::string getCondition();

	/*! \brief Set The condition of the product. Must be one of the following values (upper or lowercased): ‘new’, ‘used’, or ‘refurbished’.
	 */
	void setCondition(std::string  condition);
	/*! \brief Get <p><= 511 characters for retail and creative asset catalogs, <= 127 characters for hotel catalogs</p> <p>Custom grouping of products.</p>
	 */
	std::string getCustomLabel0();

	/*! \brief Set <p><= 511 characters for retail and creative asset catalogs, <= 127 characters for hotel catalogs</p> <p>Custom grouping of products.</p>
	 */
	void setCustomLabel0(std::string  custom_label_0);
	/*! \brief Get <p><= 511 characters for retail and creative asset catalogs, <= 127 characters for hotel catalogs</p> <p>Custom grouping of products.</p>
	 */
	std::string getCustomLabel1();

	/*! \brief Set <p><= 511 characters for retail and creative asset catalogs, <= 127 characters for hotel catalogs</p> <p>Custom grouping of products.</p>
	 */
	void setCustomLabel1(std::string  custom_label_1);
	/*! \brief Get <p><= 511 characters for retail and creative asset catalogs, <= 127 characters for hotel catalogs</p> <p>Custom grouping of products.</p>
	 */
	std::string getCustomLabel2();

	/*! \brief Set <p><= 511 characters for retail and creative asset catalogs, <= 127 characters for hotel catalogs</p> <p>Custom grouping of products.</p>
	 */
	void setCustomLabel2(std::string  custom_label_2);
	/*! \brief Get <p><= 511 characters for retail and creative asset catalogs, <= 127 characters for hotel catalogs</p> <p>Custom grouping of products.</p>
	 */
	std::string getCustomLabel3();

	/*! \brief Set <p><= 511 characters for retail and creative asset catalogs, <= 127 characters for hotel catalogs</p> <p>Custom grouping of products.</p>
	 */
	void setCustomLabel3(std::string  custom_label_3);
	/*! \brief Get <p><= 511 characters for retail and creative asset catalogs, <= 127 characters for hotel catalogs</p> <p>Custom grouping of products.</p>
	 */
	std::string getCustomLabel4();

	/*! \brief Set <p><= 511 characters for retail and creative asset catalogs, <= 127 characters for hotel catalogs</p> <p>Custom grouping of products.</p>
	 */
	void setCustomLabel4(std::string  custom_label_4);
	/*! \brief Get an attribute for any integer information ranging from 0 to 4,294,967,295, which can be used to group items.
	 */
	int getCustomNumber0();

	/*! \brief Set an attribute for any integer information ranging from 0 to 4,294,967,295, which can be used to group items.
	 */
	void setCustomNumber0(int  custom_number_0);
	/*! \brief Get an attribute for any integer information ranging from 0 to 4,294,967,295, which can be used to group items.
	 */
	int getCustomNumber1();

	/*! \brief Set an attribute for any integer information ranging from 0 to 4,294,967,295, which can be used to group items.
	 */
	void setCustomNumber1(int  custom_number_1);
	/*! \brief Get an attribute for any integer information ranging from 0 to 4,294,967,295, which can be used to group items.
	 */
	int getCustomNumber2();

	/*! \brief Set an attribute for any integer information ranging from 0 to 4,294,967,295, which can be used to group items.
	 */
	void setCustomNumber2(int  custom_number_2);
	/*! \brief Get an attribute for any integer information ranging from 0 to 4,294,967,295, which can be used to group items.
	 */
	int getCustomNumber3();

	/*! \brief Set an attribute for any integer information ranging from 0 to 4,294,967,295, which can be used to group items.
	 */
	void setCustomNumber3(int  custom_number_3);
	/*! \brief Get an attribute for any integer information ranging from 0 to 4,294,967,295, which can be used to group items.
	 */
	int getCustomNumber4();

	/*! \brief Set an attribute for any integer information ranging from 0 to 4,294,967,295, which can be used to group items.
	 */
	void setCustomNumber4(int  custom_number_4);
	/*! \brief Get <p><= 10000 characters</p> <p>The description of the product.</p>
	 */
	std::string getDescription();

	/*! \brief Set <p><= 10000 characters</p> <p>The description of the product.</p>
	 */
	void setDescription(std::string  description);
	/*! \brief Get The item is free to ship.
	 */
	bool isFreeShippingLabel();

	/*! \brief Set The item is free to ship.
	 */
	void setFreeShippingLabel(bool  free_shipping_label);
	/*! \brief Get The minimum order purchase necessary for the customer to get free shipping. Only relevant if free shipping is offered.
	 */
	std::string getFreeShippingLimit();

	/*! \brief Set The minimum order purchase necessary for the customer to get free shipping. Only relevant if free shipping is offered.
	 */
	void setFreeShippingLimit(std::string  free_shipping_limit);
	/*! \brief Get The gender associated with the product. Must be one of the following values (upper or lowercased): ‘male’, ‘female’, or ‘unisex’.
	 */
	std::string getGender();

	/*! \brief Set The gender associated with the product. Must be one of the following values (upper or lowercased): ‘male’, ‘female’, or ‘unisex’.
	 */
	void setGender(std::string  gender);
	/*! \brief Get The categorization of the product based on the standardized Google Product Taxonomy. This is a set taxonomy. Both the text values and numeric codes are accepted.
	 */
	std::string getGoogleProductCategory();

	/*! \brief Set The categorization of the product based on the standardized Google Product Taxonomy. This is a set taxonomy. Both the text values and numeric codes are accepted.
	 */
	void setGoogleProductCategory(std::string  google_product_category);
	/*! \brief Get 
	 */
	UpdatableItemAttributes_gtin getGtin();

	/*! \brief Set 
	 */
	void setGtin(UpdatableItemAttributes_gtin  gtin);
	/*! \brief Get <p><= 127 characters</p> <p>The user-created unique ID that represents the product. Only Unicode characters are accepted.</p>
	 */
	std::string getId();

	/*! \brief Set <p><= 127 characters</p> <p>The user-created unique ID that represents the product. Only Unicode characters are accepted.</p>
	 */
	void setId(std::string  id);
	/*! \brief Get Installment price of the product. This data will only be shown to pinners in the enabled countries. Expected format: <payment_count>:<payment_amount> <currency>
	 */
	std::string getInstallmentPrice();

	/*! \brief Set Installment price of the product. This data will only be shown to pinners in the enabled countries. Expected format: <payment_count>:<payment_amount> <currency>
	 */
	void setInstallmentPrice(std::string  installment_price);
	/*! \brief Get The deep link to the product on the iOS app.
	 */
	std::string getIosDeepLink();

	/*! \brief Set The deep link to the product on the iOS app.
	 */
	void setIosDeepLink(std::string  ios_deep_link);
	/*! \brief Get <p><= 127 characters</p> <p>The parent ID of the product.</p>
	 */
	std::string getItemGroupId();

	/*! \brief Set <p><= 127 characters</p> <p>The parent ID of the product.</p>
	 */
	void setItemGroupId(std::string  item_group_id);
	/*! \brief Get The millisecond timestamp when the item was lastly modified by the merchant.
	 */
	long getLastUpdatedTime();

	/*! \brief Set The millisecond timestamp when the item was lastly modified by the merchant.
	 */
	void setLastUpdatedTime(long  last_updated_time);
	/*! \brief Get <p><= 511 characters</p> <p>The landing page for the product.</p>
	 */
	std::string getLink();

	/*! \brief Set <p><= 511 characters</p> <p>The landing page for the product.</p>
	 */
	void setLink(std::string  link);
	/*! \brief Get The material used to make the product.
	 */
	std::string getMaterial();

	/*! \brief Set The material used to make the product.
	 */
	void setMaterial(std::string  material);
	/*! \brief Get The minimum advertised price of the product. It supports the following formats, \"19.99 USD\", \"19.99USD\" and \"19.99\". If the currency is not included, we default to US dollars.
	 */
	std::string getMinAdPrice();

	/*! \brief Set The minimum advertised price of the product. It supports the following formats, \"19.99 USD\", \"19.99USD\" and \"19.99\". If the currency is not included, we default to US dollars.
	 */
	void setMinAdPrice(std::string  min_ad_price);
	/*! \brief Get The mobile-optimized version of your landing page. Must begin with http:// or https://.
	 */
	std::string getMobileLink();

	/*! \brief Set The mobile-optimized version of your landing page. Must begin with http:// or https://.
	 */
	void setMobileLink(std::string  mobile_link);
	/*! \brief Get Manufacturer Part Number are alpha-numeric codes created by the manufacturer of a product to uniquely identify it among all products from the same manufacturer.
	 */
	std::string getMpn();

	/*! \brief Set Manufacturer Part Number are alpha-numeric codes created by the manufacturer of a product to uniquely identify it among all products from the same manufacturer.
	 */
	void setMpn(std::string  mpn);
	/*! \brief Get The number of ratings for the item.
	 */
	int getNumberOfRatings();

	/*! \brief Set The number of ratings for the item.
	 */
	void setNumberOfRatings(int  number_of_ratings);
	/*! \brief Get The number of reviews available for the item.
	 */
	int getNumberOfReviews();

	/*! \brief Set The number of reviews available for the item.
	 */
	void setNumberOfReviews(int  number_of_reviews);
	/*! \brief Get The description of the pattern used for the product.
	 */
	std::string getPattern();

	/*! \brief Set The description of the pattern used for the product.
	 */
	void setPattern(std::string  pattern);
	/*! \brief Get The price of the product. It supports the following formats, \"24.99 USD\", \"24.99USD\" and \"24.99\". If the currency is not included, we default to US dollars.
	 */
	std::string getPrice();

	/*! \brief Set The price of the product. It supports the following formats, \"24.99 USD\", \"24.99USD\" and \"24.99\". If the currency is not included, we default to US dollars.
	 */
	void setPrice(std::string  price);
	/*! \brief Get <p><= 1000 characters</p> <p>The categorization of your product based on your custom product taxonomy. Subcategories must be sent separated by “ > “. The > must be wrapped by spaces. We do not recognize any other delimiters such as comma or pipe.</p>
	 */
	std::string getProductType();

	/*! \brief Set <p><= 1000 characters</p> <p>The categorization of your product based on your custom product taxonomy. Subcategories must be sent separated by “ > “. The > must be wrapped by spaces. We do not recognize any other delimiters such as comma or pipe.</p>
	 */
	void setProductType(std::string  product_type);
	/*! \brief Get A unique identifier referencing the promotion associated with this catalog item.
	 */
	std::string getPromotionId();

	/*! \brief Set A unique identifier referencing the promotion associated with this catalog item.
	 */
	void setPromotionId(std::string  promotion_id);
	/*! \brief Get The discounted price of the product. The sale_price must be lower than the price. It supports the following formats, \"14.99 USD\", \"14.99USD\" and \"14.99\". If the currency is not included, we default to US dollars.
	 */
	std::string getSalePrice();

	/*! \brief Set The discounted price of the product. The sale_price must be lower than the price. It supports the following formats, \"14.99 USD\", \"14.99USD\" and \"14.99\". If the currency is not included, we default to US dollars.
	 */
	void setSalePrice(std::string  sale_price);
	/*! \brief Get Sale price effective date. Expected format: <start_date>/<end_date> (ISO 8601 format)
	 */
	std::string getSalePriceEffectiveDate();

	/*! \brief Set Sale price effective date. Expected format: <start_date>/<end_date> (ISO 8601 format)
	 */
	void setSalePriceEffectiveDate(std::string  sale_price_effective_date);
	/*! \brief Get Shipping consists of one group of up to four elements, country, region, service (all optional) and price (required). All colons, even for blank values, are required.
	 */
	std::string getShipping();

	/*! \brief Set Shipping consists of one group of up to four elements, country, region, service (all optional) and price (required). All colons, even for blank values, are required.
	 */
	void setShipping(std::string  shipping);
	/*! \brief Get The height of the package needed to ship the product. Ensure there is a space between the numeric string and the metric.
	 */
	std::string getShippingHeight();

	/*! \brief Set The height of the package needed to ship the product. Ensure there is a space between the numeric string and the metric.
	 */
	void setShippingHeight(std::string  shipping_height);
	/*! \brief Get The weight of the product. Ensure there is a space between the numeric string and the metric.
	 */
	std::string getShippingWeight();

	/*! \brief Set The weight of the product. Ensure there is a space between the numeric string and the metric.
	 */
	void setShippingWeight(std::string  shipping_weight);
	/*! \brief Get The width of the package needed to ship the product. Ensure there is a space between the numeric string and the metric.
	 */
	std::string getShippingWidth();

	/*! \brief Set The width of the package needed to ship the product. Ensure there is a space between the numeric string and the metric.
	 */
	void setShippingWidth(std::string  shipping_width);
	/*! \brief Get The size of the product.
	 */
	std::string getSize();

	/*! \brief Set The size of the product.
	 */
	void setSize(std::string  size);
	/*! \brief Get Indicates the country’s sizing system in which you are submitting your product. Must be one of the following values (upper or lowercased): ‘US’, ‘UK’, ‘EU’, ‘DE’, ‘FR’, ‘JP’, ‘CN’, ‘IT’, ‘BR’, ‘MEX’, or ‘AU’.
	 */
	std::string getSizeSystem();

	/*! \brief Set Indicates the country’s sizing system in which you are submitting your product. Must be one of the following values (upper or lowercased): ‘US’, ‘UK’, ‘EU’, ‘DE’, ‘FR’, ‘JP’, ‘CN’, ‘IT’, ‘BR’, ‘MEX’, or ‘AU’.
	 */
	void setSizeSystem(std::string  size_system);
	/*! \brief Get Additional description for the size. Must be one of the following values (upper or lowercased): ‘regular’, ‘petite’, ‘plus’, ‘big_and_tall’, or ‘maternity’.
	 */
	std::string getSizeType();

	/*! \brief Set Additional description for the size. Must be one of the following values (upper or lowercased): ‘regular’, ‘petite’, ‘plus’, ‘big_and_tall’, or ‘maternity’.
	 */
	void setSizeType(std::string  size_type);
	/*! \brief Get Tax consists of one group of up to four elements, country, region, rate (all required) and tax_ship (optional). All colons, even for blank values, are required.
	 */
	std::string getTax();

	/*! \brief Set Tax consists of one group of up to four elements, country, region, rate (all required) and tax_ship (optional). All colons, even for blank values, are required.
	 */
	void setTax(std::string  tax);
	/*! \brief Get <p><= 500 characters</p> <p>The name of the product.</p>
	 */
	std::string getTitle();

	/*! \brief Set <p><= 500 characters</p> <p>The name of the product.</p>
	 */
	void setTitle(std::string  title);
	/*! \brief Get Unit pricing base measure of the product. This data will only be shown to pinners in the enabled countries. Expected format: <base_measure> <unit_type>
	 */
	std::string getUnitPricingBaseMeasure();

	/*! \brief Set Unit pricing base measure of the product. This data will only be shown to pinners in the enabled countries. Expected format: <base_measure> <unit_type>
	 */
	void setUnitPricingBaseMeasure(std::string  unit_pricing_base_measure);
	/*! \brief Get Unit pricing total measure of the product. This data will only be shown to pinners in the enabled countries. Expected format: <total_units> <unit_type>
	 */
	std::string getUnitPricingMeasure();

	/*! \brief Set Unit pricing total measure of the product. This data will only be shown to pinners in the enabled countries. Expected format: <total_units> <unit_type>
	 */
	void setUnitPricingMeasure(std::string  unit_pricing_measure);
	/*! \brief Get Options for this variant. People will see these options next to your Pin and can select the one they want. List them in the order you want them displayed.
	 */
	std::list<std::string> getVariantNames();

	/*! \brief Set Options for this variant. People will see these options next to your Pin and can select the one they want. List them in the order you want them displayed.
	 */
	void setVariantNames(std::list <std::string> variant_names);
	/*! \brief Get Option values for this variant. People will see these options next to your Pin and can select the one they want. List them in the order you want them displayed. The order of the variant values must be consistent with the order of the variant names.
	 */
	std::list<std::string> getVariantValues();

	/*! \brief Set Option values for this variant. People will see these options next to your Pin and can select the one they want. List them in the order you want them displayed. The order of the variant values must be consistent with the order of the variant names.
	 */
	void setVariantValues(std::list <std::string> variant_values);


    private:
    std::string ad_image_0_link{};
    std::string ad_image_0_tag{};
    std::string ad_image_10_link{};
    std::string ad_image_10_tag{};
    std::string ad_image_11_link{};
    std::string ad_image_11_tag{};
    std::string ad_image_12_link{};
    std::string ad_image_12_tag{};
    std::string ad_image_13_link{};
    std::string ad_image_13_tag{};
    std::string ad_image_14_link{};
    std::string ad_image_14_tag{};
    std::string ad_image_15_link{};
    std::string ad_image_15_tag{};
    std::string ad_image_16_link{};
    std::string ad_image_16_tag{};
    std::string ad_image_17_link{};
    std::string ad_image_17_tag{};
    std::string ad_image_18_link{};
    std::string ad_image_18_tag{};
    std::string ad_image_19_link{};
    std::string ad_image_19_tag{};
    std::string ad_image_1_link{};
    std::string ad_image_1_tag{};
    std::string ad_image_2_link{};
    std::string ad_image_2_tag{};
    std::string ad_image_3_link{};
    std::string ad_image_3_tag{};
    std::string ad_image_4_link{};
    std::string ad_image_4_tag{};
    std::string ad_image_5_link{};
    std::string ad_image_5_tag{};
    std::string ad_image_6_link{};
    std::string ad_image_6_tag{};
    std::string ad_image_7_link{};
    std::string ad_image_7_tag{};
    std::string ad_image_8_link{};
    std::string ad_image_8_tag{};
    std::string ad_image_9_link{};
    std::string ad_image_9_tag{};
    std::string ad_link{};
    std::string ad_video_0_link{};
    std::string ad_video_0_tag{};
    std::string ad_video_1_link{};
    std::string ad_video_1_tag{};
    std::string ad_video_2_link{};
    std::string ad_video_2_tag{};
    bool adult{};
    std::string age_group{};
    std::string android_deep_link{};
    std::string availability{};
    long average_review_rating{};
    std::string brand{};
    bool checkout_enabled{};
    std::string color{};
    std::string condition{};
    std::string custom_label_0{};
    std::string custom_label_1{};
    std::string custom_label_2{};
    std::string custom_label_3{};
    std::string custom_label_4{};
    int custom_number_0{};
    int custom_number_1{};
    int custom_number_2{};
    int custom_number_3{};
    int custom_number_4{};
    std::string description{};
    bool free_shipping_label{};
    std::string free_shipping_limit{};
    std::string gender{};
    std::string google_product_category{};
    UpdatableItemAttributes_gtin gtin;
    std::string id{};
    std::string installment_price{};
    std::string ios_deep_link{};
    std::string item_group_id{};
    long last_updated_time{};
    std::string link{};
    std::string material{};
    std::string min_ad_price{};
    std::string mobile_link{};
    std::string mpn{};
    int number_of_ratings{};
    int number_of_reviews{};
    std::string pattern{};
    std::string price{};
    std::string product_type{};
    std::string promotion_id{};
    std::string sale_price{};
    std::string sale_price_effective_date{};
    std::string shipping{};
    std::string shipping_height{};
    std::string shipping_weight{};
    std::string shipping_width{};
    std::string size{};
    std::string size_system{};
    std::string size_type{};
    std::string tax{};
    std::string title{};
    std::string unit_pricing_base_measure{};
    std::string unit_pricing_measure{};
    std::list<std::string> variant_names;
    std::list<std::string> variant_values;
};
}

#endif /* TINY_CPP_CLIENT_UpdatableItemAttributes_H_ */
