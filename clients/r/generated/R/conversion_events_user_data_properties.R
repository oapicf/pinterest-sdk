#' Create a new ConversionEventsUserDataProperties
#'
#' @description
#' ConversionEventsUserDataProperties Class
#'
#' @docType class
#' @title ConversionEventsUserDataProperties
#' @description ConversionEventsUserDataProperties Class
#' @format An \code{R6Class} generator object
#' @field click_id The unique identifier stored in _epik cookie on your domain or &epik= query parameter in the URL. We highly recommend this on checkout events at least. It may improve reporting performance such as ROAS/CPA. character [optional]
#' @field client_ip_address The user's IP address, which can be either in IPv4 or IPv6 format. Used for matching. We highly recommend this for all events. It may improve reporting performance such as ROAS/CPA. character [optional]
#' @field client_user_agent The user agent string of the user's web browser. We highly recommend this for all events. It may improve reporting performance such as ROAS/CPA. character [optional]
#' @field country Sha256 hashes of two-character ISO-3166 country code indicating the user's country, in lowercase. The string should be in the UTF-8 format. list(character) [optional]
#' @field ct Sha256 hashes of user's city, in lowercase, and without spaces or punctuation. User residency city (mostly billing). The string should be in the UTF-8 format. list(character) [optional]
#' @field db Sha256 hashes of user's date of birthday, given as year, month, and day. The string should be in the UTF-8 format. list(character) [optional]
#' @field em Sha256 hashes of lowercase version of user's email addresses. Used for matching. We highly recommend this on checkout events at least. It may improve reporting performance such as ROAS/CPA. The string should be in the UTF-8 format. list(character) [optional]
#' @field external_id Sha256 hashes of the unique id from the advertiser that identifies a user in their space, e.g. user id, loyalty id, etc. We highly recommend this on all events. It may improve reporting performance such as ROAS/CPA. The string should be in the UTF-8 format. list(character) [optional]
#' @field fn Sha256 hashes of user's first name, in lowercase. We highly recommend this on checkout events at least. It may improve reporting performance such as ROAS/CPA. The string should be in the UTF-8 format. list(character) [optional]
#' @field ge Sha256 hashes of user's gender, in lowercase. Either \"f\" or \"m\" or \"n\" for non-binary gender. The string should be in the UTF-8 format. list(character) [optional]
#' @field hashed_maids Sha256 hashes of user's \"Google Advertising IDs\" (GAIDs) or \"Apple's Identifier for Advertisers\" (IDFAs). Used for matching. We highly recommend this on checkout events at least. It may improve reporting performance such as ROAS/CPA. The string should be in the UTF-8 format. list(character) [optional]
#' @field ln Sha256 hashes of user's last name, in lowercase. We highly recommend this on checkout events at least. It may improve reporting performance such as ROAS/CPA. The string should be in the UTF-8 format. list(character) [optional]
#' @field partner_id A unique identifier of visitors' information defined by third party partners. e.g RampID character [optional]
#' @field ph Sha256 hashes of user's phone numbers, only digits with country code, area code, and number. Remove any symbols, letters, spaces and leading zeros. We highly recommend this on checkout events at least. It may improve reporting performance such as ROAS/CPA. The string should be in the UTF-8 format. list(character) [optional]
#' @field st Sha256 hashes of user's state, given as a two-letter code in lowercase. User residency state (mostly billing). The string should be in the UTF-8 format. list(character) [optional]
#' @field zp Sha256 hashes of user's zipcode, only digits. User residency zipcode (mostly billing). The string should be in the UTF-8 format. list(character) [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
ConversionEventsUserDataProperties <- R6::R6Class(
  "ConversionEventsUserDataProperties",
  public = list(
    `click_id` = NULL,
    `client_ip_address` = NULL,
    `client_user_agent` = NULL,
    `country` = NULL,
    `ct` = NULL,
    `db` = NULL,
    `em` = NULL,
    `external_id` = NULL,
    `fn` = NULL,
    `ge` = NULL,
    `hashed_maids` = NULL,
    `ln` = NULL,
    `partner_id` = NULL,
    `ph` = NULL,
    `st` = NULL,
    `zp` = NULL,

    #' @description
    #' Initialize a new ConversionEventsUserDataProperties class.
    #'
    #' @param click_id The unique identifier stored in _epik cookie on your domain or &epik= query parameter in the URL. We highly recommend this on checkout events at least. It may improve reporting performance such as ROAS/CPA.
    #' @param client_ip_address The user's IP address, which can be either in IPv4 or IPv6 format. Used for matching. We highly recommend this for all events. It may improve reporting performance such as ROAS/CPA.
    #' @param client_user_agent The user agent string of the user's web browser. We highly recommend this for all events. It may improve reporting performance such as ROAS/CPA.
    #' @param country Sha256 hashes of two-character ISO-3166 country code indicating the user's country, in lowercase. The string should be in the UTF-8 format.
    #' @param ct Sha256 hashes of user's city, in lowercase, and without spaces or punctuation. User residency city (mostly billing). The string should be in the UTF-8 format.
    #' @param db Sha256 hashes of user's date of birthday, given as year, month, and day. The string should be in the UTF-8 format.
    #' @param em Sha256 hashes of lowercase version of user's email addresses. Used for matching. We highly recommend this on checkout events at least. It may improve reporting performance such as ROAS/CPA. The string should be in the UTF-8 format.
    #' @param external_id Sha256 hashes of the unique id from the advertiser that identifies a user in their space, e.g. user id, loyalty id, etc. We highly recommend this on all events. It may improve reporting performance such as ROAS/CPA. The string should be in the UTF-8 format.
    #' @param fn Sha256 hashes of user's first name, in lowercase. We highly recommend this on checkout events at least. It may improve reporting performance such as ROAS/CPA. The string should be in the UTF-8 format.
    #' @param ge Sha256 hashes of user's gender, in lowercase. Either \"f\" or \"m\" or \"n\" for non-binary gender. The string should be in the UTF-8 format.
    #' @param hashed_maids Sha256 hashes of user's \"Google Advertising IDs\" (GAIDs) or \"Apple's Identifier for Advertisers\" (IDFAs). Used for matching. We highly recommend this on checkout events at least. It may improve reporting performance such as ROAS/CPA. The string should be in the UTF-8 format.
    #' @param ln Sha256 hashes of user's last name, in lowercase. We highly recommend this on checkout events at least. It may improve reporting performance such as ROAS/CPA. The string should be in the UTF-8 format.
    #' @param partner_id A unique identifier of visitors' information defined by third party partners. e.g RampID
    #' @param ph Sha256 hashes of user's phone numbers, only digits with country code, area code, and number. Remove any symbols, letters, spaces and leading zeros. We highly recommend this on checkout events at least. It may improve reporting performance such as ROAS/CPA. The string should be in the UTF-8 format.
    #' @param st Sha256 hashes of user's state, given as a two-letter code in lowercase. User residency state (mostly billing). The string should be in the UTF-8 format.
    #' @param zp Sha256 hashes of user's zipcode, only digits. User residency zipcode (mostly billing). The string should be in the UTF-8 format.
    #' @param ... Other optional arguments.
    initialize = function(`click_id` = NULL, `client_ip_address` = NULL, `client_user_agent` = NULL, `country` = NULL, `ct` = NULL, `db` = NULL, `em` = NULL, `external_id` = NULL, `fn` = NULL, `ge` = NULL, `hashed_maids` = NULL, `ln` = NULL, `partner_id` = NULL, `ph` = NULL, `st` = NULL, `zp` = NULL, ...) {
      if (!is.null(`click_id`)) {
        if (!(is.character(`click_id`) && length(`click_id`) == 1)) {
          stop(paste("Error! Invalid data for `click_id`. Must be a string:", `click_id`))
        }
        self$`click_id` <- `click_id`
      }
      if (!is.null(`client_ip_address`)) {
        if (!(is.character(`client_ip_address`) && length(`client_ip_address`) == 1)) {
          stop(paste("Error! Invalid data for `client_ip_address`. Must be a string:", `client_ip_address`))
        }
        self$`client_ip_address` <- `client_ip_address`
      }
      if (!is.null(`client_user_agent`)) {
        if (!(is.character(`client_user_agent`) && length(`client_user_agent`) == 1)) {
          stop(paste("Error! Invalid data for `client_user_agent`. Must be a string:", `client_user_agent`))
        }
        self$`client_user_agent` <- `client_user_agent`
      }
      if (!is.null(`country`)) {
        stopifnot(is.vector(`country`), length(`country`) != 0)
        sapply(`country`, function(x) stopifnot(is.character(x)))
        self$`country` <- `country`
      }
      if (!is.null(`ct`)) {
        stopifnot(is.vector(`ct`), length(`ct`) != 0)
        sapply(`ct`, function(x) stopifnot(is.character(x)))
        self$`ct` <- `ct`
      }
      if (!is.null(`db`)) {
        stopifnot(is.vector(`db`), length(`db`) != 0)
        sapply(`db`, function(x) stopifnot(is.character(x)))
        self$`db` <- `db`
      }
      if (!is.null(`em`)) {
        stopifnot(is.vector(`em`), length(`em`) != 0)
        sapply(`em`, function(x) stopifnot(is.character(x)))
        self$`em` <- `em`
      }
      if (!is.null(`external_id`)) {
        stopifnot(is.vector(`external_id`), length(`external_id`) != 0)
        sapply(`external_id`, function(x) stopifnot(is.character(x)))
        self$`external_id` <- `external_id`
      }
      if (!is.null(`fn`)) {
        stopifnot(is.vector(`fn`), length(`fn`) != 0)
        sapply(`fn`, function(x) stopifnot(is.character(x)))
        self$`fn` <- `fn`
      }
      if (!is.null(`ge`)) {
        stopifnot(is.vector(`ge`), length(`ge`) != 0)
        sapply(`ge`, function(x) stopifnot(is.character(x)))
        self$`ge` <- `ge`
      }
      if (!is.null(`hashed_maids`)) {
        stopifnot(is.vector(`hashed_maids`), length(`hashed_maids`) != 0)
        sapply(`hashed_maids`, function(x) stopifnot(is.character(x)))
        self$`hashed_maids` <- `hashed_maids`
      }
      if (!is.null(`ln`)) {
        stopifnot(is.vector(`ln`), length(`ln`) != 0)
        sapply(`ln`, function(x) stopifnot(is.character(x)))
        self$`ln` <- `ln`
      }
      if (!is.null(`partner_id`)) {
        if (!(is.character(`partner_id`) && length(`partner_id`) == 1)) {
          stop(paste("Error! Invalid data for `partner_id`. Must be a string:", `partner_id`))
        }
        self$`partner_id` <- `partner_id`
      }
      if (!is.null(`ph`)) {
        stopifnot(is.vector(`ph`), length(`ph`) != 0)
        sapply(`ph`, function(x) stopifnot(is.character(x)))
        self$`ph` <- `ph`
      }
      if (!is.null(`st`)) {
        stopifnot(is.vector(`st`), length(`st`) != 0)
        sapply(`st`, function(x) stopifnot(is.character(x)))
        self$`st` <- `st`
      }
      if (!is.null(`zp`)) {
        stopifnot(is.vector(`zp`), length(`zp`) != 0)
        sapply(`zp`, function(x) stopifnot(is.character(x)))
        self$`zp` <- `zp`
      }
    },

    #' @description
    #' Convert to an R object. This method is deprecated. Use `toSimpleType()` instead.
    toJSON = function() {
      .Deprecated(new = "toSimpleType", msg = "Use the '$toSimpleType()' method instead since that is more clearly named. Use '$toJSONString()' to get a JSON string")
      return(self$toSimpleType())
    },

    #' @description
    #' Convert to a List
    #'
    #' Convert the R6 object to a list to work more easily with other tooling.
    #'
    #' @return ConversionEventsUserDataProperties as a base R list.
    #' @examples
    #' # convert array of ConversionEventsUserDataProperties (x) to a data frame
    #' \dontrun{
    #' library(purrr)
    #' library(tibble)
    #' df <- x |> map(\(y)y$toList()) |> map(as_tibble) |> list_rbind()
    #' df
    #' }
    toList = function() {
      return(self$toSimpleType())
    },

    #' @description
    #' Convert ConversionEventsUserDataProperties to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      ConversionEventsUserDataPropertiesObject <- list()
      if (!is.null(self$`click_id`)) {
        ConversionEventsUserDataPropertiesObject[["click_id"]] <-
          self$`click_id`
      }
      if (!is.null(self$`client_ip_address`)) {
        ConversionEventsUserDataPropertiesObject[["client_ip_address"]] <-
          self$`client_ip_address`
      }
      if (!is.null(self$`client_user_agent`)) {
        ConversionEventsUserDataPropertiesObject[["client_user_agent"]] <-
          self$`client_user_agent`
      }
      if (!is.null(self$`country`)) {
        ConversionEventsUserDataPropertiesObject[["country"]] <-
          self$`country`
      }
      if (!is.null(self$`ct`)) {
        ConversionEventsUserDataPropertiesObject[["ct"]] <-
          self$`ct`
      }
      if (!is.null(self$`db`)) {
        ConversionEventsUserDataPropertiesObject[["db"]] <-
          self$`db`
      }
      if (!is.null(self$`em`)) {
        ConversionEventsUserDataPropertiesObject[["em"]] <-
          self$`em`
      }
      if (!is.null(self$`external_id`)) {
        ConversionEventsUserDataPropertiesObject[["external_id"]] <-
          self$`external_id`
      }
      if (!is.null(self$`fn`)) {
        ConversionEventsUserDataPropertiesObject[["fn"]] <-
          self$`fn`
      }
      if (!is.null(self$`ge`)) {
        ConversionEventsUserDataPropertiesObject[["ge"]] <-
          self$`ge`
      }
      if (!is.null(self$`hashed_maids`)) {
        ConversionEventsUserDataPropertiesObject[["hashed_maids"]] <-
          self$`hashed_maids`
      }
      if (!is.null(self$`ln`)) {
        ConversionEventsUserDataPropertiesObject[["ln"]] <-
          self$`ln`
      }
      if (!is.null(self$`partner_id`)) {
        ConversionEventsUserDataPropertiesObject[["partner_id"]] <-
          self$`partner_id`
      }
      if (!is.null(self$`ph`)) {
        ConversionEventsUserDataPropertiesObject[["ph"]] <-
          self$`ph`
      }
      if (!is.null(self$`st`)) {
        ConversionEventsUserDataPropertiesObject[["st"]] <-
          self$`st`
      }
      if (!is.null(self$`zp`)) {
        ConversionEventsUserDataPropertiesObject[["zp"]] <-
          self$`zp`
      }
      return(ConversionEventsUserDataPropertiesObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of ConversionEventsUserDataProperties
    #'
    #' @param input_json the JSON input
    #' @return the instance of ConversionEventsUserDataProperties
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`click_id`)) {
        self$`click_id` <- this_object$`click_id`
      }
      if (!is.null(this_object$`client_ip_address`)) {
        self$`client_ip_address` <- this_object$`client_ip_address`
      }
      if (!is.null(this_object$`client_user_agent`)) {
        self$`client_user_agent` <- this_object$`client_user_agent`
      }
      if (!is.null(this_object$`country`)) {
        self$`country` <- ApiClient$new()$deserializeObj(this_object$`country`, "array[character]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`ct`)) {
        self$`ct` <- ApiClient$new()$deserializeObj(this_object$`ct`, "array[character]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`db`)) {
        self$`db` <- ApiClient$new()$deserializeObj(this_object$`db`, "array[character]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`em`)) {
        self$`em` <- ApiClient$new()$deserializeObj(this_object$`em`, "array[character]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`external_id`)) {
        self$`external_id` <- ApiClient$new()$deserializeObj(this_object$`external_id`, "array[character]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`fn`)) {
        self$`fn` <- ApiClient$new()$deserializeObj(this_object$`fn`, "array[character]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`ge`)) {
        self$`ge` <- ApiClient$new()$deserializeObj(this_object$`ge`, "array[character]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`hashed_maids`)) {
        self$`hashed_maids` <- ApiClient$new()$deserializeObj(this_object$`hashed_maids`, "array[character]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`ln`)) {
        self$`ln` <- ApiClient$new()$deserializeObj(this_object$`ln`, "array[character]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`partner_id`)) {
        self$`partner_id` <- this_object$`partner_id`
      }
      if (!is.null(this_object$`ph`)) {
        self$`ph` <- ApiClient$new()$deserializeObj(this_object$`ph`, "array[character]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`st`)) {
        self$`st` <- ApiClient$new()$deserializeObj(this_object$`st`, "array[character]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`zp`)) {
        self$`zp` <- ApiClient$new()$deserializeObj(this_object$`zp`, "array[character]", loadNamespace("openapi"))
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return ConversionEventsUserDataProperties in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of ConversionEventsUserDataProperties
    #'
    #' @param input_json the JSON input
    #' @return the instance of ConversionEventsUserDataProperties
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`click_id` <- this_object$`click_id`
      self$`client_ip_address` <- this_object$`client_ip_address`
      self$`client_user_agent` <- this_object$`client_user_agent`
      self$`country` <- ApiClient$new()$deserializeObj(this_object$`country`, "array[character]", loadNamespace("openapi"))
      self$`ct` <- ApiClient$new()$deserializeObj(this_object$`ct`, "array[character]", loadNamespace("openapi"))
      self$`db` <- ApiClient$new()$deserializeObj(this_object$`db`, "array[character]", loadNamespace("openapi"))
      self$`em` <- ApiClient$new()$deserializeObj(this_object$`em`, "array[character]", loadNamespace("openapi"))
      self$`external_id` <- ApiClient$new()$deserializeObj(this_object$`external_id`, "array[character]", loadNamespace("openapi"))
      self$`fn` <- ApiClient$new()$deserializeObj(this_object$`fn`, "array[character]", loadNamespace("openapi"))
      self$`ge` <- ApiClient$new()$deserializeObj(this_object$`ge`, "array[character]", loadNamespace("openapi"))
      self$`hashed_maids` <- ApiClient$new()$deserializeObj(this_object$`hashed_maids`, "array[character]", loadNamespace("openapi"))
      self$`ln` <- ApiClient$new()$deserializeObj(this_object$`ln`, "array[character]", loadNamespace("openapi"))
      self$`partner_id` <- this_object$`partner_id`
      self$`ph` <- ApiClient$new()$deserializeObj(this_object$`ph`, "array[character]", loadNamespace("openapi"))
      self$`st` <- ApiClient$new()$deserializeObj(this_object$`st`, "array[character]", loadNamespace("openapi"))
      self$`zp` <- ApiClient$new()$deserializeObj(this_object$`zp`, "array[character]", loadNamespace("openapi"))
      self
    },

    #' @description
    #' Validate JSON input with respect to ConversionEventsUserDataProperties and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of ConversionEventsUserDataProperties
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      TRUE
    },

    #' @description
    #' Return a list of invalid fields (if any).
    #'
    #' @return A list of invalid fields (if any).
    getInvalidFields = function() {
      invalid_fields <- list()
      invalid_fields
    },

    #' @description
    #' Print the object
    print = function() {
      print(jsonlite::prettify(self$toJSONString()))
      invisible(self)
    }
  ),
  # Lock the class to prevent modifications to the method or field
  lock_class = TRUE
)
## Uncomment below to unlock the class to allow modifications of the method or field
# ConversionEventsUserDataProperties$unlock()
#
## Below is an example to define the print function
# ConversionEventsUserDataProperties$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# ConversionEventsUserDataProperties$lock()

