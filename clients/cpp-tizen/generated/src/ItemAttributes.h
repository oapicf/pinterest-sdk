/*
 * ItemAttributes.h
 *
 * 
 */

#ifndef _ItemAttributes_H_
#define _ItemAttributes_H_


#include <string>
#include "CatalogsAiContentDisclosure.h"
#include "UpdatableItemAttributesGtin.h"
#include <list>
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

class ItemAttributes : public Object {
public:
	/*! \brief Constructor.
	 */
	ItemAttributes();
	ItemAttributes(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ItemAttributes();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Ad image link that supplements main image for shopping campaigns. Image format:- Pixel size at least 75 x 75 Link guidelines:- Include extension in file name - Do not include template or placeholder images in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://
	 */
	std::string getAdImage0Link();

	/*! \brief Set Ad image link that supplements main image for shopping campaigns. Image format:- Pixel size at least 75 x 75 Link guidelines:- Include extension in file name - Do not include template or placeholder images in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://
	 */
	void setAdImage0Link(std::string  ad_image_0_link);
	/*! \brief Get Ad image tag. If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.
	 */
	std::string getAdImage0Tag();

	/*! \brief Set Ad image tag. If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.
	 */
	void setAdImage0Tag(std::string  ad_image_0_tag);
	/*! \brief Get Ad image link that supplements main image for shopping campaigns. Image format:- Pixel size at least 75 x 75 Link guidelines:- Include extension in file name - Do not include template or placeholder images in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://
	 */
	std::string getAdImage10Link();

	/*! \brief Set Ad image link that supplements main image for shopping campaigns. Image format:- Pixel size at least 75 x 75 Link guidelines:- Include extension in file name - Do not include template or placeholder images in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://
	 */
	void setAdImage10Link(std::string  ad_image_10_link);
	/*! \brief Get Ad image tag. If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.
	 */
	std::string getAdImage10Tag();

	/*! \brief Set Ad image tag. If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.
	 */
	void setAdImage10Tag(std::string  ad_image_10_tag);
	/*! \brief Get Ad image link that supplements main image for shopping campaigns. Image format:- Pixel size at least 75 x 75 Link guidelines:- Include extension in file name - Do not include template or placeholder images in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://
	 */
	std::string getAdImage11Link();

	/*! \brief Set Ad image link that supplements main image for shopping campaigns. Image format:- Pixel size at least 75 x 75 Link guidelines:- Include extension in file name - Do not include template or placeholder images in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://
	 */
	void setAdImage11Link(std::string  ad_image_11_link);
	/*! \brief Get Ad image tag. If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.
	 */
	std::string getAdImage11Tag();

	/*! \brief Set Ad image tag. If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.
	 */
	void setAdImage11Tag(std::string  ad_image_11_tag);
	/*! \brief Get Ad image link that supplements main image for shopping campaigns. Image format:- Pixel size at least 75 x 75 Link guidelines:- Include extension in file name - Do not include template or placeholder images in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://
	 */
	std::string getAdImage12Link();

	/*! \brief Set Ad image link that supplements main image for shopping campaigns. Image format:- Pixel size at least 75 x 75 Link guidelines:- Include extension in file name - Do not include template or placeholder images in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://
	 */
	void setAdImage12Link(std::string  ad_image_12_link);
	/*! \brief Get Ad image tag. If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.
	 */
	std::string getAdImage12Tag();

	/*! \brief Set Ad image tag. If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.
	 */
	void setAdImage12Tag(std::string  ad_image_12_tag);
	/*! \brief Get Ad image link that supplements main image for shopping campaigns. Image format:- Pixel size at least 75 x 75 Link guidelines:- Include extension in file name - Do not include template or placeholder images in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://
	 */
	std::string getAdImage13Link();

	/*! \brief Set Ad image link that supplements main image for shopping campaigns. Image format:- Pixel size at least 75 x 75 Link guidelines:- Include extension in file name - Do not include template or placeholder images in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://
	 */
	void setAdImage13Link(std::string  ad_image_13_link);
	/*! \brief Get Ad image tag. If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.
	 */
	std::string getAdImage13Tag();

	/*! \brief Set Ad image tag. If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.
	 */
	void setAdImage13Tag(std::string  ad_image_13_tag);
	/*! \brief Get Ad image link that supplements main image for shopping campaigns. Image format:- Pixel size at least 75 x 75 Link guidelines:- Include extension in file name - Do not include template or placeholder images in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://
	 */
	std::string getAdImage14Link();

	/*! \brief Set Ad image link that supplements main image for shopping campaigns. Image format:- Pixel size at least 75 x 75 Link guidelines:- Include extension in file name - Do not include template or placeholder images in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://
	 */
	void setAdImage14Link(std::string  ad_image_14_link);
	/*! \brief Get Ad image tag. If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.
	 */
	std::string getAdImage14Tag();

	/*! \brief Set Ad image tag. If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.
	 */
	void setAdImage14Tag(std::string  ad_image_14_tag);
	/*! \brief Get Ad image link that supplements main image for shopping campaigns. Image format:- Pixel size at least 75 x 75 Link guidelines:- Include extension in file name - Do not include template or placeholder images in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://
	 */
	std::string getAdImage15Link();

	/*! \brief Set Ad image link that supplements main image for shopping campaigns. Image format:- Pixel size at least 75 x 75 Link guidelines:- Include extension in file name - Do not include template or placeholder images in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://
	 */
	void setAdImage15Link(std::string  ad_image_15_link);
	/*! \brief Get Ad image tag. If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.
	 */
	std::string getAdImage15Tag();

	/*! \brief Set Ad image tag. If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.
	 */
	void setAdImage15Tag(std::string  ad_image_15_tag);
	/*! \brief Get Ad image link that supplements main image for shopping campaigns. Image format:- Pixel size at least 75 x 75 Link guidelines:- Include extension in file name - Do not include template or placeholder images in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://
	 */
	std::string getAdImage16Link();

	/*! \brief Set Ad image link that supplements main image for shopping campaigns. Image format:- Pixel size at least 75 x 75 Link guidelines:- Include extension in file name - Do not include template or placeholder images in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://
	 */
	void setAdImage16Link(std::string  ad_image_16_link);
	/*! \brief Get Ad image tag. If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.
	 */
	std::string getAdImage16Tag();

	/*! \brief Set Ad image tag. If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.
	 */
	void setAdImage16Tag(std::string  ad_image_16_tag);
	/*! \brief Get Ad image link that supplements main image for shopping campaigns. Image format:- Pixel size at least 75 x 75 Link guidelines:- Include extension in file name - Do not include template or placeholder images in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://
	 */
	std::string getAdImage17Link();

	/*! \brief Set Ad image link that supplements main image for shopping campaigns. Image format:- Pixel size at least 75 x 75 Link guidelines:- Include extension in file name - Do not include template or placeholder images in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://
	 */
	void setAdImage17Link(std::string  ad_image_17_link);
	/*! \brief Get Ad image tag. If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.
	 */
	std::string getAdImage17Tag();

	/*! \brief Set Ad image tag. If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.
	 */
	void setAdImage17Tag(std::string  ad_image_17_tag);
	/*! \brief Get Ad image link that supplements main image for shopping campaigns. Image format:- Pixel size at least 75 x 75 Link guidelines:- Include extension in file name - Do not include template or placeholder images in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://
	 */
	std::string getAdImage18Link();

	/*! \brief Set Ad image link that supplements main image for shopping campaigns. Image format:- Pixel size at least 75 x 75 Link guidelines:- Include extension in file name - Do not include template or placeholder images in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://
	 */
	void setAdImage18Link(std::string  ad_image_18_link);
	/*! \brief Get Ad image tag. If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.
	 */
	std::string getAdImage18Tag();

	/*! \brief Set Ad image tag. If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.
	 */
	void setAdImage18Tag(std::string  ad_image_18_tag);
	/*! \brief Get Ad image link that supplements main image for shopping campaigns. Image format:- Pixel size at least 75 x 75 Link guidelines:- Include extension in file name - Do not include template or placeholder images in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://
	 */
	std::string getAdImage19Link();

	/*! \brief Set Ad image link that supplements main image for shopping campaigns. Image format:- Pixel size at least 75 x 75 Link guidelines:- Include extension in file name - Do not include template or placeholder images in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://
	 */
	void setAdImage19Link(std::string  ad_image_19_link);
	/*! \brief Get Ad image tag. If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.
	 */
	std::string getAdImage19Tag();

	/*! \brief Set Ad image tag. If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.
	 */
	void setAdImage19Tag(std::string  ad_image_19_tag);
	/*! \brief Get Ad image link that supplements main image for shopping campaigns. Image format:- Pixel size at least 75 x 75 Link guidelines:- Include extension in file name - Do not include template or placeholder images in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://
	 */
	std::string getAdImage1Link();

	/*! \brief Set Ad image link that supplements main image for shopping campaigns. Image format:- Pixel size at least 75 x 75 Link guidelines:- Include extension in file name - Do not include template or placeholder images in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://
	 */
	void setAdImage1Link(std::string  ad_image_1_link);
	/*! \brief Get Ad image tag. If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.
	 */
	std::string getAdImage1Tag();

	/*! \brief Set Ad image tag. If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.
	 */
	void setAdImage1Tag(std::string  ad_image_1_tag);
	/*! \brief Get Ad image link that supplements main image for shopping campaigns. Image format:- Pixel size at least 75 x 75 Link guidelines:- Include extension in file name - Do not include template or placeholder images in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://
	 */
	std::string getAdImage2Link();

	/*! \brief Set Ad image link that supplements main image for shopping campaigns. Image format:- Pixel size at least 75 x 75 Link guidelines:- Include extension in file name - Do not include template or placeholder images in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://
	 */
	void setAdImage2Link(std::string  ad_image_2_link);
	/*! \brief Get Ad image tag. If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.
	 */
	std::string getAdImage2Tag();

	/*! \brief Set Ad image tag. If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.
	 */
	void setAdImage2Tag(std::string  ad_image_2_tag);
	/*! \brief Get Ad image link that supplements main image for shopping campaigns. Image format:- Pixel size at least 75 x 75 Link guidelines:- Include extension in file name - Do not include template or placeholder images in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://
	 */
	std::string getAdImage3Link();

	/*! \brief Set Ad image link that supplements main image for shopping campaigns. Image format:- Pixel size at least 75 x 75 Link guidelines:- Include extension in file name - Do not include template or placeholder images in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://
	 */
	void setAdImage3Link(std::string  ad_image_3_link);
	/*! \brief Get Ad image tag. If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.
	 */
	std::string getAdImage3Tag();

	/*! \brief Set Ad image tag. If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.
	 */
	void setAdImage3Tag(std::string  ad_image_3_tag);
	/*! \brief Get Ad image link that supplements main image for shopping campaigns. Image format:- Pixel size at least 75 x 75 Link guidelines:- Include extension in file name - Do not include template or placeholder images in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://
	 */
	std::string getAdImage4Link();

	/*! \brief Set Ad image link that supplements main image for shopping campaigns. Image format:- Pixel size at least 75 x 75 Link guidelines:- Include extension in file name - Do not include template or placeholder images in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://
	 */
	void setAdImage4Link(std::string  ad_image_4_link);
	/*! \brief Get Ad image tag. If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.
	 */
	std::string getAdImage4Tag();

	/*! \brief Set Ad image tag. If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.
	 */
	void setAdImage4Tag(std::string  ad_image_4_tag);
	/*! \brief Get Ad image link that supplements main image for shopping campaigns. Image format:- Pixel size at least 75 x 75 Link guidelines:- Include extension in file name - Do not include template or placeholder images in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://
	 */
	std::string getAdImage5Link();

	/*! \brief Set Ad image link that supplements main image for shopping campaigns. Image format:- Pixel size at least 75 x 75 Link guidelines:- Include extension in file name - Do not include template or placeholder images in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://
	 */
	void setAdImage5Link(std::string  ad_image_5_link);
	/*! \brief Get Ad image tag. If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.
	 */
	std::string getAdImage5Tag();

	/*! \brief Set Ad image tag. If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.
	 */
	void setAdImage5Tag(std::string  ad_image_5_tag);
	/*! \brief Get Ad image link that supplements main image for shopping campaigns. Image format:- Pixel size at least 75 x 75 Link guidelines:- Include extension in file name - Do not include template or placeholder images in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://
	 */
	std::string getAdImage6Link();

	/*! \brief Set Ad image link that supplements main image for shopping campaigns. Image format:- Pixel size at least 75 x 75 Link guidelines:- Include extension in file name - Do not include template or placeholder images in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://
	 */
	void setAdImage6Link(std::string  ad_image_6_link);
	/*! \brief Get Ad image tag. If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.
	 */
	std::string getAdImage6Tag();

	/*! \brief Set Ad image tag. If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.
	 */
	void setAdImage6Tag(std::string  ad_image_6_tag);
	/*! \brief Get Ad image link that supplements main image for shopping campaigns. Image format:- Pixel size at least 75 x 75 Link guidelines:- Include extension in file name - Do not include template or placeholder images in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://
	 */
	std::string getAdImage7Link();

	/*! \brief Set Ad image link that supplements main image for shopping campaigns. Image format:- Pixel size at least 75 x 75 Link guidelines:- Include extension in file name - Do not include template or placeholder images in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://
	 */
	void setAdImage7Link(std::string  ad_image_7_link);
	/*! \brief Get Ad image tag. If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.
	 */
	std::string getAdImage7Tag();

	/*! \brief Set Ad image tag. If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.
	 */
	void setAdImage7Tag(std::string  ad_image_7_tag);
	/*! \brief Get Ad image link that supplements main image for shopping campaigns. Image format:- Pixel size at least 75 x 75 Link guidelines:- Include extension in file name - Do not include template or placeholder images in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://
	 */
	std::string getAdImage8Link();

	/*! \brief Set Ad image link that supplements main image for shopping campaigns. Image format:- Pixel size at least 75 x 75 Link guidelines:- Include extension in file name - Do not include template or placeholder images in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://
	 */
	void setAdImage8Link(std::string  ad_image_8_link);
	/*! \brief Get Ad image tag. If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.
	 */
	std::string getAdImage8Tag();

	/*! \brief Set Ad image tag. If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.
	 */
	void setAdImage8Tag(std::string  ad_image_8_tag);
	/*! \brief Get Ad image link that supplements main image for shopping campaigns. Image format:- Pixel size at least 75 x 75 Link guidelines:- Include extension in file name - Do not include template or placeholder images in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://
	 */
	std::string getAdImage9Link();

	/*! \brief Set Ad image link that supplements main image for shopping campaigns. Image format:- Pixel size at least 75 x 75 Link guidelines:- Include extension in file name - Do not include template or placeholder images in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://
	 */
	void setAdImage9Link(std::string  ad_image_9_link);
	/*! \brief Get Ad image tag. If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.
	 */
	std::string getAdImage9Tag();

	/*! \brief Set Ad image tag. If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.
	 */
	void setAdImage9Tag(std::string  ad_image_9_tag);
	/*! \brief Get Allows advertisers to specify a separate URL that can be used to track traffic coming from Pinterest shopping ads. Must send full URL including tracking. Must begin with http:// or https://.
	 */
	std::string getAdLink();

	/*! \brief Set Allows advertisers to specify a separate URL that can be used to track traffic coming from Pinterest shopping ads. Must send full URL including tracking. Must begin with http:// or https://.
	 */
	void setAdLink(std::string  ad_link);
	/*! \brief Get Restricted. Ad video link that supplements main video for shopping campaigns. Video format:- Pixel size between 75 x 75 and 9450 x 9450 - File size smaller than 2 GB - Time span between 4 seconds and 15 minutes - Accepted formats: .MP4, .MOV, .M4V Link guidelines:- Include extension in file name - Do not include template or placeholder videos in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://
	 */
	std::string getAdVideo0Link();

	/*! \brief Set Restricted. Ad video link that supplements main video for shopping campaigns. Video format:- Pixel size between 75 x 75 and 9450 x 9450 - File size smaller than 2 GB - Time span between 4 seconds and 15 minutes - Accepted formats: .MP4, .MOV, .M4V Link guidelines:- Include extension in file name - Do not include template or placeholder videos in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://
	 */
	void setAdVideo0Link(std::string  ad_video_0_link);
	/*! \brief Get Restricted. Ad video tag. If you provide an ad_video_x_link, include the video tag with the corresponding ad_video_x_tag attribute.
	 */
	std::string getAdVideo0Tag();

	/*! \brief Set Restricted. Ad video tag. If you provide an ad_video_x_link, include the video tag with the corresponding ad_video_x_tag attribute.
	 */
	void setAdVideo0Tag(std::string  ad_video_0_tag);
	/*! \brief Get Restricted. Ad video link that supplements main video for shopping campaigns. Video format:- Pixel size between 75 x 75 and 9450 x 9450 - File size smaller than 2 GB - Time span between 4 seconds and 15 minutes - Accepted formats: .MP4, .MOV, .M4V Link guidelines:- Include extension in file name - Do not include template or placeholder videos in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://
	 */
	std::string getAdVideo1Link();

	/*! \brief Set Restricted. Ad video link that supplements main video for shopping campaigns. Video format:- Pixel size between 75 x 75 and 9450 x 9450 - File size smaller than 2 GB - Time span between 4 seconds and 15 minutes - Accepted formats: .MP4, .MOV, .M4V Link guidelines:- Include extension in file name - Do not include template or placeholder videos in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://
	 */
	void setAdVideo1Link(std::string  ad_video_1_link);
	/*! \brief Get Restricted. Ad video tag. If you provide an ad_video_x_link, include the video tag with the corresponding ad_video_x_tag attribute.
	 */
	std::string getAdVideo1Tag();

	/*! \brief Set Restricted. Ad video tag. If you provide an ad_video_x_link, include the video tag with the corresponding ad_video_x_tag attribute.
	 */
	void setAdVideo1Tag(std::string  ad_video_1_tag);
	/*! \brief Get Restricted. Ad video link that supplements main video for shopping campaigns. Video format:- Pixel size between 75 x 75 and 9450 x 9450 - File size smaller than 2 GB - Time span between 4 seconds and 15 minutes - Accepted formats: .MP4, .MOV, .M4V Link guidelines:- Include extension in file name - Do not include template or placeholder videos in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://
	 */
	std::string getAdVideo2Link();

	/*! \brief Set Restricted. Ad video link that supplements main video for shopping campaigns. Video format:- Pixel size between 75 x 75 and 9450 x 9450 - File size smaller than 2 GB - Time span between 4 seconds and 15 minutes - Accepted formats: .MP4, .MOV, .M4V Link guidelines:- Include extension in file name - Do not include template or placeholder videos in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://
	 */
	void setAdVideo2Link(std::string  ad_video_2_link);
	/*! \brief Get Restricted. Ad video tag. If you provide an ad_video_x_link, include the video tag with the corresponding ad_video_x_tag attribute.
	 */
	std::string getAdVideo2Tag();

	/*! \brief Set Restricted. Ad video tag. If you provide an ad_video_x_link, include the video tag with the corresponding ad_video_x_tag attribute.
	 */
	void setAdVideo2Tag(std::string  ad_video_2_tag);
	/*! \brief Get Set this attribute to TRUE if you're submitting items that are considered \"adult\". These will not be shown on Pinterest.
	 */
	bool getAdult();

	/*! \brief Set Set this attribute to TRUE if you're submitting items that are considered \"adult\". These will not be shown on Pinterest.
	 */
	void setAdult(bool  adult);
	/*! \brief Get The age group to apply a demographic range to the product. Must be one of the following values (upper or lowercased): 'newborn', 'infant', 'toddler', 'kids', or 'adult'.
	 */
	std::string getAgeGroup();

	/*! \brief Set The age group to apply a demographic range to the product. Must be one of the following values (upper or lowercased): 'newborn', 'infant', 'toddler', 'kids', or 'adult'.
	 */
	void setAgeGroup(std::string  age_group);
	/*! \brief Get The deep link to the product on the Android app.
	 */
	std::string getAndroidDeepLink();

	/*! \brief Set The deep link to the product on the Android app.
	 */
	void setAndroidDeepLink(std::string  android_deep_link);
	/*! \brief Get The availability of the product. Must be one of the following values (upper or lowercased): 'in stock', 'out of stock', 'preorder'.
	 */
	std::string getAvailability();

	/*! \brief Set The availability of the product. Must be one of the following values (upper or lowercased): 'in stock', 'out of stock', 'preorder'.
	 */
	void setAvailability(std::string  availability);
	/*! \brief Get Average reviews for the item. Can be a number from 1-5.
	 */
	long long getAverageReviewRating();

	/*! \brief Set Average reviews for the item. Can be a number from 1-5.
	 */
	void setAverageReviewRating(long long  average_review_rating);
	/*! \brief Get The brand of the product.
	 */
	std::string getBrand();

	/*! \brief Set The brand of the product.
	 */
	void setBrand(std::string  brand);
	/*! \brief Get This attribute is not supported anymore.
	 */
	bool getCheckoutEnabled();

	/*! \brief Set This attribute is not supported anymore.
	 */
	void setCheckoutEnabled(bool  checkout_enabled);
	/*! \brief Get The primary color of the product.
	 */
	std::string getColor();

	/*! \brief Set The primary color of the product.
	 */
	void setColor(std::string  color);
	/*! \brief Get The condition of the product. Must be one of the following values (upper or lowercased): 'new', 'used', or 'refurbished'.
	 */
	std::string getCondition();

	/*! \brief Set The condition of the product. Must be one of the following values (upper or lowercased): 'new', 'used', or 'refurbished'.
	 */
	void setCondition(std::string  condition);
	/*! \brief Get <= 511 characters for retail and creative asset catalogs, <= 127 characters for hotel catalogs. Custom grouping of products.
	 */
	std::string getCustomLabel0();

	/*! \brief Set <= 511 characters for retail and creative asset catalogs, <= 127 characters for hotel catalogs. Custom grouping of products.
	 */
	void setCustomLabel0(std::string  custom_label_0);
	/*! \brief Get <= 511 characters for retail and creative asset catalogs, <= 127 characters for hotel catalogs. Custom grouping of products.
	 */
	std::string getCustomLabel1();

	/*! \brief Set <= 511 characters for retail and creative asset catalogs, <= 127 characters for hotel catalogs. Custom grouping of products.
	 */
	void setCustomLabel1(std::string  custom_label_1);
	/*! \brief Get <= 511 characters for retail and creative asset catalogs, <= 127 characters for hotel catalogs. Custom grouping of products.
	 */
	std::string getCustomLabel2();

	/*! \brief Set <= 511 characters for retail and creative asset catalogs, <= 127 characters for hotel catalogs. Custom grouping of products.
	 */
	void setCustomLabel2(std::string  custom_label_2);
	/*! \brief Get <= 511 characters for retail and creative asset catalogs, <= 127 characters for hotel catalogs. Custom grouping of products.
	 */
	std::string getCustomLabel3();

	/*! \brief Set <= 511 characters for retail and creative asset catalogs, <= 127 characters for hotel catalogs. Custom grouping of products.
	 */
	void setCustomLabel3(std::string  custom_label_3);
	/*! \brief Get <= 511 characters for retail and creative asset catalogs, <= 127 characters for hotel catalogs. Custom grouping of products.
	 */
	std::string getCustomLabel4();

	/*! \brief Set <= 511 characters for retail and creative asset catalogs, <= 127 characters for hotel catalogs. Custom grouping of products.
	 */
	void setCustomLabel4(std::string  custom_label_4);
	/*! \brief Get An attribute for any integer information ranging from 0 to 4,294,967,295, which can be used to group items.
	 */
	int getCustomNumber0();

	/*! \brief Set An attribute for any integer information ranging from 0 to 4,294,967,295, which can be used to group items.
	 */
	void setCustomNumber0(int  custom_number_0);
	/*! \brief Get An attribute for any integer information ranging from 0 to 4,294,967,295, which can be used to group items.
	 */
	int getCustomNumber1();

	/*! \brief Set An attribute for any integer information ranging from 0 to 4,294,967,295, which can be used to group items.
	 */
	void setCustomNumber1(int  custom_number_1);
	/*! \brief Get An attribute for any integer information ranging from 0 to 4,294,967,295, which can be used to group items.
	 */
	int getCustomNumber2();

	/*! \brief Set An attribute for any integer information ranging from 0 to 4,294,967,295, which can be used to group items.
	 */
	void setCustomNumber2(int  custom_number_2);
	/*! \brief Get An attribute for any integer information ranging from 0 to 4,294,967,295, which can be used to group items.
	 */
	int getCustomNumber3();

	/*! \brief Set An attribute for any integer information ranging from 0 to 4,294,967,295, which can be used to group items.
	 */
	void setCustomNumber3(int  custom_number_3);
	/*! \brief Get An attribute for any integer information ranging from 0 to 4,294,967,295, which can be used to group items.
	 */
	int getCustomNumber4();

	/*! \brief Set An attribute for any integer information ranging from 0 to 4,294,967,295, which can be used to group items.
	 */
	void setCustomNumber4(int  custom_number_4);
	/*! \brief Get <= 10000 characters. The description of the product.
	 */
	std::string getDescription();

	/*! \brief Set <= 10000 characters. The description of the product.
	 */
	void setDescription(std::string  description);
	/*! \brief Get The item is free to ship.
	 */
	bool getFreeShippingLabel();

	/*! \brief Set The item is free to ship.
	 */
	void setFreeShippingLabel(bool  free_shipping_label);
	/*! \brief Get The minimum order purchase necessary for the customer to get free shipping. Only relevant if free shipping is offered.
	 */
	std::string getFreeShippingLimit();

	/*! \brief Set The minimum order purchase necessary for the customer to get free shipping. Only relevant if free shipping is offered.
	 */
	void setFreeShippingLimit(std::string  free_shipping_limit);
	/*! \brief Get The gender associated with the product. Must be one of the following values (upper or lowercased): 'male', 'female', or 'unisex'.
	 */
	std::string getGender();

	/*! \brief Set The gender associated with the product. Must be one of the following values (upper or lowercased): 'male', 'female', or 'unisex'.
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
	UpdatableItemAttributesGtin getGtin();

	/*! \brief Set 
	 */
	void setGtin(UpdatableItemAttributesGtin  gtin);
	/*! \brief Get <= 127 characters. The user-created unique ID that represents the product. Only Unicode characters are accepted.
	 */
	std::string getId();

	/*! \brief Set <= 127 characters. The user-created unique ID that represents the product. Only Unicode characters are accepted.
	 */
	void setId(std::string  id);
	/*! \brief Get Installment price of the product. Expected format: <payment_count>:<payment_amount> <currency>
	 */
	std::string getInstallmentPrice();

	/*! \brief Set Installment price of the product. Expected format: <payment_count>:<payment_amount> <currency>
	 */
	void setInstallmentPrice(std::string  installment_price);
	/*! \brief Get The deep link to the product on the iOS app.
	 */
	std::string getIosDeepLink();

	/*! \brief Set The deep link to the product on the iOS app.
	 */
	void setIosDeepLink(std::string  ios_deep_link);
	/*! \brief Get <= 127 characters. The parent ID of the product.
	 */
	std::string getItemGroupId();

	/*! \brief Set <= 127 characters. The parent ID of the product.
	 */
	void setItemGroupId(std::string  item_group_id);
	/*! \brief Get The millisecond timestamp when the item was lastly modified by the merchant.
	 */
	long long getLastUpdatedTime();

	/*! \brief Set The millisecond timestamp when the item was lastly modified by the merchant.
	 */
	void setLastUpdatedTime(long long  last_updated_time);
	/*! \brief Get <= 511 characters. The landing page for the product.
	 */
	std::string getLink();

	/*! \brief Set <= 511 characters. The landing page for the product.
	 */
	void setLink(std::string  link);
	/*! \brief Get The material used to make the product.
	 */
	std::string getMaterial();

	/*! \brief Set The material used to make the product.
	 */
	void setMaterial(std::string  material);
	/*! \brief Get The minimum advertised price of the product. It supports the following formats: \"19.99 USD\", \"19.99USD\" and \"19.99\". If the currency is not included, we default to US dollars.
	 */
	std::string getMinAdPrice();

	/*! \brief Set The minimum advertised price of the product. It supports the following formats: \"19.99 USD\", \"19.99USD\" and \"19.99\". If the currency is not included, we default to US dollars.
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
	/*! \brief Get The price of the product. It supports the following formats: \"24.99 USD\", \"24.99USD\" and \"24.99\". If the currency is not included, we default to US dollars.
	 */
	std::string getPrice();

	/*! \brief Set The price of the product. It supports the following formats: \"24.99 USD\", \"24.99USD\" and \"24.99\". If the currency is not included, we default to US dollars.
	 */
	void setPrice(std::string  price);
	/*! \brief Get <= 1000 characters. The categorization of your product based on your custom product taxonomy. Subcategories must be sent separated by \" > \".
	 */
	std::string getProductType();

	/*! \brief Set <= 1000 characters. The categorization of your product based on your custom product taxonomy. Subcategories must be sent separated by \" > \".
	 */
	void setProductType(std::string  product_type);
	/*! \brief Get A unique identifier referencing the promotion associated with this catalog item.
	 */
	std::string getPromotionId();

	/*! \brief Set A unique identifier referencing the promotion associated with this catalog item.
	 */
	void setPromotionId(std::string  promotion_id);
	/*! \brief Get The discounted price of the product. The sale_price must be lower than the price. It supports the following formats: \"14.99 USD\", \"14.99USD\" and \"14.99\".
	 */
	std::string getSalePrice();

	/*! \brief Set The discounted price of the product. The sale_price must be lower than the price. It supports the following formats: \"14.99 USD\", \"14.99USD\" and \"14.99\".
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
	/*! \brief Get Indicates the country's sizing system in which you are submitting your product. Must be one of the following values (upper or lowercased): 'US', 'UK', 'EU', 'DE', 'FR', 'JP', 'CN', 'IT', 'BR', 'MEX', or 'AU'.
	 */
	std::string getSizeSystem();

	/*! \brief Set Indicates the country's sizing system in which you are submitting your product. Must be one of the following values (upper or lowercased): 'US', 'UK', 'EU', 'DE', 'FR', 'JP', 'CN', 'IT', 'BR', 'MEX', or 'AU'.
	 */
	void setSizeSystem(std::string  size_system);
	/*! \brief Get Additional description for the size. Must be one of the following values (upper or lowercased): 'regular', 'petite', 'plus', 'big_and_tall', or 'maternity'.
	 */
	std::string getSizeType();

	/*! \brief Set Additional description for the size. Must be one of the following values (upper or lowercased): 'regular', 'petite', 'plus', 'big_and_tall', or 'maternity'.
	 */
	void setSizeType(std::string  size_type);
	/*! \brief Get Tax consists of one group of up to four elements, country, region, rate (all required) and tax_ship (optional). All colons, even for blank values, are required.
	 */
	std::string getTax();

	/*! \brief Set Tax consists of one group of up to four elements, country, region, rate (all required) and tax_ship (optional). All colons, even for blank values, are required.
	 */
	void setTax(std::string  tax);
	/*! \brief Get <= 500 characters. The name of the product.
	 */
	std::string getTitle();

	/*! \brief Set <= 500 characters. The name of the product.
	 */
	void setTitle(std::string  title);
	/*! \brief Get Unit pricing base measure of the product. Expected format: <base_measure> <unit_type>
	 */
	std::string getUnitPricingBaseMeasure();

	/*! \brief Set Unit pricing base measure of the product. Expected format: <base_measure> <unit_type>
	 */
	void setUnitPricingBaseMeasure(std::string  unit_pricing_base_measure);
	/*! \brief Get Unit pricing total measure of the product. Expected format: <total_units> <unit_type>
	 */
	std::string getUnitPricingMeasure();

	/*! \brief Set Unit pricing total measure of the product. Expected format: <total_units> <unit_type>
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
	/*! \brief Get <= 2000 characters. The links to additional images for your product. Up to ten additional images can be used to show a product from different angles or to show different stages. Must begin with http:// or https://.
	 */
	std::list<std::string> getAdditionalImageLink();

	/*! \brief Set <= 2000 characters. The links to additional images for your product. Up to ten additional images can be used to show a product from different angles or to show different stages. Must begin with http:// or https://.
	 */
	void setAdditionalImageLink(std::list <std::string> additional_image_link);
	/*! \brief Get AI content disclosures for individual assets (image_link, additional_image_link, or video_link) on this item. Each entry declares which disclosure types apply to a single asset URL.
	 */
	std::list<CatalogsAiContentDisclosure> getAiDisclosures();

	/*! \brief Set AI content disclosures for individual assets (image_link, additional_image_link, or video_link) on this item. Each entry declares which disclosure types apply to a single asset URL.
	 */
	void setAiDisclosures(std::list <CatalogsAiContentDisclosure> ai_disclosures);
	/*! \brief Get <= 2000 characters. The links to the main product images. Images should be at least 75x75 pixels to avoid errors. Must start with http:// or https://.
	 */
	std::list<std::string> getImageLink();

	/*! \brief Set <= 2000 characters. The links to the main product images. Images should be at least 75x75 pixels to avoid errors. Must start with http:// or https://.
	 */
	void setImageLink(std::list <std::string> image_link);
	/*! \brief Get <= 2,000 characters. Hosted link to the product video. File types must be .mp4, .mov or .m4v. File size cannot exceed 2GB.
	 */
	std::string getVideoLink();

	/*! \brief Set <= 2,000 characters. Hosted link to the product video. File types must be .mp4, .mov or .m4v. File size cannot exceed 2GB.
	 */
	void setVideoLink(std::string  video_link);

private:
	std::string ad_image_0_link;
	std::string ad_image_0_tag;
	std::string ad_image_10_link;
	std::string ad_image_10_tag;
	std::string ad_image_11_link;
	std::string ad_image_11_tag;
	std::string ad_image_12_link;
	std::string ad_image_12_tag;
	std::string ad_image_13_link;
	std::string ad_image_13_tag;
	std::string ad_image_14_link;
	std::string ad_image_14_tag;
	std::string ad_image_15_link;
	std::string ad_image_15_tag;
	std::string ad_image_16_link;
	std::string ad_image_16_tag;
	std::string ad_image_17_link;
	std::string ad_image_17_tag;
	std::string ad_image_18_link;
	std::string ad_image_18_tag;
	std::string ad_image_19_link;
	std::string ad_image_19_tag;
	std::string ad_image_1_link;
	std::string ad_image_1_tag;
	std::string ad_image_2_link;
	std::string ad_image_2_tag;
	std::string ad_image_3_link;
	std::string ad_image_3_tag;
	std::string ad_image_4_link;
	std::string ad_image_4_tag;
	std::string ad_image_5_link;
	std::string ad_image_5_tag;
	std::string ad_image_6_link;
	std::string ad_image_6_tag;
	std::string ad_image_7_link;
	std::string ad_image_7_tag;
	std::string ad_image_8_link;
	std::string ad_image_8_tag;
	std::string ad_image_9_link;
	std::string ad_image_9_tag;
	std::string ad_link;
	std::string ad_video_0_link;
	std::string ad_video_0_tag;
	std::string ad_video_1_link;
	std::string ad_video_1_tag;
	std::string ad_video_2_link;
	std::string ad_video_2_tag;
	bool adult;
	std::string age_group;
	std::string android_deep_link;
	std::string availability;
	long long average_review_rating;
	std::string brand;
	bool checkout_enabled;
	std::string color;
	std::string condition;
	std::string custom_label_0;
	std::string custom_label_1;
	std::string custom_label_2;
	std::string custom_label_3;
	std::string custom_label_4;
	int custom_number_0;
	int custom_number_1;
	int custom_number_2;
	int custom_number_3;
	int custom_number_4;
	std::string description;
	bool free_shipping_label;
	std::string free_shipping_limit;
	std::string gender;
	std::string google_product_category;
	UpdatableItemAttributesGtin gtin;
	std::string id;
	std::string installment_price;
	std::string ios_deep_link;
	std::string item_group_id;
	long long last_updated_time;
	std::string link;
	std::string material;
	std::string min_ad_price;
	std::string mobile_link;
	std::string mpn;
	int number_of_ratings;
	int number_of_reviews;
	std::string pattern;
	std::string price;
	std::string product_type;
	std::string promotion_id;
	std::string sale_price;
	std::string sale_price_effective_date;
	std::string shipping;
	std::string shipping_height;
	std::string shipping_weight;
	std::string shipping_width;
	std::string size;
	std::string size_system;
	std::string size_type;
	std::string tax;
	std::string title;
	std::string unit_pricing_base_measure;
	std::string unit_pricing_measure;
	std::list <std::string>variant_names;
	std::list <std::string>variant_values;
	std::list <std::string>additional_image_link;
	std::list <CatalogsAiContentDisclosure>ai_disclosures;
	std::list <std::string>image_link;
	std::string video_link;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ItemAttributes_H_ */
