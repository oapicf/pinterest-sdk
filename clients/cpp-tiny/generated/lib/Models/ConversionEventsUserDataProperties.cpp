

#include "ConversionEventsUserDataProperties.h"

using namespace Tiny;

ConversionEventsUserDataProperties::ConversionEventsUserDataProperties()
{
	click_id = std::string();
	client_ip_address = std::string();
	client_user_agent = std::string();
	country = std::list<std::string>();
	ct = std::list<std::string>();
	db = std::list<std::string>();
	em = std::list<std::string>();
	external_id = std::list<std::string>();
	fn = std::list<std::string>();
	ge = std::list<std::string>();
	hashed_maids = std::list<std::string>();
	ln = std::list<std::string>();
	partner_id = std::string();
	ph = std::list<std::string>();
	st = std::list<std::string>();
	zp = std::list<std::string>();
}

ConversionEventsUserDataProperties::ConversionEventsUserDataProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ConversionEventsUserDataProperties::~ConversionEventsUserDataProperties()
{

}

void
ConversionEventsUserDataProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *click_idKey = "click_id";

    if(object.has_key(click_idKey))
    {
        bourne::json value = object[click_idKey];



        jsonToValue(&click_id, value, "std::string");


    }

    const char *client_ip_addressKey = "client_ip_address";

    if(object.has_key(client_ip_addressKey))
    {
        bourne::json value = object[client_ip_addressKey];



        jsonToValue(&client_ip_address, value, "std::string");


    }

    const char *client_user_agentKey = "client_user_agent";

    if(object.has_key(client_user_agentKey))
    {
        bourne::json value = object[client_user_agentKey];



        jsonToValue(&client_user_agent, value, "std::string");


    }

    const char *countryKey = "country";

    if(object.has_key(countryKey))
    {
        bourne::json value = object[countryKey];


        std::list<std::string> country_list;
        std::string element;
        for(auto& var : value.array_range())
        {

            jsonToValue(&element, var, "std::string");


            country_list.push_back(element);
        }
        country = country_list;


    }

    const char *ctKey = "ct";

    if(object.has_key(ctKey))
    {
        bourne::json value = object[ctKey];


        std::list<std::string> ct_list;
        std::string element;
        for(auto& var : value.array_range())
        {

            jsonToValue(&element, var, "std::string");


            ct_list.push_back(element);
        }
        ct = ct_list;


    }

    const char *dbKey = "db";

    if(object.has_key(dbKey))
    {
        bourne::json value = object[dbKey];


        std::list<std::string> db_list;
        std::string element;
        for(auto& var : value.array_range())
        {

            jsonToValue(&element, var, "std::string");


            db_list.push_back(element);
        }
        db = db_list;


    }

    const char *emKey = "em";

    if(object.has_key(emKey))
    {
        bourne::json value = object[emKey];


        std::list<std::string> em_list;
        std::string element;
        for(auto& var : value.array_range())
        {

            jsonToValue(&element, var, "std::string");


            em_list.push_back(element);
        }
        em = em_list;


    }

    const char *external_idKey = "external_id";

    if(object.has_key(external_idKey))
    {
        bourne::json value = object[external_idKey];


        std::list<std::string> external_id_list;
        std::string element;
        for(auto& var : value.array_range())
        {

            jsonToValue(&element, var, "std::string");


            external_id_list.push_back(element);
        }
        external_id = external_id_list;


    }

    const char *fnKey = "fn";

    if(object.has_key(fnKey))
    {
        bourne::json value = object[fnKey];


        std::list<std::string> fn_list;
        std::string element;
        for(auto& var : value.array_range())
        {

            jsonToValue(&element, var, "std::string");


            fn_list.push_back(element);
        }
        fn = fn_list;


    }

    const char *geKey = "ge";

    if(object.has_key(geKey))
    {
        bourne::json value = object[geKey];


        std::list<std::string> ge_list;
        std::string element;
        for(auto& var : value.array_range())
        {

            jsonToValue(&element, var, "std::string");


            ge_list.push_back(element);
        }
        ge = ge_list;


    }

    const char *hashed_maidsKey = "hashed_maids";

    if(object.has_key(hashed_maidsKey))
    {
        bourne::json value = object[hashed_maidsKey];


        std::list<std::string> hashed_maids_list;
        std::string element;
        for(auto& var : value.array_range())
        {

            jsonToValue(&element, var, "std::string");


            hashed_maids_list.push_back(element);
        }
        hashed_maids = hashed_maids_list;


    }

    const char *lnKey = "ln";

    if(object.has_key(lnKey))
    {
        bourne::json value = object[lnKey];


        std::list<std::string> ln_list;
        std::string element;
        for(auto& var : value.array_range())
        {

            jsonToValue(&element, var, "std::string");


            ln_list.push_back(element);
        }
        ln = ln_list;


    }

    const char *partner_idKey = "partner_id";

    if(object.has_key(partner_idKey))
    {
        bourne::json value = object[partner_idKey];



        jsonToValue(&partner_id, value, "std::string");


    }

    const char *phKey = "ph";

    if(object.has_key(phKey))
    {
        bourne::json value = object[phKey];


        std::list<std::string> ph_list;
        std::string element;
        for(auto& var : value.array_range())
        {

            jsonToValue(&element, var, "std::string");


            ph_list.push_back(element);
        }
        ph = ph_list;


    }

    const char *stKey = "st";

    if(object.has_key(stKey))
    {
        bourne::json value = object[stKey];


        std::list<std::string> st_list;
        std::string element;
        for(auto& var : value.array_range())
        {

            jsonToValue(&element, var, "std::string");


            st_list.push_back(element);
        }
        st = st_list;


    }

    const char *zpKey = "zp";

    if(object.has_key(zpKey))
    {
        bourne::json value = object[zpKey];


        std::list<std::string> zp_list;
        std::string element;
        for(auto& var : value.array_range())
        {

            jsonToValue(&element, var, "std::string");


            zp_list.push_back(element);
        }
        zp = zp_list;


    }


}

