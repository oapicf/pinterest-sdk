

#include "ConversionEventDeviceInfo.h"

using namespace Tiny;

ConversionEventDeviceInfo::ConversionEventDeviceInfo()
{
	battery_level = int(0);
	brand = std::string();
	carrier = std::string();
	cpu_cores = int(0);
	external_storage_free_space = int(0);
	external_storage_size = int(0);
	form_factor = std::string();
	kernel_version = std::string();
	languages = std::list<std::string>();
	locale = std::string();
	model = std::string();
	network_type = std::string();
	os_family = std::string();
	os_name = std::string();
	os_release_name = std::string();
	os_version = std::string();
	screen_density = int(0);
	screen_height = int(0);
	screen_width = int(0);
	storage_free_space = int(0);
	storage_size = int(0);
	timezone = std::string();
	timezone_abbr = std::string();
	type = std::string();
}

ConversionEventDeviceInfo::ConversionEventDeviceInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ConversionEventDeviceInfo::~ConversionEventDeviceInfo()
{

}

void
ConversionEventDeviceInfo::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *battery_levelKey = "battery_level";

    if(object.has_key(battery_levelKey))
    {
        bourne::json value = object[battery_levelKey];



        jsonToValue(&battery_level, value, "int");


    }

    const char *brandKey = "brand";

    if(object.has_key(brandKey))
    {
        bourne::json value = object[brandKey];



        jsonToValue(&brand, value, "std::string");


    }

    const char *carrierKey = "carrier";

    if(object.has_key(carrierKey))
    {
        bourne::json value = object[carrierKey];



        jsonToValue(&carrier, value, "std::string");


    }

    const char *cpu_coresKey = "cpu_cores";

    if(object.has_key(cpu_coresKey))
    {
        bourne::json value = object[cpu_coresKey];



        jsonToValue(&cpu_cores, value, "int");


    }

    const char *external_storage_free_spaceKey = "external_storage_free_space";

    if(object.has_key(external_storage_free_spaceKey))
    {
        bourne::json value = object[external_storage_free_spaceKey];



        jsonToValue(&external_storage_free_space, value, "int");


    }

    const char *external_storage_sizeKey = "external_storage_size";

    if(object.has_key(external_storage_sizeKey))
    {
        bourne::json value = object[external_storage_sizeKey];



        jsonToValue(&external_storage_size, value, "int");


    }

    const char *form_factorKey = "form_factor";

    if(object.has_key(form_factorKey))
    {
        bourne::json value = object[form_factorKey];



        jsonToValue(&form_factor, value, "std::string");


    }

    const char *kernel_versionKey = "kernel_version";

    if(object.has_key(kernel_versionKey))
    {
        bourne::json value = object[kernel_versionKey];



        jsonToValue(&kernel_version, value, "std::string");


    }

    const char *languagesKey = "languages";

    if(object.has_key(languagesKey))
    {
        bourne::json value = object[languagesKey];


        std::list<std::string> languages_list;
        std::string element;
        for(auto& var : value.array_range())
        {

            jsonToValue(&element, var, "std::string");


            languages_list.push_back(element);
        }
        languages = languages_list;


    }

    const char *localeKey = "locale";

    if(object.has_key(localeKey))
    {
        bourne::json value = object[localeKey];



        jsonToValue(&locale, value, "std::string");


    }

    const char *modelKey = "model";

    if(object.has_key(modelKey))
    {
        bourne::json value = object[modelKey];



        jsonToValue(&model, value, "std::string");


    }

    const char *network_typeKey = "network_type";

    if(object.has_key(network_typeKey))
    {
        bourne::json value = object[network_typeKey];



        jsonToValue(&network_type, value, "std::string");


    }

    const char *os_familyKey = "os_family";

    if(object.has_key(os_familyKey))
    {
        bourne::json value = object[os_familyKey];



        jsonToValue(&os_family, value, "std::string");


    }

    const char *os_nameKey = "os_name";

    if(object.has_key(os_nameKey))
    {
        bourne::json value = object[os_nameKey];



        jsonToValue(&os_name, value, "std::string");


    }

    const char *os_release_nameKey = "os_release_name";

    if(object.has_key(os_release_nameKey))
    {
        bourne::json value = object[os_release_nameKey];



        jsonToValue(&os_release_name, value, "std::string");


    }

    const char *os_versionKey = "os_version";

    if(object.has_key(os_versionKey))
    {
        bourne::json value = object[os_versionKey];



        jsonToValue(&os_version, value, "std::string");


    }

    const char *screen_densityKey = "screen_density";

    if(object.has_key(screen_densityKey))
    {
        bourne::json value = object[screen_densityKey];



        jsonToValue(&screen_density, value, "int");


    }

    const char *screen_heightKey = "screen_height";

    if(object.has_key(screen_heightKey))
    {
        bourne::json value = object[screen_heightKey];



        jsonToValue(&screen_height, value, "int");


    }

    const char *screen_widthKey = "screen_width";

    if(object.has_key(screen_widthKey))
    {
        bourne::json value = object[screen_widthKey];



        jsonToValue(&screen_width, value, "int");


    }

    const char *storage_free_spaceKey = "storage_free_space";

    if(object.has_key(storage_free_spaceKey))
    {
        bourne::json value = object[storage_free_spaceKey];



        jsonToValue(&storage_free_space, value, "int");


    }

    const char *storage_sizeKey = "storage_size";

    if(object.has_key(storage_sizeKey))
    {
        bourne::json value = object[storage_sizeKey];



        jsonToValue(&storage_size, value, "int");


    }

    const char *timezoneKey = "timezone";

    if(object.has_key(timezoneKey))
    {
        bourne::json value = object[timezoneKey];



        jsonToValue(&timezone, value, "std::string");


    }

    const char *timezone_abbrKey = "timezone_abbr";

    if(object.has_key(timezone_abbrKey))
    {
        bourne::json value = object[timezone_abbrKey];



        jsonToValue(&timezone_abbr, value, "std::string");


    }

    const char *typeKey = "type";

    if(object.has_key(typeKey))
    {
        bourne::json value = object[typeKey];



        jsonToValue(&type, value, "std::string");


    }


}

