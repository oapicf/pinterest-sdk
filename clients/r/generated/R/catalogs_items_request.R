#' Create a new CatalogsItemsRequest
#'
#' @description
#' Request object of catalogs items
#'
#' @docType class
#' @title CatalogsItemsRequest
#' @description CatalogsItemsRequest Class
#' @format An \code{R6Class} generator object
#' @field country  \link{Country}
#' @field filters  \link{CatalogsItemsPostFilters}
#' @field language We recommend using the CatalogsLocale values. character
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
CatalogsItemsRequest <- R6::R6Class(
  "CatalogsItemsRequest",
  public = list(
    `country` = NULL,
    `filters` = NULL,
    `language` = NULL,

    #' @description
    #' Initialize a new CatalogsItemsRequest class.
    #'
    #' @param country country
    #' @param filters filters
    #' @param language We recommend using the CatalogsLocale values.
    #' @param ... Other optional arguments.
    initialize = function(`country`, `filters`, `language`, ...) {
      if (!missing(`country`)) {
        if (!(`country` %in% c())) {
          stop(paste("Error! \"", `country`, "\" cannot be assigned to `country`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`country`))
        self$`country` <- `country`
      }
      if (!missing(`filters`)) {
        stopifnot(R6::is.R6(`filters`))
        self$`filters` <- `filters`
      }
      if (!missing(`language`)) {
        if (!(`language` %in% c("af-ZA", "ar-SA", "bg-BG", "bn-IN", "cs-CZ", "da-DK", "de", "el-GR", "en-AU", "en-CA", "en-GB", "en-IN", "en-US", "es-419", "es-AR", "es-ES", "es-MX", "fi-FI", "fr", "fr-CA", "he-IL", "hi-IN", "hr-HR", "hu-HU", "id-ID", "it", "ja", "ko-KR", "ms-MY", "nb-NO", "nl", "pl-PL", "pt-BR", "pt-PT", "ro-RO", "ru-RU", "sk-SK", "sv-SE", "te-IN", "th-TH", "tl-PH", "tr", "uk-UA", "vi-VN", "zh-CN", "zh-TW", "AM", "AR", "AZ", "BG", "BN", "BS", "CA", "CS", "DA", "DV", "DZ", "DE", "EL", "EN", "ES", "ET", "FA", "FI", "FR", "HE", "HI", "HR", "HU", "HY", "ID", "IN", "IS", "IT", "IW", "JA", "KA", "KM", "KO", "LO", "LT", "LV", "MK", "MN", "MS", "MY", "NB", "NE", "NL", "false", "PL", "PT", "RO", "RU", "SK", "SL", "SQ", "SR", "SV", "TL", "UK", "VI", "TE", "TH", "TR", "XX", "ZH"))) {
          stop(paste("Error! \"", `language`, "\" cannot be assigned to `language`. Must be \"af-ZA\", \"ar-SA\", \"bg-BG\", \"bn-IN\", \"cs-CZ\", \"da-DK\", \"de\", \"el-GR\", \"en-AU\", \"en-CA\", \"en-GB\", \"en-IN\", \"en-US\", \"es-419\", \"es-AR\", \"es-ES\", \"es-MX\", \"fi-FI\", \"fr\", \"fr-CA\", \"he-IL\", \"hi-IN\", \"hr-HR\", \"hu-HU\", \"id-ID\", \"it\", \"ja\", \"ko-KR\", \"ms-MY\", \"nb-NO\", \"nl\", \"pl-PL\", \"pt-BR\", \"pt-PT\", \"ro-RO\", \"ru-RU\", \"sk-SK\", \"sv-SE\", \"te-IN\", \"th-TH\", \"tl-PH\", \"tr\", \"uk-UA\", \"vi-VN\", \"zh-CN\", \"zh-TW\", \"AM\", \"AR\", \"AZ\", \"BG\", \"BN\", \"BS\", \"CA\", \"CS\", \"DA\", \"DV\", \"DZ\", \"DE\", \"EL\", \"EN\", \"ES\", \"ET\", \"FA\", \"FI\", \"FR\", \"HE\", \"HI\", \"HR\", \"HU\", \"HY\", \"ID\", \"IN\", \"IS\", \"IT\", \"IW\", \"JA\", \"KA\", \"KM\", \"KO\", \"LO\", \"LT\", \"LV\", \"MK\", \"MN\", \"MS\", \"MY\", \"NB\", \"NE\", \"NL\", \"false\", \"PL\", \"PT\", \"RO\", \"RU\", \"SK\", \"SL\", \"SQ\", \"SR\", \"SV\", \"TL\", \"UK\", \"VI\", \"TE\", \"TH\", \"TR\", \"XX\", \"ZH\".", sep = ""))
        }
        if (!(is.character(`language`) && length(`language`) == 1)) {
          stop(paste("Error! Invalid data for `language`. Must be a string:", `language`))
        }
        self$`language` <- `language`
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
    #' @return CatalogsItemsRequest as a base R list.
    #' @examples
    #' # convert array of CatalogsItemsRequest (x) to a data frame
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
    #' Convert CatalogsItemsRequest to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      CatalogsItemsRequestObject <- list()
      if (!is.null(self$`country`)) {
        CatalogsItemsRequestObject[["country"]] <-
          self$extractSimpleType(self$`country`)
      }
      if (!is.null(self$`filters`)) {
        CatalogsItemsRequestObject[["filters"]] <-
          self$extractSimpleType(self$`filters`)
      }
      if (!is.null(self$`language`)) {
        CatalogsItemsRequestObject[["language"]] <-
          self$`language`
      }
      return(CatalogsItemsRequestObject)
    },

    extractSimpleType = function(x) {
      if (R6::is.R6(x)) {
        return(x$toSimpleType())
      } else if (!self$hasNestedR6(x)) {
        return(x)
      }
      lapply(x, self$extractSimpleType)
    },

    hasNestedR6 = function(x) {
      if (R6::is.R6(x)) {
        return(TRUE)
      }
      if (is.list(x)) {
        for (item in x) {
          if (self$hasNestedR6(item)) {
            return(TRUE)
          }
        }
      }
      FALSE
    },

    #' @description
    #' Deserialize JSON string into an instance of CatalogsItemsRequest
    #'
    #' @param input_json the JSON input
    #' @return the instance of CatalogsItemsRequest
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`country`)) {
        `country_object` <- Country$new()
        `country_object`$fromJSON(jsonlite::toJSON(this_object$`country`, auto_unbox = TRUE, digits = NA))
        self$`country` <- `country_object`
      }
      if (!is.null(this_object$`filters`)) {
        `filters_object` <- CatalogsItemsPostFilters$new()
        `filters_object`$fromJSON(jsonlite::toJSON(this_object$`filters`, auto_unbox = TRUE, digits = NA))
        self$`filters` <- `filters_object`
      }
      if (!is.null(this_object$`language`)) {
        if (!is.null(this_object$`language`) && !(this_object$`language` %in% c("af-ZA", "ar-SA", "bg-BG", "bn-IN", "cs-CZ", "da-DK", "de", "el-GR", "en-AU", "en-CA", "en-GB", "en-IN", "en-US", "es-419", "es-AR", "es-ES", "es-MX", "fi-FI", "fr", "fr-CA", "he-IL", "hi-IN", "hr-HR", "hu-HU", "id-ID", "it", "ja", "ko-KR", "ms-MY", "nb-NO", "nl", "pl-PL", "pt-BR", "pt-PT", "ro-RO", "ru-RU", "sk-SK", "sv-SE", "te-IN", "th-TH", "tl-PH", "tr", "uk-UA", "vi-VN", "zh-CN", "zh-TW", "AM", "AR", "AZ", "BG", "BN", "BS", "CA", "CS", "DA", "DV", "DZ", "DE", "EL", "EN", "ES", "ET", "FA", "FI", "FR", "HE", "HI", "HR", "HU", "HY", "ID", "IN", "IS", "IT", "IW", "JA", "KA", "KM", "KO", "LO", "LT", "LV", "MK", "MN", "MS", "MY", "NB", "NE", "NL", "false", "PL", "PT", "RO", "RU", "SK", "SL", "SQ", "SR", "SV", "TL", "UK", "VI", "TE", "TH", "TR", "XX", "ZH"))) {
          stop(paste("Error! \"", this_object$`language`, "\" cannot be assigned to `language`. Must be \"af-ZA\", \"ar-SA\", \"bg-BG\", \"bn-IN\", \"cs-CZ\", \"da-DK\", \"de\", \"el-GR\", \"en-AU\", \"en-CA\", \"en-GB\", \"en-IN\", \"en-US\", \"es-419\", \"es-AR\", \"es-ES\", \"es-MX\", \"fi-FI\", \"fr\", \"fr-CA\", \"he-IL\", \"hi-IN\", \"hr-HR\", \"hu-HU\", \"id-ID\", \"it\", \"ja\", \"ko-KR\", \"ms-MY\", \"nb-NO\", \"nl\", \"pl-PL\", \"pt-BR\", \"pt-PT\", \"ro-RO\", \"ru-RU\", \"sk-SK\", \"sv-SE\", \"te-IN\", \"th-TH\", \"tl-PH\", \"tr\", \"uk-UA\", \"vi-VN\", \"zh-CN\", \"zh-TW\", \"AM\", \"AR\", \"AZ\", \"BG\", \"BN\", \"BS\", \"CA\", \"CS\", \"DA\", \"DV\", \"DZ\", \"DE\", \"EL\", \"EN\", \"ES\", \"ET\", \"FA\", \"FI\", \"FR\", \"HE\", \"HI\", \"HR\", \"HU\", \"HY\", \"ID\", \"IN\", \"IS\", \"IT\", \"IW\", \"JA\", \"KA\", \"KM\", \"KO\", \"LO\", \"LT\", \"LV\", \"MK\", \"MN\", \"MS\", \"MY\", \"NB\", \"NE\", \"NL\", \"false\", \"PL\", \"PT\", \"RO\", \"RU\", \"SK\", \"SL\", \"SQ\", \"SR\", \"SV\", \"TL\", \"UK\", \"VI\", \"TE\", \"TH\", \"TR\", \"XX\", \"ZH\".", sep = ""))
        }
        self$`language` <- this_object$`language`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return CatalogsItemsRequest in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of CatalogsItemsRequest
    #'
    #' @param input_json the JSON input
    #' @return the instance of CatalogsItemsRequest
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`country` <- Country$new()$fromJSON(jsonlite::toJSON(this_object$`country`, auto_unbox = TRUE, digits = NA))
      self$`filters` <- CatalogsItemsPostFilters$new()$fromJSON(jsonlite::toJSON(this_object$`filters`, auto_unbox = TRUE, digits = NA))
      if (!is.null(this_object$`language`) && !(this_object$`language` %in% c("af-ZA", "ar-SA", "bg-BG", "bn-IN", "cs-CZ", "da-DK", "de", "el-GR", "en-AU", "en-CA", "en-GB", "en-IN", "en-US", "es-419", "es-AR", "es-ES", "es-MX", "fi-FI", "fr", "fr-CA", "he-IL", "hi-IN", "hr-HR", "hu-HU", "id-ID", "it", "ja", "ko-KR", "ms-MY", "nb-NO", "nl", "pl-PL", "pt-BR", "pt-PT", "ro-RO", "ru-RU", "sk-SK", "sv-SE", "te-IN", "th-TH", "tl-PH", "tr", "uk-UA", "vi-VN", "zh-CN", "zh-TW", "AM", "AR", "AZ", "BG", "BN", "BS", "CA", "CS", "DA", "DV", "DZ", "DE", "EL", "EN", "ES", "ET", "FA", "FI", "FR", "HE", "HI", "HR", "HU", "HY", "ID", "IN", "IS", "IT", "IW", "JA", "KA", "KM", "KO", "LO", "LT", "LV", "MK", "MN", "MS", "MY", "NB", "NE", "NL", "false", "PL", "PT", "RO", "RU", "SK", "SL", "SQ", "SR", "SV", "TL", "UK", "VI", "TE", "TH", "TR", "XX", "ZH"))) {
        stop(paste("Error! \"", this_object$`language`, "\" cannot be assigned to `language`. Must be \"af-ZA\", \"ar-SA\", \"bg-BG\", \"bn-IN\", \"cs-CZ\", \"da-DK\", \"de\", \"el-GR\", \"en-AU\", \"en-CA\", \"en-GB\", \"en-IN\", \"en-US\", \"es-419\", \"es-AR\", \"es-ES\", \"es-MX\", \"fi-FI\", \"fr\", \"fr-CA\", \"he-IL\", \"hi-IN\", \"hr-HR\", \"hu-HU\", \"id-ID\", \"it\", \"ja\", \"ko-KR\", \"ms-MY\", \"nb-NO\", \"nl\", \"pl-PL\", \"pt-BR\", \"pt-PT\", \"ro-RO\", \"ru-RU\", \"sk-SK\", \"sv-SE\", \"te-IN\", \"th-TH\", \"tl-PH\", \"tr\", \"uk-UA\", \"vi-VN\", \"zh-CN\", \"zh-TW\", \"AM\", \"AR\", \"AZ\", \"BG\", \"BN\", \"BS\", \"CA\", \"CS\", \"DA\", \"DV\", \"DZ\", \"DE\", \"EL\", \"EN\", \"ES\", \"ET\", \"FA\", \"FI\", \"FR\", \"HE\", \"HI\", \"HR\", \"HU\", \"HY\", \"ID\", \"IN\", \"IS\", \"IT\", \"IW\", \"JA\", \"KA\", \"KM\", \"KO\", \"LO\", \"LT\", \"LV\", \"MK\", \"MN\", \"MS\", \"MY\", \"NB\", \"NE\", \"NL\", \"false\", \"PL\", \"PT\", \"RO\", \"RU\", \"SK\", \"SL\", \"SQ\", \"SR\", \"SV\", \"TL\", \"UK\", \"VI\", \"TE\", \"TH\", \"TR\", \"XX\", \"ZH\".", sep = ""))
      }
      self$`language` <- this_object$`language`
      self
    },

    #' @description
    #' Validate JSON input with respect to CatalogsItemsRequest and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `country`
      if (!is.null(input_json$`country`)) {
        stopifnot(R6::is.R6(input_json$`country`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CatalogsItemsRequest: the required field `country` is missing."))
      }
      # check the required field `filters`
      if (!is.null(input_json$`filters`)) {
        stopifnot(R6::is.R6(input_json$`filters`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CatalogsItemsRequest: the required field `filters` is missing."))
      }
      # check the required field `language`
      if (!is.null(input_json$`language`)) {
        if (!(is.character(input_json$`language`) && length(input_json$`language`) == 1)) {
          stop(paste("Error! Invalid data for `language`. Must be a string:", input_json$`language`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CatalogsItemsRequest: the required field `language` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of CatalogsItemsRequest
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `country` is null
      if (is.null(self$`country`)) {
        return(FALSE)
      }

      # check if the required `filters` is null
      if (is.null(self$`filters`)) {
        return(FALSE)
      }

      # check if the required `language` is null
      if (is.null(self$`language`)) {
        return(FALSE)
      }

      TRUE
    },

    #' @description
    #' Return a list of invalid fields (if any).
    #'
    #' @return A list of invalid fields (if any).
    getInvalidFields = function() {
      invalid_fields <- list()
      # check if the required `country` is null
      if (is.null(self$`country`)) {
        invalid_fields["country"] <- "Non-nullable required field `country` cannot be null."
      }

      # check if the required `filters` is null
      if (is.null(self$`filters`)) {
        invalid_fields["filters"] <- "Non-nullable required field `filters` cannot be null."
      }

      # check if the required `language` is null
      if (is.null(self$`language`)) {
        invalid_fields["language"] <- "Non-nullable required field `language` cannot be null."
      }

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
# CatalogsItemsRequest$unlock()
#
## Below is an example to define the print function
# CatalogsItemsRequest$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# CatalogsItemsRequest$lock()