bourne::json
ConversionEventsUserDataProperties::toJson()
{
    bourne::json object = bourne::json::object();





    object["click_id"] = getClickId();






    object["client_ip_address"] = getClientIpAddress();






    object["client_user_agent"] = getClientUserAgent();





    std::list<std::string> country_list = getCountry();
    bourne::json country_arr = bourne::json::array();

    for(auto& var : country_list)
    {
        country_arr.append(var);
    }
    object["country"] = country_arr;








    std::list<std::string> ct_list = getCt();
    bourne::json ct_arr = bourne::json::array();

    for(auto& var : ct_list)
    {
        ct_arr.append(var);
    }
    object["ct"] = ct_arr;








    std::list<std::string> db_list = getDb();
    bourne::json db_arr = bourne::json::array();

    for(auto& var : db_list)
    {
        db_arr.append(var);
    }
    object["db"] = db_arr;








    std::list<std::string> em_list = getEm();
    bourne::json em_arr = bourne::json::array();

    for(auto& var : em_list)
    {
        em_arr.append(var);
    }
    object["em"] = em_arr;








    std::list<std::string> external_id_list = getExternalId();
    bourne::json external_id_arr = bourne::json::array();

    for(auto& var : external_id_list)
    {
        external_id_arr.append(var);
    }
    object["external_id"] = external_id_arr;








    std::list<std::string> fn_list = getFn();
    bourne::json fn_arr = bourne::json::array();

    for(auto& var : fn_list)
    {
        fn_arr.append(var);
    }
    object["fn"] = fn_arr;








    std::list<std::string> ge_list = getGe();
    bourne::json ge_arr = bourne::json::array();

    for(auto& var : ge_list)
    {
        ge_arr.append(var);
    }
    object["ge"] = ge_arr;








    std::list<std::string> hashed_maids_list = getHashedMaids();
    bourne::json hashed_maids_arr = bourne::json::array();

    for(auto& var : hashed_maids_list)
    {
        hashed_maids_arr.append(var);
    }
    object["hashed_maids"] = hashed_maids_arr;








    std::list<std::string> ln_list = getLn();
    bourne::json ln_arr = bourne::json::array();

    for(auto& var : ln_list)
    {
        ln_arr.append(var);
    }
    object["ln"] = ln_arr;









    object["partner_id"] = getPartnerId();





    std::list<std::string> ph_list = getPh();
    bourne::json ph_arr = bourne::json::array();

    for(auto& var : ph_list)
    {
        ph_arr.append(var);
    }
    object["ph"] = ph_arr;








    std::list<std::string> st_list = getSt();
    bourne::json st_arr = bourne::json::array();

    for(auto& var : st_list)
    {
        st_arr.append(var);
    }
    object["st"] = st_arr;








    std::list<std::string> zp_list = getZp();
    bourne::json zp_arr = bourne::json::array();

    for(auto& var : zp_list)
    {
        zp_arr.append(var);
    }
    object["zp"] = zp_arr;






    return object;

}