bourne::json
ConversionEventDeviceInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["battery_level"] = getBatteryLevel();






    object["brand"] = getBrand();






    object["carrier"] = getCarrier();






    object["cpu_cores"] = getCpuCores();






    object["external_storage_free_space"] = getExternalStorageFreeSpace();






    object["external_storage_size"] = getExternalStorageSize();






    object["form_factor"] = getFormFactor();






    object["kernel_version"] = getKernelVersion();





    std::list<std::string> languages_list = getLanguages();
    bourne::json languages_arr = bourne::json::array();

    for(auto& var : languages_list)
    {
        languages_arr.append(var);
    }
    object["languages"] = languages_arr;









    object["locale"] = getLocale();






    object["model"] = getModel();






    object["network_type"] = getNetworkType();






    object["os_family"] = getOsFamily();






    object["os_name"] = getOsName();






    object["os_release_name"] = getOsReleaseName();






    object["os_version"] = getOsVersion();






    object["screen_density"] = getScreenDensity();






    object["screen_height"] = getScreenHeight();






    object["screen_width"] = getScreenWidth();






    object["storage_free_space"] = getStorageFreeSpace();






    object["storage_size"] = getStorageSize();






    object["timezone"] = getTimezone();






    object["timezone_abbr"] = getTimezoneAbbr();






    object["type"] = getType();



    return object;

}

int
ConversionEventDeviceInfo::getBatteryLevel()
{
	return battery_level;
}

void
ConversionEventDeviceInfo::setBatteryLevel(int  battery_level)
{
	this->battery_level = battery_level;
}

std::string
ConversionEventDeviceInfo::getBrand()
{
	return brand;
}

void
ConversionEventDeviceInfo::setBrand(std::string  brand)
{
	this->brand = brand;
}

std::string
ConversionEventDeviceInfo::getCarrier()
{
	return carrier;
}

void
ConversionEventDeviceInfo::setCarrier(std::string  carrier)
{
	this->carrier = carrier;
}

int
ConversionEventDeviceInfo::getCpuCores()
{
	return cpu_cores;
}

void
ConversionEventDeviceInfo::setCpuCores(int  cpu_cores)
{
	this->cpu_cores = cpu_cores;
}

int
ConversionEventDeviceInfo::getExternalStorageFreeSpace()
{
	return external_storage_free_space;
}

