/*
 * Catalogs_local_stores_create_200_response_inner.h
 *
 * 
 */

#ifndef _Catalogs_local_stores_create_200_response_inner_H_
#define _Catalogs_local_stores_create_200_response_inner_H_


#include <string>
#include "Catalogs_local_stores_create_200_response_inner_data.h"
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

class Catalogs_local_stores_create_200_response_inner : public Object {
public:
	/*! \brief Constructor.
	 */
	Catalogs_local_stores_create_200_response_inner();
	Catalogs_local_stores_create_200_response_inner(char* str);

	/*! \brief Destructor.
	 */
	virtual ~Catalogs_local_stores_create_200_response_inner();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	Catalogs_local_stores_create_200_response_inner_data getData();

	/*! \brief Set 
	 */
	void setData(Catalogs_local_stores_create_200_response_inner_data  data);

private:
	Catalogs_local_stores_create_200_response_inner_data data;
	void __init();
	void __cleanup();

};
}
}

#endif /* _Catalogs_local_stores_create_200_response_inner_H_ */
