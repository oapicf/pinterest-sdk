#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ConversionEventDeviceInfo.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ConversionEventDeviceInfo::ConversionEventDeviceInfo()
{
	//__init();
}

ConversionEventDeviceInfo::~ConversionEventDeviceInfo()
{
	//__cleanup();
}

void
ConversionEventDeviceInfo::__init()
{
	//battery_level = int(0);
	//brand = std::string();
	//carrier = std::string();
	//cpu_cores = int(0);
	//external_storage_free_space = int(0);
	//external_storage_size = int(0);
	//form_factor = std::string();
	//kernel_version = std::string();
	//new std::list()std::list> languages;
	//locale = std::string();
	//model = std::string();
	//network_type = std::string();
	//os_family = std::string();
	//os_name = std::string();
	//os_release_name = std::string();
	//os_version = std::string();
	//screen_density = int(0);
	//screen_height = int(0);
	//screen_width = int(0);
	//storage_free_space = int(0);
	//storage_size = int(0);
	//timezone = std::string();
	//timezone_abbr = std::string();
	//type = std::string();
}

void
ConversionEventDeviceInfo::__cleanup()
{
	//if(battery_level != NULL) {
	//
	//delete battery_level;
	//battery_level = NULL;
	//}
	//if(brand != NULL) {
	//
	//delete brand;
	//brand = NULL;
	//}
	//if(carrier != NULL) {
	//
	//delete carrier;
	//carrier = NULL;
	//}
	//if(cpu_cores != NULL) {
	//
	//delete cpu_cores;
	//cpu_cores = NULL;
	//}
	//if(external_storage_free_space != NULL) {
	//
	//delete external_storage_free_space;
	//external_storage_free_space = NULL;
	//}
	//if(external_storage_size != NULL) {
	//
	//delete external_storage_size;
	//external_storage_size = NULL;
	//}
	//if(form_factor != NULL) {
	//
	//delete form_factor;
	//form_factor = NULL;
	//}
	//if(kernel_version != NULL) {
	//
	//delete kernel_version;
	//kernel_version = NULL;
	//}
	//if(languages != NULL) {
	//languages.RemoveAll(true);
	//delete languages;
	//languages = NULL;
	//}
	//if(locale != NULL) {
	//
	//delete locale;
	//locale = NULL;
	//}
	//if(model != NULL) {
	//
	//delete model;
	//model = NULL;
	//}
	//if(network_type != NULL) {
	//
	//delete network_type;
	//network_type = NULL;
	//}
	//if(os_family != NULL) {
	//
	//delete os_family;
	//os_family = NULL;
	//}
	//if(os_name != NULL) {
	//
	//delete os_name;
	//os_name = NULL;
	//}
	//if(os_release_name != NULL) {
	//
	//delete os_release_name;
	//os_release_name = NULL;
	//}
	//if(os_version != NULL) {
	//
	//delete os_version;
	//os_version = NULL;
	//}
	//if(screen_density != NULL) {
	//
	//delete screen_density;
	//screen_density = NULL;
	//}
	//if(screen_height != NULL) {
	//
	//delete screen_height;
	//screen_height = NULL;
	//}
	//if(screen_width != NULL) {
	//
	//delete screen_width;
	//screen_width = NULL;
	//}
	//if(storage_free_space != NULL) {
	//
	//delete storage_free_space;
	//storage_free_space = NULL;
	//}
	//if(storage_size != NULL) {
	//
	//delete storage_size;
	//storage_size = NULL;
	//}
	//if(timezone != NULL) {
	//
	//delete timezone;
	//timezone = NULL;
	//}
	//if(timezone_abbr != NULL) {
	//
	//delete timezone_abbr;
	//timezone_abbr = NULL;
	//}
	//if(type != NULL) {
	//
	//delete type;
	//type = NULL;
	//}
	//
}