std::string
ConversionEventsUserDataProperties::getClickId()
{
	return click_id;
}

void
ConversionEventsUserDataProperties::setClickId(std::string click_id)
{
	this->click_id = click_id;
}

std::string
ConversionEventsUserDataProperties::getClientIpAddress()
{
	return client_ip_address;
}

void
ConversionEventsUserDataProperties::setClientIpAddress(std::string client_ip_address)
{
	this->client_ip_address = client_ip_address;
}

std::string
ConversionEventsUserDataProperties::getClientUserAgent()
{
	return client_user_agent;
}

void
ConversionEventsUserDataProperties::setClientUserAgent(std::string client_user_agent)
{
	this->client_user_agent = client_user_agent;
}

std::list<std::string>
ConversionEventsUserDataProperties::getCountry()
{
	return country;
}

void
ConversionEventsUserDataProperties::setCountry(std::list<std::string> country)
{
	this->country = country;
}

std::list<std::string>
ConversionEventsUserDataProperties::getCt()
{
	return ct;
}

void
ConversionEventsUserDataProperties::setCt(std::list<std::string> ct)
{
	this->ct = ct;
}

std::list<std::string>
ConversionEventsUserDataProperties::getDb()
{
	return db;
}

void
ConversionEventsUserDataProperties::setDb(std::list<std::string> db)
{
	this->db = db;
}

std::list<std::string>
ConversionEventsUserDataProperties::getEm()
{
	return em;
}

void
ConversionEventsUserDataProperties::setEm(std::list<std::string> em)
{
	this->em = em;
}

std::list<std::string>
ConversionEventsUserDataProperties::getExternalId()
{
	return external_id;
}

void
ConversionEventsUserDataProperties::setExternalId(std::list<std::string> external_id)
{
	this->external_id = external_id;
}

std::list<std::string>
ConversionEventsUserDataProperties::getFn()
{
	return fn;
}

void
ConversionEventsUserDataProperties::setFn(std::list<std::string> fn)
{
	this->fn = fn;
}

std::list<std::string>
ConversionEventsUserDataProperties::getGe()
{
	return ge;
}

void
ConversionEventsUserDataProperties::setGe(std::list<std::string> ge)
{
	this->ge = ge;
}

std::list<std::string>
ConversionEventsUserDataProperties::getHashedMaids()
{
	return hashed_maids;
}

void
ConversionEventsUserDataProperties::setHashedMaids(std::list<std::string> hashed_maids)
{
	this->hashed_maids = hashed_maids;
}

std::list<std::string>
ConversionEventsUserDataProperties::getLn()
{
	return ln;
}

void
ConversionEventsUserDataProperties::setLn(std::list<std::string> ln)
{
	this->ln = ln;
}

std::string
ConversionEventsUserDataProperties::getPartnerId()
{
	return partner_id;
}

void
ConversionEventsUserDataProperties::setPartnerId(std::string partner_id)
{
	this->partner_id = partner_id;
}

std::list<std::string>
ConversionEventsUserDataProperties::getPh()
{
	return ph;
}

void
ConversionEventsUserDataProperties::setPh(std::list<std::string> ph)
{
	this->ph = ph;
}

std::list<std::string>
ConversionEventsUserDataProperties::getSt()
{
	return st;
}

void
ConversionEventsUserDataProperties::setSt(std::list<std::string> st)
{
	this->st = st;
}

std::list<std::string>
ConversionEventsUserDataProperties::getZp()
{
	return zp;
}

void
ConversionEventsUserDataProperties::setZp(std::list<std::string> zp)
{
	this->zp = zp;
}



