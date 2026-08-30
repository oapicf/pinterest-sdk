#' Create a new CatalogsItemsCreateBatchRequest
#'
#' @description
#' Request object to create catalogs items
#'
#' @docType class
#' @title CatalogsItemsCreateBatchRequest
#' @description CatalogsItemsCreateBatchRequest Class
#' @format An \code{R6Class} generator object
#' @field country  \link{Country}
#' @field items Array with catalogs items list(\link{ItemCreateBatchRecord})
#' @field language We recommend using the CatalogsLocale values. character
#' @field operation  character
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
CatalogsItemsCreateBatchRequest <- R6::R6Class(
  "CatalogsItemsCreateBatchRequest",
  public = list(
    `country` = NULL,
    `items` = NULL,
    `language` = NULL,
    `operation` = NULL,

    #' @description
    #' Initialize a new CatalogsItemsCreateBatchRequest class.
    #'
    #' @param country country
    #' @param items Array with catalogs items
    #' @param language We recommend using the CatalogsLocale values.
    #' @param operation operation
    #' @param ... Other optional arguments.
    initialize = function(`country`, `items`, `language`, `operation`, ...) {
      if (!missing(`country`)) {
        if (!(`country` %in% c())) {
          stop(paste("Error! \"", `country`, "\" cannot be assigned to `country`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`country`))
        self$`country` <- `country`
      }
      if (!missing(`items`)) {
        stopifnot(is.vector(`items`), length(`items`) != 0)
        sapply(`items`, function(x) stopifnot(R6::is.R6(x)))
        self$`items` <- `items`
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
      if (!missing(`operation`)) {
        if (!(`operation` %in% c("CREATE"))) {
          stop(paste("Error! \"", `operation`, "\" cannot be assigned to `operation`. Must be \"CREATE\".", sep = ""))
        }
        if (!(is.character(`operation`) && length(`operation`) == 1)) {
          stop(paste("Error! Invalid data for `operation`. Must be a string:", `operation`))
        }
        self$`operation` <- `operation`
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
    #' @return CatalogsItemsCreateBatchRequest as a base R list.
    #' @examples
    #' # convert array of CatalogsItemsCreateBatchRequest (x) to a data frame
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
    #' Convert CatalogsItemsCreateBatchRequest to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      CatalogsItemsCreateBatchRequestObject <- list()
      if (!is.null(self$`country`)) {
        CatalogsItemsCreateBatchRequestObject[["country"]] <-
          self$extractSimpleType(self$`country`)
      }
      if (!is.null(self$`items`)) {
        CatalogsItemsCreateBatchRequestObject[["items"]] <-
          self$extractSimpleType(self$`items`)
      }
      if (!is.null(self$`language`)) {
        CatalogsItemsCreateBatchRequestObject[["language"]] <-
          self$`language`
      }
      if (!is.null(self$`operation`)) {
        CatalogsItemsCreateBatchRequestObject[["operation"]] <-
          self$`operation`
      }
      return(CatalogsItemsCreateBatchRequestObject)
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
    #' Deserialize JSON string into an instance of CatalogsItemsCreateBatchRequest
    #'
    #' @param input_json the JSON input
    #' @return the instance of CatalogsItemsCreateBatchRequest
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`country`)) {
        `country_object` <- Country$new()
        `country_object`$fromJSON(jsonlite::toJSON(this_object$`country`, auto_unbox = TRUE, digits = NA))
        self$`country` <- `country_object`
      }
      if (!is.null(this_object$`items`)) {
        self$`items` <- ApiClient$new()$deserializeObj(this_object$`items`, "array[ItemCreateBatchRecord]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`language`)) {
        if (!is.null(this_object$`language`) && !(this_object$`language` %in% c("af-ZA", "ar-SA", "bg-BG", "bn-IN", "cs-CZ", "da-DK", "de", "el-GR", "en-AU", "en-CA", "en-GB", "en-IN", "en-US", "es-419", "es-AR", "es-ES", "es-MX", "fi-FI", "fr", "fr-CA", "he-IL", "hi-IN", "hr-HR", "hu-HU", "id-ID", "it", "ja", "ko-KR", "ms-MY", "nb-NO", "nl", "pl-PL", "pt-BR", "pt-PT", "ro-RO", "ru-RU", "sk-SK", "sv-SE", "te-IN", "th-TH", "tl-PH", "tr", "uk-UA", "vi-VN", "zh-CN", "zh-TW", "AM", "AR", "AZ", "BG", "BN", "BS", "CA", "CS", "DA", "DV", "DZ", "DE", "EL", "EN", "ES", "ET", "FA", "FI", "FR", "HE", "HI", "HR", "HU", "HY", "ID", "IN", "IS", "IT", "IW", "JA", "KA", "KM", "KO", "LO", "LT", "LV", "MK", "MN", "MS", "MY", "NB", "NE", "NL", "false", "PL", "PT", "RO", "RU", "SK", "SL", "SQ", "SR", "SV", "TL", "UK", "VI", "TE", "TH", "TR", "XX", "ZH"))) {
          stop(paste("Error! \"", this_object$`language`, "\" cannot be assigned to `language`. Must be \"af-ZA\", \"ar-SA\", \"bg-BG\", \"bn-IN\", \"cs-CZ\", \"da-DK\", \"de\", \"el-GR\", \"en-AU\", \"en-CA\", \"en-GB\", \"en-IN\", \"en-US\", \"es-419\", \"es-AR\", \"es-ES\", \"es-MX\", \"fi-FI\", \"fr\", \"fr-CA\", \"he-IL\", \"hi-IN\", \"hr-HR\", \"hu-HU\", \"id-ID\", \"it\", \"ja\", \"ko-KR\", \"ms-MY\", \"nb-NO\", \"nl\", \"pl-PL\", \"pt-BR\", \"pt-PT\", \"ro-RO\", \"ru-RU\", \"sk-SK\", \"sv-SE\", \"te-IN\", \"th-TH\", \"tl-PH\", \"tr\", \"uk-UA\", \"vi-VN\", \"zh-CN\", \"zh-TW\", \"AM\", \"AR\", \"AZ\", \"BG\", \"BN\", \"BS\", \"CA\", \"CS\", \"DA\", \"DV\", \"DZ\", \"DE\", \"EL\", \"EN\", \"ES\", \"ET\", \"FA\", \"FI\", \"FR\", \"HE\", \"HI\", \"HR\", \"HU\", \"HY\", \"ID\", \"IN\", \"IS\", \"IT\", \"IW\", \"JA\", \"KA\", \"KM\", \"KO\", \"LO\", \"LT\", \"LV\", \"MK\", \"MN\", \"MS\", \"MY\", \"NB\", \"NE\", \"NL\", \"false\", \"PL\", \"PT\", \"RO\", \"RU\", \"SK\", \"SL\", \"SQ\", \"SR\", \"SV\", \"TL\", \"UK\", \"VI\", \"TE\", \"TH\", \"TR\", \"XX\", \"ZH\".", sep = ""))
        }
        self$`language` <- this_object$`language`
      }
      if (!is.null(this_object$`operation`)) {
        if (!is.null(this_object$`operation`) && !(this_object$`operation` %in% c("CREATE"))) {
          stop(paste("Error! \"", this_object$`operation`, "\" cannot be assigned to `operation`. Must be \"CREATE\".", sep = ""))
        }
        self$`operation` <- this_object$`operation`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return CatalogsItemsCreateBatchRequest in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of CatalogsItemsCreateBatchRequest
    #'
    #' @param input_json the JSON input
    #' @return the instance of CatalogsItemsCreateBatchRequest
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`country` <- Country$new()$fromJSON(jsonlite::toJSON(this_object$`country`, auto_unbox = TRUE, digits = NA))
      self$`items` <- ApiClient$new()$deserializeObj(this_object$`items`, "array[ItemCreateBatchRecord]", loadNamespace("openapi"))
      if (!is.null(this_object$`language`) && !(this_object$`language` %in% c("af-ZA", "ar-SA", "bg-BG", "bn-IN", "cs-CZ", "da-DK", "de", "el-GR", "en-AU", "en-CA", "en-GB", "en-IN", "en-US", "es-419", "es-AR", "es-ES", "es-MX", "fi-FI", "fr", "fr-CA", "he-IL", "hi-IN", "hr-HR", "hu-HU", "id-ID", "it", "ja", "ko-KR", "ms-MY", "nb-NO", "nl", "pl-PL", "pt-BR", "pt-PT", "ro-RO", "ru-RU", "sk-SK", "sv-SE", "te-IN", "th-TH", "tl-PH", "tr", "uk-UA", "vi-VN", "zh-CN", "zh-TW", "AM", "AR", "AZ", "BG", "BN", "BS", "CA", "CS", "DA", "DV", "DZ", "DE", "EL", "EN", "ES", "ET", "FA", "FI", "FR", "HE", "HI", "HR", "HU", "HY", "ID", "IN", "IS", "IT", "IW", "JA", "KA", "KM", "KO", "LO", "LT", "LV", "MK", "MN", "MS", "MY", "NB", "NE", "NL", "false", "PL", "PT", "RO", "RU", "SK", "SL", "SQ", "SR", "SV", "TL", "UK", "VI", "TE", "TH", "TR", "XX", "ZH"))) {
        stop(paste("Error! \"", this_object$`language`, "\" cannot be assigned to `language`. Must be \"af-ZA\", \"ar-SA\", \"bg-BG\", \"bn-IN\", \"cs-CZ\", \"da-DK\", \"de\", \"el-GR\", \"en-AU\", \"en-CA\", \"en-GB\", \"en-IN\", \"en-US\", \"es-419\", \"es-AR\", \"es-ES\", \"es-MX\", \"fi-FI\", \"fr\", \"fr-CA\", \"he-IL\", \"hi-IN\", \"hr-HR\", \"hu-HU\", \"id-ID\", \"it\", \"ja\", \"ko-KR\", \"ms-MY\", \"nb-NO\", \"nl\", \"pl-PL\", \"pt-BR\", \"pt-PT\", \"ro-RO\", \"ru-RU\", \"sk-SK\", \"sv-SE\", \"te-IN\", \"th-TH\", \"tl-PH\", \"tr\", \"uk-UA\", \"vi-VN\", \"zh-CN\", \"zh-TW\", \"AM\", \"AR\", \"AZ\", \"BG\", \"BN\", \"BS\", \"CA\", \"CS\", \"DA\", \"DV\", \"DZ\", \"DE\", \"EL\", \"EN\", \"ES\", \"ET\", \"FA\", \"FI\", \"FR\", \"HE\", \"HI\", \"HR\", \"HU\", \"HY\", \"ID\", \"IN\", \"IS\", \"IT\", \"IW\", \"JA\", \"KA\", \"KM\", \"KO\", \"LO\", \"LT\", \"LV\", \"MK\", \"MN\", \"MS\", \"MY\", \"NB\", \"NE\", \"NL\", \"false\", \"PL\", \"PT\", \"RO\", \"RU\", \"SK\", \"SL\", \"SQ\", \"SR\", \"SV\", \"TL\", \"UK\", \"VI\", \"TE\", \"TH\", \"TR\", \"XX\", \"ZH\".", sep = ""))
      }
      self$`language` <- this_object$`language`
      if (!is.null(this_object$`operation`) && !(this_object$`operation` %in% c("CREATE"))) {
        stop(paste("Error! \"", this_object$`operation`, "\" cannot be assigned to `operation`. Must be \"CREATE\".", sep = ""))
      }
      self$`operation` <- this_object$`operation`
      self
    },

    #' @description
    #' Validate JSON input with respect to CatalogsItemsCreateBatchRequest and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `country`
      if (!is.null(input_json$`country`)) {
        stopifnot(R6::is.R6(input_json$`country`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CatalogsItemsCreateBatchRequest: the required field `country` is missing."))
      }
      # check the required field `items`
      if (!is.null(input_json$`items`)) {
        stopifnot(is.vector(input_json$`items`), length(input_json$`items`) != 0)
        tmp <- sapply(input_json$`items`, function(x) stopifnot(R6::is.R6(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CatalogsItemsCreateBatchRequest: the required field `items` is missing."))
      }
      # check the required field `language`
      if (!is.null(input_json$`language`)) {
        if (!(is.character(input_json$`language`) && length(input_json$`language`) == 1)) {
          stop(paste("Error! Invalid data for `language`. Must be a string:", input_json$`language`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CatalogsItemsCreateBatchRequest: the required field `language` is missing."))
      }
      # check the required field `operation`
      if (!is.null(input_json$`operation`)) {
        if (!(is.character(input_json$`operation`) && length(input_json$`operation`) == 1)) {
          stop(paste("Error! Invalid data for `operation`. Must be a string:", input_json$`operation`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CatalogsItemsCreateBatchRequest: the required field `operation` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of CatalogsItemsCreateBatchRequest
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

      # check if the required `items` is null
      if (is.null(self$`items`)) {
        return(FALSE)
      }

      if (length(self$`items`) > 1000) {
        return(FALSE)
      }
      if (length(self$`items`) < 1) {
        return(FALSE)
      }

      # check if the required `language` is null
      if (is.null(self$`language`)) {
        return(FALSE)
      }

      # check if the required `operation` is null
      if (is.null(self$`operation`)) {
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

      # check if the required `items` is null
      if (is.null(self$`items`)) {
        invalid_fields["items"] <- "Non-nullable required field `items` cannot be null."
      }

      if (length(self$`items`) > 1000) {
        invalid_fields["items"] <- "Invalid length for `items`, number of items must be less than or equal to 1000."
      }
      if (length(self$`items`) < 1) {
        invalid_fields["items"] <- "Invalid length for ``, number of items must be greater than or equal to 1."
      }

      # check if the required `language` is null
      if (is.null(self$`language`)) {
        invalid_fields["language"] <- "Non-nullable required field `language` cannot be null."
      }

      # check if the required `operation` is null
      if (is.null(self$`operation`)) {
        invalid_fields["operation"] <- "Non-nullable required field `operation` cannot be null."
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
# CatalogsItemsCreateBatchRequest$unlock()
#
## Below is an example to define the print function
# CatalogsItemsCreateBatchRequest$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# CatalogsItemsCreateBatchRequest$lock()

