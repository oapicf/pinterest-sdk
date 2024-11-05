#' Create a new ConversionTagConfigs
#'
#' @description
#' ConversionTagConfigs Class
#'
#' @docType class
#' @title ConversionTagConfigs
#' @description ConversionTagConfigs Class
#' @format An \code{R6Class} generator object
#' @field aem_enabled Whether Automatic Enhanced Match email is enabled. See <a href=\"https://help.pinterest.com/en/business/article/enhanced-match\" target=\"_blank\">Enhanced match</a> for more information. character [optional]
#' @field md_frequency Metadata ingestion frequency. numeric [optional]
#' @field aem_fnln_enabled Whether Automatic Enhanced Match name is enabled. See <a href=\"https://help.pinterest.com/en/business/article/enhanced-match\" target=\"_blank\">Enhanced match</a> for more information. character [optional]
#' @field aem_ph_enabled Whether Automatic Enhanced Match phone is enabled. See <a href=\"https://help.pinterest.com/en/business/article/enhanced-match\" target=\"_blank\">Enhanced match</a> for more information. character [optional]
#' @field aem_ge_enabled Whether Automatic Enhanced Match gender is enabled. See <a href=\"https://help.pinterest.com/en/business/article/enhanced-match\" target=\"_blank\">Enhanced match</a> for more information. character [optional]
#' @field aem_db_enabled Whether Automatic Enhanced Match birthdate is enabled. See <a href=\"https://help.pinterest.com/en/business/article/enhanced-match\" target=\"_blank\">Enhanced match</a> for more information. character [optional]
#' @field aem_loc_enabled Whether Automatic Enhanced Match location is enabled. See <a href=\"https://help.pinterest.com/en/business/article/enhanced-match\" target=\"_blank\">Enhanced match</a> for more information. character [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
ConversionTagConfigs <- R6::R6Class(
  "ConversionTagConfigs",
  public = list(
    `aem_enabled` = NULL,
    `md_frequency` = NULL,
    `aem_fnln_enabled` = NULL,
    `aem_ph_enabled` = NULL,
    `aem_ge_enabled` = NULL,
    `aem_db_enabled` = NULL,
    `aem_loc_enabled` = NULL,

    #' @description
    #' Initialize a new ConversionTagConfigs class.
    #'
    #' @param aem_enabled Whether Automatic Enhanced Match email is enabled. See <a href=\"https://help.pinterest.com/en/business/article/enhanced-match\" target=\"_blank\">Enhanced match</a> for more information.. Default to FALSE.
    #' @param md_frequency Metadata ingestion frequency.. Default to 1.
    #' @param aem_fnln_enabled Whether Automatic Enhanced Match name is enabled. See <a href=\"https://help.pinterest.com/en/business/article/enhanced-match\" target=\"_blank\">Enhanced match</a> for more information.. Default to FALSE.
    #' @param aem_ph_enabled Whether Automatic Enhanced Match phone is enabled. See <a href=\"https://help.pinterest.com/en/business/article/enhanced-match\" target=\"_blank\">Enhanced match</a> for more information.. Default to FALSE.
    #' @param aem_ge_enabled Whether Automatic Enhanced Match gender is enabled. See <a href=\"https://help.pinterest.com/en/business/article/enhanced-match\" target=\"_blank\">Enhanced match</a> for more information.. Default to FALSE.
    #' @param aem_db_enabled Whether Automatic Enhanced Match birthdate is enabled. See <a href=\"https://help.pinterest.com/en/business/article/enhanced-match\" target=\"_blank\">Enhanced match</a> for more information.. Default to FALSE.
    #' @param aem_loc_enabled Whether Automatic Enhanced Match location is enabled. See <a href=\"https://help.pinterest.com/en/business/article/enhanced-match\" target=\"_blank\">Enhanced match</a> for more information.. Default to FALSE.
    #' @param ... Other optional arguments.
    initialize = function(`aem_enabled` = FALSE, `md_frequency` = 1, `aem_fnln_enabled` = FALSE, `aem_ph_enabled` = FALSE, `aem_ge_enabled` = FALSE, `aem_db_enabled` = FALSE, `aem_loc_enabled` = FALSE, ...) {
      if (!is.null(`aem_enabled`)) {
        if (!(is.logical(`aem_enabled`) && length(`aem_enabled`) == 1)) {
          stop(paste("Error! Invalid data for `aem_enabled`. Must be a boolean:", `aem_enabled`))
        }
        self$`aem_enabled` <- `aem_enabled`
      }
      if (!is.null(`md_frequency`)) {
        self$`md_frequency` <- `md_frequency`
      }
      if (!is.null(`aem_fnln_enabled`)) {
        if (!(is.logical(`aem_fnln_enabled`) && length(`aem_fnln_enabled`) == 1)) {
          stop(paste("Error! Invalid data for `aem_fnln_enabled`. Must be a boolean:", `aem_fnln_enabled`))
        }
        self$`aem_fnln_enabled` <- `aem_fnln_enabled`
      }
      if (!is.null(`aem_ph_enabled`)) {
        if (!(is.logical(`aem_ph_enabled`) && length(`aem_ph_enabled`) == 1)) {
          stop(paste("Error! Invalid data for `aem_ph_enabled`. Must be a boolean:", `aem_ph_enabled`))
        }
        self$`aem_ph_enabled` <- `aem_ph_enabled`
      }
      if (!is.null(`aem_ge_enabled`)) {
        if (!(is.logical(`aem_ge_enabled`) && length(`aem_ge_enabled`) == 1)) {
          stop(paste("Error! Invalid data for `aem_ge_enabled`. Must be a boolean:", `aem_ge_enabled`))
        }
        self$`aem_ge_enabled` <- `aem_ge_enabled`
      }
      if (!is.null(`aem_db_enabled`)) {
        if (!(is.logical(`aem_db_enabled`) && length(`aem_db_enabled`) == 1)) {
          stop(paste("Error! Invalid data for `aem_db_enabled`. Must be a boolean:", `aem_db_enabled`))
        }
        self$`aem_db_enabled` <- `aem_db_enabled`
      }
      if (!is.null(`aem_loc_enabled`)) {
        if (!(is.logical(`aem_loc_enabled`) && length(`aem_loc_enabled`) == 1)) {
          stop(paste("Error! Invalid data for `aem_loc_enabled`. Must be a boolean:", `aem_loc_enabled`))
        }
        self$`aem_loc_enabled` <- `aem_loc_enabled`
      }
    },

    #' @description
    #' To JSON String
    #'
    #' @return ConversionTagConfigs in JSON format
    toJSON = function() {
      ConversionTagConfigsObject <- list()
      if (!is.null(self$`aem_enabled`)) {
        ConversionTagConfigsObject[["aem_enabled"]] <-
          self$`aem_enabled`
      }
      if (!is.null(self$`md_frequency`)) {
        ConversionTagConfigsObject[["md_frequency"]] <-
          self$`md_frequency`
      }
      if (!is.null(self$`aem_fnln_enabled`)) {
        ConversionTagConfigsObject[["aem_fnln_enabled"]] <-
          self$`aem_fnln_enabled`
      }
      if (!is.null(self$`aem_ph_enabled`)) {
        ConversionTagConfigsObject[["aem_ph_enabled"]] <-
          self$`aem_ph_enabled`
      }
      if (!is.null(self$`aem_ge_enabled`)) {
        ConversionTagConfigsObject[["aem_ge_enabled"]] <-
          self$`aem_ge_enabled`
      }
      if (!is.null(self$`aem_db_enabled`)) {
        ConversionTagConfigsObject[["aem_db_enabled"]] <-
          self$`aem_db_enabled`
      }
      if (!is.null(self$`aem_loc_enabled`)) {
        ConversionTagConfigsObject[["aem_loc_enabled"]] <-
          self$`aem_loc_enabled`
      }
      ConversionTagConfigsObject
    },

    #' @description
    #' Deserialize JSON string into an instance of ConversionTagConfigs
    #'
    #' @param input_json the JSON input
    #' @return the instance of ConversionTagConfigs
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`aem_enabled`)) {
        self$`aem_enabled` <- this_object$`aem_enabled`
      }
      if (!is.null(this_object$`md_frequency`)) {
        self$`md_frequency` <- this_object$`md_frequency`
      }
      if (!is.null(this_object$`aem_fnln_enabled`)) {
        self$`aem_fnln_enabled` <- this_object$`aem_fnln_enabled`
      }
      if (!is.null(this_object$`aem_ph_enabled`)) {
        self$`aem_ph_enabled` <- this_object$`aem_ph_enabled`
      }
      if (!is.null(this_object$`aem_ge_enabled`)) {
        self$`aem_ge_enabled` <- this_object$`aem_ge_enabled`
      }
      if (!is.null(this_object$`aem_db_enabled`)) {
        self$`aem_db_enabled` <- this_object$`aem_db_enabled`
      }
      if (!is.null(this_object$`aem_loc_enabled`)) {
        self$`aem_loc_enabled` <- this_object$`aem_loc_enabled`
      }
      self
    },

    #' @description
    #' To JSON String
    #'
    #' @return ConversionTagConfigs in JSON format
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`aem_enabled`)) {
          sprintf(
          '"aem_enabled":
            %s
                    ',
          tolower(self$`aem_enabled`)
          )
        },
        if (!is.null(self$`md_frequency`)) {
          sprintf(
          '"md_frequency":
            %d
                    ',
          self$`md_frequency`
          )
        },
        if (!is.null(self$`aem_fnln_enabled`)) {
          sprintf(
          '"aem_fnln_enabled":
            %s
                    ',
          tolower(self$`aem_fnln_enabled`)
          )
        },
        if (!is.null(self$`aem_ph_enabled`)) {
          sprintf(
          '"aem_ph_enabled":
            %s
                    ',
          tolower(self$`aem_ph_enabled`)
          )
        },
        if (!is.null(self$`aem_ge_enabled`)) {
          sprintf(
          '"aem_ge_enabled":
            %s
                    ',
          tolower(self$`aem_ge_enabled`)
          )
        },
        if (!is.null(self$`aem_db_enabled`)) {
          sprintf(
          '"aem_db_enabled":
            %s
                    ',
          tolower(self$`aem_db_enabled`)
          )
        },
        if (!is.null(self$`aem_loc_enabled`)) {
          sprintf(
          '"aem_loc_enabled":
            %s
                    ',
          tolower(self$`aem_loc_enabled`)
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },

    #' @description
    #' Deserialize JSON string into an instance of ConversionTagConfigs
    #'
    #' @param input_json the JSON input
    #' @return the instance of ConversionTagConfigs
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`aem_enabled` <- this_object$`aem_enabled`
      self$`md_frequency` <- this_object$`md_frequency`
      self$`aem_fnln_enabled` <- this_object$`aem_fnln_enabled`
      self$`aem_ph_enabled` <- this_object$`aem_ph_enabled`
      self$`aem_ge_enabled` <- this_object$`aem_ge_enabled`
      self$`aem_db_enabled` <- this_object$`aem_db_enabled`
      self$`aem_loc_enabled` <- this_object$`aem_loc_enabled`
      self
    },

    #' @description
    #' Validate JSON input with respect to ConversionTagConfigs and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of ConversionTagConfigs
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
# ConversionTagConfigs$unlock()
#
## Below is an example to define the print function
# ConversionTagConfigs$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# ConversionTagConfigs$lock()

