
/*
 * FreqBidMultiplierTimeWindow.h
 *
 * The time window for frequency bid multipliers.
 */

#ifndef TINY_CPP_CLIENT_FreqBidMultiplierTimeWindow_H_
#define TINY_CPP_CLIENT_FreqBidMultiplierTimeWindow_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief The time window for frequency bid multipliers.
 *
 *  \ingroup Models
 *
 */

class FreqBidMultiplierTimeWindow{
public:

    /*! \brief Constructor.
	 */
    FreqBidMultiplierTimeWindow();
    FreqBidMultiplierTimeWindow(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~FreqBidMultiplierTimeWindow();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);



    private:
};
}

#endif /* TINY_CPP_CLIENT_FreqBidMultiplierTimeWindow_H_ */
