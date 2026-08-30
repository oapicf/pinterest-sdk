
/*
 * TrendingPin.h
 *
 * Pin image data for trending topics
 */

#ifndef TINY_CPP_CLIENT_TrendingPin_H_
#define TINY_CPP_CLIENT_TrendingPin_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Pin image data for trending topics
 *
 *  \ingroup Models
 *
 */

class TrendingPin{
public:

    /*! \brief Constructor.
	 */
    TrendingPin();
    TrendingPin(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~TrendingPin();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Dominant color of the pin image in hex format
	 */
	std::string getColor();

	/*! \brief Set Dominant color of the pin image in hex format
	 */
	void setColor(std::string color);
	/*! \brief Get Height of the pin image in pixels
	 */
	int getHeight();

	/*! \brief Set Height of the pin image in pixels
	 */
	void setHeight(int height);
	/*! \brief Get Unique identifier for the pin
	 */
	std::string getId();

	/*! \brief Set Unique identifier for the pin
	 */
	void setId(std::string id);
	/*! \brief Get URL of the pin image
	 */
	std::string getSrc();

	/*! \brief Set URL of the pin image
	 */
	void setSrc(std::string src);
	/*! \brief Get The vertical offset of the pin image as a percentage from 0 to 100, where 0 is the top of the image and 100 is the bottom.
	 */
	double getVerticalOffset();

	/*! \brief Set The vertical offset of the pin image as a percentage from 0 to 100, where 0 is the top of the image and 100 is the bottom.
	 */
	void setVerticalOffset(double vertical_offset);
	/*! \brief Get Width of the pin image in pixels
	 */
	int getWidth();

	/*! \brief Set Width of the pin image in pixels
	 */
	void setWidth(int width);


    private:
    std::string color{};
    int height{};
    std::string id{};
    std::string src{};
    double vertical_offset{};
    int width{};
};
}

#endif /* TINY_CPP_CLIENT_TrendingPin_H_ */