void
ConversionEventDeviceInfo::setExternalStorageFreeSpace(int  external_storage_free_space)
{
	this->external_storage_free_space = external_storage_free_space;
}

int
ConversionEventDeviceInfo::getExternalStorageSize()
{
	return external_storage_size;
}

void
ConversionEventDeviceInfo::setExternalStorageSize(int  external_storage_size)
{
	this->external_storage_size = external_storage_size;
}

std::string
ConversionEventDeviceInfo::getFormFactor()
{
	return form_factor;
}

void
ConversionEventDeviceInfo::setFormFactor(std::string  form_factor)
{
	this->form_factor = form_factor;
}

std::string
ConversionEventDeviceInfo::getKernelVersion()
{
	return kernel_version;
}

void
ConversionEventDeviceInfo::setKernelVersion(std::string  kernel_version)
{
	this->kernel_version = kernel_version;
}

std::list<std::string>
ConversionEventDeviceInfo::getLanguages()
{
	return languages;
}

void
ConversionEventDeviceInfo::setLanguages(std::list <std::string> languages)
{
	this->languages = languages;
}

std::string
ConversionEventDeviceInfo::getLocale()
{
	return locale;
}

void
ConversionEventDeviceInfo::setLocale(std::string  locale)
{
	this->locale = locale;
}

std::string
ConversionEventDeviceInfo::getModel()
{
	return model;
}

void
ConversionEventDeviceInfo::setModel(std::string  model)
{
	this->model = model;
}

std::string
ConversionEventDeviceInfo::getNetworkType()
{
	return network_type;
}

void
ConversionEventDeviceInfo::setNetworkType(std::string  network_type)
{
	this->network_type = network_type;
}

std::string
ConversionEventDeviceInfo::getOsFamily()
{
	return os_family;
}

void
ConversionEventDeviceInfo::setOsFamily(std::string  os_family)
{
	this->os_family = os_family;
}

std::string
ConversionEventDeviceInfo::getOsName()
{
	return os_name;
}

void
ConversionEventDeviceInfo::setOsName(std::string  os_name)
{
	this->os_name = os_name;
}

std::string
ConversionEventDeviceInfo::getOsReleaseName()
{
	return os_release_name;
}

void
ConversionEventDeviceInfo::setOsReleaseName(std::string  os_release_name)
{
	this->os_release_name = os_release_name;
}

std::string
ConversionEventDeviceInfo::getOsVersion()
{
	return os_version;
}

void
ConversionEventDeviceInfo::setOsVersion(std::string  os_version)
{
	this->os_version = os_version;
}

int
ConversionEventDeviceInfo::getScreenDensity()
{
	return screen_density;
}

void
ConversionEventDeviceInfo::setScreenDensity(int  screen_density)
{
	this->screen_density = screen_density;
}

int
ConversionEventDeviceInfo::getScreenHeight()
{
	return screen_height;
}

void
ConversionEventDeviceInfo::setScreenHeight(int  screen_height)
{
	this->screen_height = screen_height;
}

int
ConversionEventDeviceInfo::getScreenWidth()
{
	return screen_width;
}

void
ConversionEventDeviceInfo::setScreenWidth(int  screen_width)
{
	this->screen_width = screen_width;
}

int
ConversionEventDeviceInfo::getStorageFreeSpace()
{
	return storage_free_space;
}

void
ConversionEventDeviceInfo::setStorageFreeSpace(int  storage_free_space)
{
	this->storage_free_space = storage_free_space;
}

int
ConversionEventDeviceInfo::getStorageSize()
{
	return storage_size;
}

void
ConversionEventDeviceInfo::setStorageSize(int  storage_size)
{
	this->storage_size = storage_size;
}

std::string
ConversionEventDeviceInfo::getTimezone()
{
	return timezone;
}

void
ConversionEventDeviceInfo::setTimezone(std::string  timezone)
{
	this->timezone = timezone;
}

std::string
ConversionEventDeviceInfo::getTimezoneAbbr()
{
	return timezone_abbr;
}

void
ConversionEventDeviceInfo::setTimezoneAbbr(std::string  timezone_abbr)
{
	this->timezone_abbr = timezone_abbr;
}

std::string
ConversionEventDeviceInfo::getType()
{
	return type;
}

void
ConversionEventDeviceInfo::setType(std::string  type)
{
	this->type = type;
}



