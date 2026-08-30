
/*
 * CatalogsCreativeAssetsFeed.h
 *
 * Catalogs Creative Asset Feed object
 */

#ifndef TINY_CPP_CLIENT_CatalogsCreativeAssetsFeed_H_
#define TINY_CPP_CLIENT_CatalogsCreativeAssetsFeed_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "CatalogsFeedCredentials.h"
#include "CatalogsFeedProcessingSchedule.h"
#include "CatalogsFormat.h"
#include "CatalogsStatus.h"
#include "Country.h"
#include "NullableCurrency.h"

namespace Tiny {


/*! \brief Catalogs Creative Asset Feed object
 *
 *  \ingroup Models
 *
 */

class CatalogsCreativeAssetsFeed{
public:

    /*! \brief Constructor.
	 */
    CatalogsCreativeAssetsFeed();
    CatalogsCreativeAssetsFeed(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~CatalogsCreativeAssetsFeed();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Catalog id pertaining to the feed. If not provided, feed will use a default catalog based on type.
	 */
	std::string getCatalogId();

	/*! \brief Set Catalog id pertaining to the feed. If not provided, feed will use a default catalog based on type.
	 */
	void setCatalogId(std::string catalog_id);
	/*! \brief Get 
	 */
	std::string getCatalogType();

	/*! \brief Set 
	 */
	void setCatalogType(std::string catalog_type);
	/*! \brief Get 
	 */
	std::string getCreatedAt();

	/*! \brief Set 
	 */
	void setCreatedAt(std::string created_at);
	/*! \brief Get 
	 */
	CatalogsFeedCredentials getCredentials();

	/*! \brief Set 
	 */
	void setCredentials(CatalogsFeedCredentials credentials);
	/*! \brief Get 
	 */
	Country getDefaultCountry();

	/*! \brief Set 
	 */
	void setDefaultCountry(Country default_country);
	/*! \brief Get 
	 */
	NullableCurrency getDefaultCurrency();

	/*! \brief Set 
	 */
	void setDefaultCurrency(NullableCurrency default_currency);
	/*! \brief Get The locale used within a feed for product descriptions.
	 */
	std::string getDefaultLocale();

	/*! \brief Set The locale used within a feed for product descriptions.
	 */
	void setDefaultLocale(std::string default_locale);
	/*! \brief Get 
	 */
	CatalogsFormat getFormat();

	/*! \brief Set 
	 */
	void setFormat(CatalogsFormat format);
	/*! \brief Get ID of the feed entity.
	 */
	std::string getId();

	/*! \brief Set ID of the feed entity.
	 */
	void setId(std::string id);
	/*! \brief Get The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing.
	 */
	std::string getLocation();

	/*! \brief Set The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing.
	 */
	void setLocation(std::string location);
	/*! \brief Get A human-friendly name associated to a given feed. This value is currently nullable due to historical reasons. It is expected to become non-nullable in the future.
	 */
	std::string getName();

	/*! \brief Set A human-friendly name associated to a given feed. This value is currently nullable due to historical reasons. It is expected to become non-nullable in the future.
	 */
	void setName(std::string name);
	/*! \brief Get 
	 */
	CatalogsFeedProcessingSchedule getPreferredProcessingSchedule();

	/*! \brief Set 
	 */
	void setPreferredProcessingSchedule(CatalogsFeedProcessingSchedule preferred_processing_schedule);
	/*! \brief Get 
	 */
	CatalogsStatus getStatus();

	/*! \brief Set 
	 */
	void setStatus(CatalogsStatus status);
	/*! \brief Get 
	 */
	std::string getUpdatedAt();

	/*! \brief Set 
	 */
	void setUpdatedAt(std::string updated_at);


    private:
    std::string catalog_id{};
    std::string catalog_type{};
    std::string created_at{};
    CatalogsFeedCredentials credentials;
    Country default_country;
    NullableCurrency default_currency;
    std::string default_locale{};
    CatalogsFormat format;
    std::string id{};
    std::string location{};
    std::string name{};
    CatalogsFeedProcessingSchedule preferred_processing_schedule;
    CatalogsStatus status;
    std::string updated_at{};
};
}

#endif /* TINY_CPP_CLIENT_CatalogsCreativeAssetsFeed_H_ */
