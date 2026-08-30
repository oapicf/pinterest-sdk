/*
 * StoreMetadata.h
 *
 * Store metadata for a specific store location
 */

#ifndef _StoreMetadata_H_
#define _StoreMetadata_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Store metadata for a specific store location
 *
 *  \ingroup Models
 *
 */

class StoreMetadata : public Object {
public:
	/*! \brief Constructor.
	 */
	StoreMetadata();
	StoreMetadata(char* str);

	/*! \brief Destructor.
	 */
	virtual ~StoreMetadata();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Geohash of the store location
	 */
	std::string getGeohash();

	/*! \brief Set Geohash of the store location
	 */
	void setGeohash(std::string  geohash);
	/*! \brief Get Geographic latitude coordinate of the store
	 */
	double getLatitude();

	/*! \brief Set Geographic latitude coordinate of the store
	 */
	void setLatitude(double  latitude);
	/*! \brief Get Geographic longitude coordinate of the store
	 */
	double getLongitude();

	/*! \brief Set Geographic longitude coordinate of the store
	 */
	void setLongitude(double  longitude);
	/*! \brief Get Merchant provided store code
	 */
	std::string getStoreCode();

	/*! \brief Set Merchant provided store code
	 */
	void setStoreCode(std::string  store_code);
	/*! \brief Get Internal store code
	 */
	std::string getStoreId();

	/*! \brief Set Internal store code
	 */
	void setStoreId(std::string  store_id);
	/*! \brief Get Store name
	 */
	std::string getStoreName();

	/*! \brief Set Store name
	 */
	void setStoreName(std::string  store_name);

private:
	std::string geohash;
	double latitude;
	double longitude;
	std::string store_code;
	std::string store_id;
	std::string store_name;
	void __init();
	void __cleanup();

};
}
}

#endif /* _StoreMetadata_H_ */