void
ConversionEventDeviceInfo::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *battery_levelKey = "battery_level";
	node = json_object_get_member(pJsonObject, battery_levelKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&battery_level, node, "int", "");
		} else {
			
		}
	}
	const gchar *brandKey = "brand";
	node = json_object_get_member(pJsonObject, brandKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&brand, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *carrierKey = "carrier";
	node = json_object_get_member(pJsonObject, carrierKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&carrier, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *cpu_coresKey = "cpu_cores";
	node = json_object_get_member(pJsonObject, cpu_coresKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&cpu_cores, node, "int", "");
		} else {
			
		}
	}
	const gchar *external_storage_free_spaceKey = "external_storage_free_space";
	node = json_object_get_member(pJsonObject, external_storage_free_spaceKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&external_storage_free_space, node, "int", "");
		} else {
			
		}
	}
	const gchar *external_storage_sizeKey = "external_storage_size";
	node = json_object_get_member(pJsonObject, external_storage_sizeKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&external_storage_size, node, "int", "");
		} else {
			
		}
	}
	const gchar *form_factorKey = "form_factor";
	node = json_object_get_member(pJsonObject, form_factorKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&form_factor, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *kernel_versionKey = "kernel_version";
	node = json_object_get_member(pJsonObject, kernel_versionKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&kernel_version, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *languagesKey = "languages";
	node = json_object_get_member(pJsonObject, languagesKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<std::string> new_list;
			std::string inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("std::string")) {
					jsonToValue(&inst, temp_json, "std::string", "");
				} else {
					
				}
				new_list.push_back(inst);
			}
			languages = new_list;
		}
		
	}
	const gchar *localeKey = "locale";
	node = json_object_get_member(pJsonObject, localeKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&locale, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *modelKey = "model";
	node = json_object_get_member(pJsonObject, modelKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&model, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *network_typeKey = "network_type";
	node = json_object_get_member(pJsonObject, network_typeKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&network_type, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *os_familyKey = "os_family";
	node = json_object_get_member(pJsonObject, os_familyKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&os_family, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *os_nameKey = "os_name";
	node = json_object_get_member(pJsonObject, os_nameKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&os_name, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *os_release_nameKey = "os_release_name";
	node = json_object_get_member(pJsonObject, os_release_nameKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&os_release_name, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *os_versionKey = "os_version";
	node = json_object_get_member(pJsonObject, os_versionKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&os_version, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *screen_densityKey = "screen_density";
	node = json_object_get_member(pJsonObject, screen_densityKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&screen_density, node, "int", "");
		} else {
			
		}
	}
	const gchar *screen_heightKey = "screen_height";
	node = json_object_get_member(pJsonObject, screen_heightKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&screen_height, node, "int", "");
		} else {
			
		}
	}
	const gchar *screen_widthKey = "screen_width";
	node = json_object_get_member(pJsonObject, screen_widthKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&screen_width, node, "int", "");
		} else {
			
		}
	}
	const gchar *storage_free_spaceKey = "storage_free_space";
	node = json_object_get_member(pJsonObject, storage_free_spaceKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&storage_free_space, node, "int", "");
		} else {
			
		}
	}
	const gchar *storage_sizeKey = "storage_size";
	node = json_object_get_member(pJsonObject, storage_sizeKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&storage_size, node, "int", "");
		} else {
			
		}
	}
	const gchar *timezoneKey = "timezone";
	node = json_object_get_member(pJsonObject, timezoneKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&timezone, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *timezone_abbrKey = "timezone_abbr";
	node = json_object_get_member(pJsonObject, timezone_abbrKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&timezone_abbr, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *typeKey = "type";
	node = json_object_get_member(pJsonObject, typeKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&type, node, "std::string", "");
		} else {
			
		}
	}
}

ConversionEventDeviceInfo::ConversionEventDeviceInfo(char* json)
{
	this->fromJson(json);
}

char*
ConversionEventDeviceInfo::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("int")) {
		int obj = getBatteryLevel();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *battery_levelKey = "battery_level";
	json_object_set_member(pJsonObject, battery_levelKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getBrand();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *brandKey = "brand";
	json_object_set_member(pJsonObject, brandKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getCarrier();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *carrierKey = "carrier";
	json_object_set_member(pJsonObject, carrierKey, node);
	if (isprimitive("int")) {
		int obj = getCpuCores();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *cpu_coresKey = "cpu_cores";
	json_object_set_member(pJsonObject, cpu_coresKey, node);
	if (isprimitive("int")) {
		int obj = getExternalStorageFreeSpace();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *external_storage_free_spaceKey = "external_storage_free_space";
	json_object_set_member(pJsonObject, external_storage_free_spaceKey, node);
	if (isprimitive("int")) {
		int obj = getExternalStorageSize();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *external_storage_sizeKey = "external_storage_size";
	json_object_set_member(pJsonObject, external_storage_sizeKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getFormFactor();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *form_factorKey = "form_factor";
	json_object_set_member(pJsonObject, form_factorKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getKernelVersion();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *kernel_versionKey = "kernel_version";
	json_object_set_member(pJsonObject, kernel_versionKey, node);
	if (isprimitive("std::string")) {
		list<std::string> new_list = static_cast<list <std::string> > (getLanguages());
		node = converttoJson(&new_list, "std::string", "array");
	} else {
		node = json_node_alloc();
		list<std::string> new_list = static_cast<list <std::string> > (getLanguages());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
	}


	
	const gchar *languagesKey = "languages";
	json_object_set_member(pJsonObject, languagesKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getLocale();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *localeKey = "locale";
	json_object_set_member(pJsonObject, localeKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getModel();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *modelKey = "model";
	json_object_set_member(pJsonObject, modelKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getNetworkType();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *network_typeKey = "network_type";
	json_object_set_member(pJsonObject, network_typeKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getOsFamily();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *os_familyKey = "os_family";
	json_object_set_member(pJsonObject, os_familyKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getOsName();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *os_nameKey = "os_name";
	json_object_set_member(pJsonObject, os_nameKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getOsReleaseName();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *os_release_nameKey = "os_release_name";
	json_object_set_member(pJsonObject, os_release_nameKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getOsVersion();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *os_versionKey = "os_version";
	json_object_set_member(pJsonObject, os_versionKey, node);
	if (isprimitive("int")) {
		int obj = getScreenDensity();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *screen_densityKey = "screen_density";
	json_object_set_member(pJsonObject, screen_densityKey, node);
	if (isprimitive("int")) {
		int obj = getScreenHeight();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *screen_heightKey = "screen_height";
	json_object_set_member(pJsonObject, screen_heightKey, node);
	if (isprimitive("int")) {
		int obj = getScreenWidth();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *screen_widthKey = "screen_width";
	json_object_set_member(pJsonObject, screen_widthKey, node);
	if (isprimitive("int")) {
		int obj = getStorageFreeSpace();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *storage_free_spaceKey = "storage_free_space";
	json_object_set_member(pJsonObject, storage_free_spaceKey, node);
	if (isprimitive("int")) {
		int obj = getStorageSize();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *storage_sizeKey = "storage_size";
	json_object_set_member(pJsonObject, storage_sizeKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getTimezone();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *timezoneKey = "timezone";
	json_object_set_member(pJsonObject, timezoneKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getTimezoneAbbr();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *timezone_abbrKey = "timezone_abbr";
	json_object_set_member(pJsonObject, timezone_abbrKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getType();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *typeKey = "type";
	json_object_set_member(pJsonObject, typeKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
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


