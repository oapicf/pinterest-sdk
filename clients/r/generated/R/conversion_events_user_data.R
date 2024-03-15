#' Create a new ConversionEventsUserData
#'
#' @description
#' Object containing customer information data. Note, It is required at least one of 1) em, 2) hashed_maids or 3) pair client_ip_address + client_user_agent.
#'
#' @docType class
#' @title ConversionEventsUserData
#' @description ConversionEventsUserData Class
#' @format An \code{R6Class} generator object
#' @field ph Sha256 hashes of user's phone numbers, only digits with country code, area code, and number. Remove any symbols, letters, spaces and leading zeros. We highly recommend this on checkout events at least. It may improve reporting performance such as ROAS/CPA. list(character) [optional]
#' @field ge Sha256 hashes of user's gender, in lowercase. Either \"f\" or \"m\" or \"n\" for non-binary gender. list(character) [optional]
#' @field db Sha256 hashes of user's date of birthday, given as year, month, and day. list(character) [optional]
#' @field ln Sha256 hashes of user's last name, in lowercase. We highly recommend this on checkout events at least. It may improve reporting performance such as ROAS/CPA. list(character) [optional]
#' @field fn Sha256 hashes of user's first name, in lowercase. We highly recommend this on checkout events at least. It may improve reporting performance such as ROAS/CPA. list(character) [optional]
#' @field ct Sha256 hashes of user's city, in lowercase, and without spaces or punctuation. User residency city (mostly billing). list(character) [optional]
#' @field st Sha256 hashes of user's state, given as a two-letter code in lowercase. User residency state (mostly billing). list(character) [optional]
#' @field zp Sha256 hashes of user's zipcode, only digits. User residency zipcode (mostly billing). list(character) [optional]
#' @field country Sha256 hashes of two-character ISO-3166 country code indicating the user's country, in lowercase. list(character) [optional]
#' @field external_id Sha256 hashes of the unique id from the advertiser that identifies a user in their space, e.g. user id, loyalty id, etc. We highly recommend this on all events. It may improve reporting performance such as ROAS/CPA. list(character) [optional]
#' @field click_id The unique identifier stored in _epik cookie on your domain or &epik= query parameter in the URL. We highly recommend this on checkout events at least. It may improve reporting performance such as ROAS/CPA. character [optional]
#' @field partner_id A unique identifier of visitors' information defined by third party partners. e.g RampID character [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
ConversionEventsUserData <- R6::R6Class(
  "ConversionEventsUserData",
  public = list(
    `ph` = NULL,
    `ge` = NULL,
    `db` = NULL,
    `ln` = NULL,
    `fn` = NULL,
    `ct` = NULL,
    `st` = NULL,
    `zp` = NULL,
    `country` = NULL,
    `external_id` = NULL,
    `click_id` = NULL,
    `partner_id` = NULL,
    #' Initialize a new ConversionEventsUserData class.
    #'
    #' @description
    #' Initialize a new ConversionEventsUserData class.
    #'
    #' @param ph Sha256 hashes of user's phone numbers, only digits with country code, area code, and number. Remove any symbols, letters, spaces and leading zeros. We highly recommend this on checkout events at least. It may improve reporting performance such as ROAS/CPA.
    #' @param ge Sha256 hashes of user's gender, in lowercase. Either \"f\" or \"m\" or \"n\" for non-binary gender.
    #' @param db Sha256 hashes of user's date of birthday, given as year, month, and day.
    #' @param ln Sha256 hashes of user's last name, in lowercase. We highly recommend this on checkout events at least. It may improve reporting performance such as ROAS/CPA.
    #' @param fn Sha256 hashes of user's first name, in lowercase. We highly recommend this on checkout events at least. It may improve reporting performance such as ROAS/CPA.
    #' @param ct Sha256 hashes of user's city, in lowercase, and without spaces or punctuation. User residency city (mostly billing).
    #' @param st Sha256 hashes of user's state, given as a two-letter code in lowercase. User residency state (mostly billing).
    #' @param zp Sha256 hashes of user's zipcode, only digits. User residency zipcode (mostly billing).
    #' @param country Sha256 hashes of two-character ISO-3166 country code indicating the user's country, in lowercase.
    #' @param external_id Sha256 hashes of the unique id from the advertiser that identifies a user in their space, e.g. user id, loyalty id, etc. We highly recommend this on all events. It may improve reporting performance such as ROAS/CPA.
    #' @param click_id The unique identifier stored in _epik cookie on your domain or &epik= query parameter in the URL. We highly recommend this on checkout events at least. It may improve reporting performance such as ROAS/CPA.
    #' @param partner_id A unique identifier of visitors' information defined by third party partners. e.g RampID
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`ph` = NULL, `ge` = NULL, `db` = NULL, `ln` = NULL, `fn` = NULL, `ct` = NULL, `st` = NULL, `zp` = NULL, `country` = NULL, `external_id` = NULL, `click_id` = NULL, `partner_id` = NULL, ...) {
      if (!is.null(`ph`)) {
        stopifnot(is.vector(`ph`), length(`ph`) != 0)
        sapply(`ph`, function(x) stopifnot(is.character(x)))
        self$`ph` <- `ph`
      }
      if (!is.null(`ge`)) {
        stopifnot(is.vector(`ge`), length(`ge`) != 0)
        sapply(`ge`, function(x) stopifnot(is.character(x)))
        self$`ge` <- `ge`
      }
      if (!is.null(`db`)) {
        stopifnot(is.vector(`db`), length(`db`) != 0)
        sapply(`db`, function(x) stopifnot(is.character(x)))
        self$`db` <- `db`
      }
      if (!is.null(`ln`)) {
        stopifnot(is.vector(`ln`), length(`ln`) != 0)
        sapply(`ln`, function(x) stopifnot(is.character(x)))
        self$`ln` <- `ln`
      }
      if (!is.null(`fn`)) {
        stopifnot(is.vector(`fn`), length(`fn`) != 0)
        sapply(`fn`, function(x) stopifnot(is.character(x)))
        self$`fn` <- `fn`
      }
      if (!is.null(`ct`)) {
        stopifnot(is.vector(`ct`), length(`ct`) != 0)
        sapply(`ct`, function(x) stopifnot(is.character(x)))
        self$`ct` <- `ct`
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
      if (!is.null(`country`)) {
        stopifnot(is.vector(`country`), length(`country`) != 0)
        sapply(`country`, function(x) stopifnot(is.character(x)))
        self$`country` <- `country`
      }
      if (!is.null(`external_id`)) {
        stopifnot(is.vector(`external_id`), length(`external_id`) != 0)
        sapply(`external_id`, function(x) stopifnot(is.character(x)))
        self$`external_id` <- `external_id`
      }
      if (!is.null(`click_id`)) {
        if (!(is.character(`click_id`) && length(`click_id`) == 1)) {
          stop(paste("Error! Invalid data for `click_id`. Must be a string:", `click_id`))
        }
        self$`click_id` <- `click_id`
      }
      if (!is.null(`partner_id`)) {
        if (!(is.character(`partner_id`) && length(`partner_id`) == 1)) {
          stop(paste("Error! Invalid data for `partner_id`. Must be a string:", `partner_id`))
        }
        self$`partner_id` <- `partner_id`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return ConversionEventsUserData in JSON format
    #' @export
    toJSON = function() {
      ConversionEventsUserDataObject <- list()
      if (!is.null(self$`ph`)) {
        ConversionEventsUserDataObject[["ph"]] <-
          self$`ph`
      }
      if (!is.null(self$`ge`)) {
        ConversionEventsUserDataObject[["ge"]] <-
          self$`ge`
      }
      if (!is.null(self$`db`)) {
        ConversionEventsUserDataObject[["db"]] <-
          self$`db`
      }
      if (!is.null(self$`ln`)) {
        ConversionEventsUserDataObject[["ln"]] <-
          self$`ln`
      }
      if (!is.null(self$`fn`)) {
        ConversionEventsUserDataObject[["fn"]] <-
          self$`fn`
      }
      if (!is.null(self$`ct`)) {
        ConversionEventsUserDataObject[["ct"]] <-
          self$`ct`
      }
      if (!is.null(self$`st`)) {
        ConversionEventsUserDataObject[["st"]] <-
          self$`st`
      }
      if (!is.null(self$`zp`)) {
        ConversionEventsUserDataObject[["zp"]] <-
          self$`zp`
      }
      if (!is.null(self$`country`)) {
        ConversionEventsUserDataObject[["country"]] <-
          self$`country`
      }
      if (!is.null(self$`external_id`)) {
        ConversionEventsUserDataObject[["external_id"]] <-
          self$`external_id`
      }
      if (!is.null(self$`click_id`)) {
        ConversionEventsUserDataObject[["click_id"]] <-
          self$`click_id`
      }
      if (!is.null(self$`partner_id`)) {
        ConversionEventsUserDataObject[["partner_id"]] <-
          self$`partner_id`
      }
      ConversionEventsUserDataObject
    },
    #' Deserialize JSON string into an instance of ConversionEventsUserData
    #'
    #' @description
    #' Deserialize JSON string into an instance of ConversionEventsUserData
    #'
    #' @param input_json the JSON input
    #' @return the instance of ConversionEventsUserData
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`ph`)) {
        self$`ph` <- ApiClient$new()$deserializeObj(this_object$`ph`, "array[character]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`ge`)) {
        self$`ge` <- ApiClient$new()$deserializeObj(this_object$`ge`, "array[character]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`db`)) {
        self$`db` <- ApiClient$new()$deserializeObj(this_object$`db`, "array[character]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`ln`)) {
        self$`ln` <- ApiClient$new()$deserializeObj(this_object$`ln`, "array[character]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`fn`)) {
        self$`fn` <- ApiClient$new()$deserializeObj(this_object$`fn`, "array[character]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`ct`)) {
        self$`ct` <- ApiClient$new()$deserializeObj(this_object$`ct`, "array[character]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`st`)) {
        self$`st` <- ApiClient$new()$deserializeObj(this_object$`st`, "array[character]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`zp`)) {
        self$`zp` <- ApiClient$new()$deserializeObj(this_object$`zp`, "array[character]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`country`)) {
        self$`country` <- ApiClient$new()$deserializeObj(this_object$`country`, "array[character]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`external_id`)) {
        self$`external_id` <- ApiClient$new()$deserializeObj(this_object$`external_id`, "array[character]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`click_id`)) {
        self$`click_id` <- this_object$`click_id`
      }
      if (!is.null(this_object$`partner_id`)) {
        self$`partner_id` <- this_object$`partner_id`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return ConversionEventsUserData in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`ph`)) {
          sprintf(
          '"ph":
             [%s]
          ',
          paste(unlist(lapply(self$`ph`, function(x) paste0('"', x, '"'))), collapse = ",")
          )
        },
        if (!is.null(self$`ge`)) {
          sprintf(
          '"ge":
             [%s]
          ',
          paste(unlist(lapply(self$`ge`, function(x) paste0('"', x, '"'))), collapse = ",")
          )
        },
        if (!is.null(self$`db`)) {
          sprintf(
          '"db":
             [%s]
          ',
          paste(unlist(lapply(self$`db`, function(x) paste0('"', x, '"'))), collapse = ",")
          )
        },
        if (!is.null(self$`ln`)) {
          sprintf(
          '"ln":
             [%s]
          ',
          paste(unlist(lapply(self$`ln`, function(x) paste0('"', x, '"'))), collapse = ",")
          )
        },
        if (!is.null(self$`fn`)) {
          sprintf(
          '"fn":
             [%s]
          ',
          paste(unlist(lapply(self$`fn`, function(x) paste0('"', x, '"'))), collapse = ",")
          )
        },
        if (!is.null(self$`ct`)) {
          sprintf(
          '"ct":
             [%s]
          ',
          paste(unlist(lapply(self$`ct`, function(x) paste0('"', x, '"'))), collapse = ",")
          )
        },
        if (!is.null(self$`st`)) {
          sprintf(
          '"st":
             [%s]
          ',
          paste(unlist(lapply(self$`st`, function(x) paste0('"', x, '"'))), collapse = ",")
          )
        },
        if (!is.null(self$`zp`)) {
          sprintf(
          '"zp":
             [%s]
          ',
          paste(unlist(lapply(self$`zp`, function(x) paste0('"', x, '"'))), collapse = ",")
          )
        },
        if (!is.null(self$`country`)) {
          sprintf(
          '"country":
             [%s]
          ',
          paste(unlist(lapply(self$`country`, function(x) paste0('"', x, '"'))), collapse = ",")
          )
        },
        if (!is.null(self$`external_id`)) {
          sprintf(
          '"external_id":
             [%s]
          ',
          paste(unlist(lapply(self$`external_id`, function(x) paste0('"', x, '"'))), collapse = ",")
          )
        },
        if (!is.null(self$`click_id`)) {
          sprintf(
          '"click_id":
            "%s"
                    ',
          self$`click_id`
          )
        },
        if (!is.null(self$`partner_id`)) {
          sprintf(
          '"partner_id":
            "%s"
                    ',
          self$`partner_id`
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of ConversionEventsUserData
    #'
    #' @description
    #' Deserialize JSON string into an instance of ConversionEventsUserData
    #'
    #' @param input_json the JSON input
    #' @return the instance of ConversionEventsUserData
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`ph` <- ApiClient$new()$deserializeObj(this_object$`ph`, "array[character]", loadNamespace("openapi"))
      self$`ge` <- ApiClient$new()$deserializeObj(this_object$`ge`, "array[character]", loadNamespace("openapi"))
      self$`db` <- ApiClient$new()$deserializeObj(this_object$`db`, "array[character]", loadNamespace("openapi"))
      self$`ln` <- ApiClient$new()$deserializeObj(this_object$`ln`, "array[character]", loadNamespace("openapi"))
      self$`fn` <- ApiClient$new()$deserializeObj(this_object$`fn`, "array[character]", loadNamespace("openapi"))
      self$`ct` <- ApiClient$new()$deserializeObj(this_object$`ct`, "array[character]", loadNamespace("openapi"))
      self$`st` <- ApiClient$new()$deserializeObj(this_object$`st`, "array[character]", loadNamespace("openapi"))
      self$`zp` <- ApiClient$new()$deserializeObj(this_object$`zp`, "array[character]", loadNamespace("openapi"))
      self$`country` <- ApiClient$new()$deserializeObj(this_object$`country`, "array[character]", loadNamespace("openapi"))
      self$`external_id` <- ApiClient$new()$deserializeObj(this_object$`external_id`, "array[character]", loadNamespace("openapi"))
      self$`click_id` <- this_object$`click_id`
      self$`partner_id` <- this_object$`partner_id`
      self
    },
    #' Validate JSON input with respect to ConversionEventsUserData
    #'
    #' @description
    #' Validate JSON input with respect to ConversionEventsUserData and throw an exception if invalid
    #'
    #' @param input the JSON input
    #' @export
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of ConversionEventsUserData
    #' @export
    toString = function() {
      self$toJSONString()
    },
    #' Return true if the values in all fields are valid.
    #'
    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    #' @export
    isValid = function() {
      TRUE
    },
    #' Return a list of invalid fields (if any).
    #'
    #' @description
    #' Return a list of invalid fields (if any).
    #'
    #' @return A list of invalid fields (if any).
    #' @export
    getInvalidFields = function() {
      invalid_fields <- list()
      invalid_fields
    },
    #' Print the object
    #'
    #' @description
    #' Print the object
    #'
    #' @export
    print = function() {
      print(jsonlite::prettify(self$toJSONString()))
      invisible(self)
    }
  ),
  # Lock the class to prevent modifications to the method or field
  lock_class = TRUE
)
## Uncomment below to unlock the class to allow modifications of the method or field
# ConversionEventsUserData$unlock()
#
## Below is an example to define the print function
# ConversionEventsUserData$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# ConversionEventsUserData$lock()

