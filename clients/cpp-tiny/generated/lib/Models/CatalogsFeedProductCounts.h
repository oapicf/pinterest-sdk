
/*
 * CatalogsFeedProductCounts.h
 *
 * The counts can be null early in the process.
 */

#ifndef TINY_CPP_CLIENT_CatalogsFeedProductCounts_H_
#define TINY_CPP_CLIENT_CatalogsFeedProductCounts_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief The counts can be null early in the process.
 *
 *  \ingroup Models
 *
 */

class CatalogsFeedProductCounts{
public:

    /*! \brief Constructor.
	 */
    CatalogsFeedProductCounts();
    CatalogsFeedProductCounts(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~CatalogsFeedProductCounts();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get The number of products successfully ingested from the feed file.
	 */
	int getIngested();

	/*! \brief Set The number of products successfully ingested from the feed file.
	 */
	void setIngested(int ingested);
	/*! \brief Get The number of products in the feed file.
	 */
	int getOriginal();

	/*! \brief Set The number of products in the feed file.
	 */
	void setOriginal(int original);


    private:
    int ingested{};
    int original{};
};
}

#endif /* TINY_CPP_CLIENT_CatalogsFeedProductCounts_H_ */
