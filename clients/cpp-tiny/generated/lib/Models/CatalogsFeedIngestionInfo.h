
/*
 * CatalogsFeedIngestionInfo.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_CatalogsFeedIngestionInfo_H_
#define TINY_CPP_CLIENT_CatalogsFeedIngestionInfo_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class CatalogsFeedIngestionInfo{
public:

    /*! \brief Constructor.
	 */
    CatalogsFeedIngestionInfo();
    CatalogsFeedIngestionInfo(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~CatalogsFeedIngestionInfo();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get The number of ingested products that are in stock.
	 */
	int getINSTOCK();

	/*! \brief Set The number of ingested products that are in stock.
	 */
	void setINSTOCK(int iN_STOCK);
	/*! \brief Get The number of ingested products that are in out of stock.
	 */
	int getOUTOFSTOCK();

	/*! \brief Set The number of ingested products that are in out of stock.
	 */
	void setOUTOFSTOCK(int oUT_OF_STOCK);
	/*! \brief Get The number of ingested products that are in preorder.
	 */
	int getPREORDER();

	/*! \brief Set The number of ingested products that are in preorder.
	 */
	void setPREORDER(int pREORDER);


    private:
    int iN_STOCK{};
    int oUT_OF_STOCK{};
    int pREORDER{};
};
}

#endif /* TINY_CPP_CLIENT_CatalogsFeedIngestionInfo_H_ */
