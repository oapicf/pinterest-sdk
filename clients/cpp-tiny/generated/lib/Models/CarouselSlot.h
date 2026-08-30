
/*
 * CarouselSlot.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_CarouselSlot_H_
#define TINY_CPP_CLIENT_CarouselSlot_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class CarouselSlot{
public:

    /*! \brief Constructor.
	 */
    CarouselSlot();
    CarouselSlot(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~CarouselSlot();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Carousel Pin slot description.
	 */
	std::string getDescription();

	/*! \brief Set Carousel Pin slot description.
	 */
	void setDescription(std::string description);
	/*! \brief Get Carousel Pin slot link.
	 */
	std::string getLink();

	/*! \brief Set Carousel Pin slot link.
	 */
	void setLink(std::string link);
	/*! \brief Get Carousel Pin slot title.
	 */
	std::string getTitle();

	/*! \brief Set Carousel Pin slot title.
	 */
	void setTitle(std::string title);


    private:
    std::string description{};
    std::string link{};
    std::string title{};
};
}

#endif /* TINY_CPP_CLIENT_CarouselSlot_H_ */
