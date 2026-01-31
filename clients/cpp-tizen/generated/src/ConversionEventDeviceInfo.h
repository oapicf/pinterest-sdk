/*
 * ConversionEventDeviceInfo.h
 *
 * Object containing information about the device where event occurred.
 */

#ifndef _ConversionEventDeviceInfo_H_
#define _ConversionEventDeviceInfo_H_


#include <string>
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Object containing information about the device where event occurred.
 *
 *  \ingroup Models
 *
 */

class ConversionEventDeviceInfo : public Object {
public:
	/*! \brief Constructor.
	 */
	ConversionEventDeviceInfo();
	ConversionEventDeviceInfo(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ConversionEventDeviceInfo();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Battery charge level percentage
	 */
	int getBatteryLevel();

	/*! \brief Set Battery charge level percentage
	 */
	void setBatteryLevel(int  battery_level);
	/*! \brief Get Device brand
	 */
	std::string getBrand();

	/*! \brief Set Device brand
	 */
	void setBrand(std::string  brand);
	/*! \brief Get User device's mobile carrier.
	 */
	std::string getCarrier();

	/*! \brief Set User device's mobile carrier.
	 */
	void setCarrier(std::string  carrier);
	/*! \brief Get Number of CPU cores
	 */
	int getCpuCores();

	/*! \brief Set Number of CPU cores
	 */
	void setCpuCores(int  cpu_cores);
	/*! \brief Get External storage size in GB
	 */
	int getExternalStorageFreeSpace();

	/*! \brief Set External storage size in GB
	 */
	void setExternalStorageFreeSpace(int  external_storage_free_space);
	/*! \brief Get External storage size in GB
	 */
	int getExternalStorageSize();

	/*! \brief Set External storage size in GB
	 */
	void setExternalStorageSize(int  external_storage_size);
	/*! \brief Get Device form factor
	 */
	std::string getFormFactor();

	/*! \brief Set Device form factor
	 */
	void setFormFactor(std::string  form_factor);
	/*! \brief Get Kernel version. Examples: Linux: 6.15. Obtain by running: uname -r MacOS: 24.3.0. Obtain by running: sysctl kern.version Android: 6.6. Obtain from OS.uname().release
	 */
	std::string getKernelVersion();

	/*! \brief Set Kernel version. Examples: Linux: 6.15. Obtain by running: uname -r MacOS: 24.3.0. Obtain by running: sysctl kern.version Android: 6.6. Obtain from OS.uname().release
	 */
	void setKernelVersion(std::string  kernel_version);
	/*! \brief Get List of user installed languages. ISO 639-1 format
	 */
	std::list<std::string> getLanguages();

	/*! \brief Set List of user installed languages. ISO 639-1 format
	 */
	void setLanguages(std::list <std::string> languages);
	/*! \brief Get Device locale BCP-47 format
	 */
	std::string getLocale();

	/*! \brief Set Device locale BCP-47 format
	 */
	void setLocale(std::string  locale);
	/*! \brief Get Device model name
	 */
	std::string getModel();

	/*! \brief Set Device model name
	 */
	void setModel(std::string  model);
	/*! \brief Get Network type: 4G, 5G, ethernet, wifi In Android: NetworkCapabilities.getNetworkCapabilities()
	 */
	std::string getNetworkType();

	/*! \brief Set Network type: 4G, 5G, ethernet, wifi In Android: NetworkCapabilities.getNetworkCapabilities()
	 */
	void setNetworkType(std::string  network_type);
	/*! \brief Get OS Family
	 */
	std::string getOsFamily();

	/*! \brief Set OS Family
	 */
	void setOsFamily(std::string  os_family);
	/*! \brief Get Short name of the OS. This value if specific to os family. Examples: Windows: 10, 11; Android: 16; iOS: 18; MacOS: 15; Linux: Debian, Ubuntu, Arch
	 */
	std::string getOsName();

	/*! \brief Set Short name of the OS. This value if specific to os family. Examples: Windows: 10, 11; Android: 16; iOS: 18; MacOS: 15; Linux: Debian, Ubuntu, Arch
	 */
	void setOsName(std::string  os_name);
	/*! \brief Get Marketing name for the release version iOS: Dawn Android: Baklava MacOS: Sequoia Ubuntu Linux: Plucky Puffin
	 */
	std::string getOsReleaseName();

	/*! \brief Set Marketing name for the release version iOS: Dawn Android: Baklava MacOS: Sequoia Ubuntu Linux: Plucky Puffin
	 */
	void setOsReleaseName(std::string  os_release_name);
	/*! \brief Get Full name of the version. Examples: iOS: 18.3 Android: 16.1 MacOS: 15.5 Windows: 24H2 Ubuntu Linux: 25.04
	 */
	std::string getOsVersion();

	/*! \brief Set Full name of the version. Examples: iOS: 18.3 Android: 16.1 MacOS: 15.5 Windows: 24H2 Ubuntu Linux: 25.04
	 */
	void setOsVersion(std::string  os_version);
	/*! \brief Get Screen density, PPI
	 */
	int getScreenDensity();

	/*! \brief Set Screen density, PPI
	 */
	void setScreenDensity(int  screen_density);
	/*! \brief Get Screen height in pixels
	 */
	int getScreenHeight();

	/*! \brief Set Screen height in pixels
	 */
	void setScreenHeight(int  screen_height);
	/*! \brief Get Screen width in pixels
	 */
	int getScreenWidth();

	/*! \brief Set Screen width in pixels
	 */
	void setScreenWidth(int  screen_width);
	/*! \brief Get Internal storage size in GB
	 */
	int getStorageFreeSpace();

	/*! \brief Set Internal storage size in GB
	 */
	void setStorageFreeSpace(int  storage_free_space);
	/*! \brief Get Internal storage size in GB
	 */
	int getStorageSize();

	/*! \brief Set Internal storage size in GB
	 */
	void setStorageSize(int  storage_size);
	/*! \brief Get Device timezone
	 */
	std::string getTimezone();

	/*! \brief Set Device timezone
	 */
	void setTimezone(std::string  timezone);
	/*! \brief Get Timezone abbreviation
	 */
	std::string getTimezoneAbbr();

	/*! \brief Set Timezone abbreviation
	 */
	void setTimezoneAbbr(std::string  timezone_abbr);
	/*! \brief Get Device type
	 */
	std::string getType();

	/*! \brief Set Device type
	 */
	void setType(std::string  type);

private:
	int battery_level;
	std::string brand;
	std::string carrier;
	int cpu_cores;
	int external_storage_free_space;
	int external_storage_size;
	std::string form_factor;
	std::string kernel_version;
	std::list <std::string>languages;
	std::string locale;
	std::string model;
	std::string network_type;
	std::string os_family;
	std::string os_name;
	std::string os_release_name;
	std::string os_version;
	int screen_density;
	int screen_height;
	int screen_width;
	int storage_free_space;
	int storage_size;
	std::string timezone;
	std::string timezone_abbr;
	std::string type;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ConversionEventDeviceInfo_H_ */
