
/*
 * CartingRetailer.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_CartingRetailer_H_
#define TINY_CPP_CLIENT_CartingRetailer_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class CartingRetailer{
public:

    /*! \brief Constructor.
	 */
    CartingRetailer();
    CartingRetailer(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~CartingRetailer();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Unique identifier for the retailer
	 */
	std::string getRetailerId();

	/*! \brief Set Unique identifier for the retailer
	 */
	void setRetailerId(std::string retailer_id);
	/*! \brief Get Name of the retailer
	 */
	std::string getRetailerName();

	/*! \brief Set Name of the retailer
	 */
	void setRetailerName(std::string retailer_name);


    private:
    std::string retailer_id{};
    std::string retailer_name{};
};
}

#endif /* TINY_CPP_CLIENT_CartingRetailer_H_ */
