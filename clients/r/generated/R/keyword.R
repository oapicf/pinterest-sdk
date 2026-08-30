#' Create a new Keyword
#'
#' @description
#' Keyword Class
#'
#' @docType class
#' @title Keyword
#' @description Keyword Class
#' @format An \code{R6Class} generator object
#' @field archived  character [optional]
#' @field bid **Note:** bid field has been deprecated. Input will not be set and field will return null. Keyword custom bid in microcurrency - null if inherited from parent ad group. integer [optional]
#' @field id Keyword ID . character
#' @field match_type Keyword [match type](/docs/api-features/targeting-overview/) \link{MatchType}
#' @field parent_id Keyword parent entity ID (advertiser, campaign, ad group). character
#' @field parent_type Parent entity type (advertiser, campaign, ad group). character [optional]
#' @field type Always keyword character [optional]
#' @field value Keyword value (120 chars max). character
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
Keyword <- R6::R6Class(
  "Keyword",
  public = list(
    `archived` = NULL,
    `bid` = NULL,
    `id` = NULL,
    `match_type` = NULL,
    `parent_id` = NULL,
    `parent_type` = NULL,
    `type` = NULL,
    `value` = NULL,

    #' @description
    #' Initialize a new Keyword class.
    #'
    #' @param id Keyword ID .
    #' @param match_type Keyword [match type](/docs/api-features/targeting-overview/)
    #' @param parent_id Keyword parent entity ID (advertiser, campaign, ad group).
    #' @param value Keyword value (120 chars max).
    #' @param archived archived
    #' @param bid **Note:** bid field has been deprecated. Input will not be set and field will return null. Keyword custom bid in microcurrency - null if inherited from parent ad group.
    #' @param parent_type Parent entity type (advertiser, campaign, ad group).
    #' @param type Always keyword
    #' @param ... Other optional arguments.
    initialize = function(`id`, `match_type`, `parent_id`, `value`, `archived` = NULL, `bid` = NULL, `parent_type` = NULL, `type` = NULL, ...) {
      if (!missing(`id`)) {
        if (!(is.character(`id`) && length(`id`) == 1)) {
          stop(paste("Error! Invalid data for `id`. Must be a string:", `id`))
        }
        self$`id` <- `id`
      }
      if (!missing(`match_type`)) {
        if (!(`match_type` %in% c())) {
          stop(paste("Error! \"", `match_type`, "\" cannot be assigned to `match_type`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`match_type`))
        self$`match_type` <- `match_type`
      }
      if (!missing(`parent_id`)) {
        if (!(is.character(`parent_id`) && length(`parent_id`) == 1)) {
          stop(paste("Error! Invalid data for `parent_id`. Must be a string:", `parent_id`))
        }
        self$`parent_id` <- `parent_id`
      }
      if (!missing(`value`)) {
        if (!(is.character(`value`) && length(`value`) == 1)) {
          stop(paste("Error! Invalid data for `value`. Must be a string:", `value`))
        }
        self$`value` <- `value`
      }
      if (!is.null(`archived`)) {
        if (!(is.logical(`archived`) && length(`archived`) == 1)) {
          stop(paste("Error! Invalid data for `archived`. Must be a boolean:", `archived`))
        }
        self$`archived` <- `archived`
      }
      if (!is.null(`bid`)) {
        if (!(is.numeric(`bid`) && length(`bid`) == 1)) {
          stop(paste("Error! Invalid data for `bid`. Must be an integer:", `bid`))
        }
        self$`bid` <- `bid`
      }
      if (!is.null(`parent_type`)) {
        if (!(is.character(`parent_type`) && length(`parent_type`) == 1)) {
          stop(paste("Error! Invalid data for `parent_type`. Must be a string:", `parent_type`))
        }
        self$`parent_type` <- `parent_type`
      }
      if (!is.null(`type`)) {
        if (!(is.character(`type`) && length(`type`) == 1)) {
          stop(paste("Error! Invalid data for `type`. Must be a string:", `type`))
        }
        self$`type` <- `type`
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
    #' @return Keyword as a base R list.
    #' @examples
    #' # convert array of Keyword (x) to a data frame
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
    #' Convert Keyword to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      KeywordObject <- list()
      if (!is.null(self$`archived`)) {
        KeywordObject[["archived"]] <-
          self$`archived`
      }
      if (!is.null(self$`bid`)) {
        KeywordObject[["bid"]] <-
          self$`bid`
      }
      if (!is.null(self$`id`)) {
        KeywordObject[["id"]] <-
          self$`id`
      }
      if (!is.null(self$`match_type`)) {
        KeywordObject[["match_type"]] <-
          self$extractSimpleType(self$`match_type`)
      }
      if (!is.null(self$`parent_id`)) {
        KeywordObject[["parent_id"]] <-
          self$`parent_id`
      }
      if (!is.null(self$`parent_type`)) {
        KeywordObject[["parent_type"]] <-
          self$`parent_type`
      }
      if (!is.null(self$`type`)) {
        KeywordObject[["type"]] <-
          self$`type`
      }
      if (!is.null(self$`value`)) {
        KeywordObject[["value"]] <-
          self$`value`
      }
      return(KeywordObject)
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
    #' Deserialize JSON string into an instance of Keyword
    #'
    #' @param input_json the JSON input
    #' @return the instance of Keyword
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`archived`)) {
        self$`archived` <- this_object$`archived`
      }
      if (!is.null(this_object$`bid`)) {
        self$`bid` <- this_object$`bid`
      }
      if (!is.null(this_object$`id`)) {
        self$`id` <- this_object$`id`
      }
      if (!is.null(this_object$`match_type`)) {
        `match_type_object` <- MatchType$new()
        `match_type_object`$fromJSON(jsonlite::toJSON(this_object$`match_type`, auto_unbox = TRUE, digits = NA))
        self$`match_type` <- `match_type_object`
      }
      if (!is.null(this_object$`parent_id`)) {
        self$`parent_id` <- this_object$`parent_id`
      }
      if (!is.null(this_object$`parent_type`)) {
        self$`parent_type` <- this_object$`parent_type`
      }
      if (!is.null(this_object$`type`)) {
        self$`type` <- this_object$`type`
      }
      if (!is.null(this_object$`value`)) {
        self$`value` <- this_object$`value`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return Keyword in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of Keyword
    #'
    #' @param input_json the JSON input
    #' @return the instance of Keyword
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`archived` <- this_object$`archived`
      self$`bid` <- this_object$`bid`
      self$`id` <- this_object$`id`
      self$`match_type` <- MatchType$new()$fromJSON(jsonlite::toJSON(this_object$`match_type`, auto_unbox = TRUE, digits = NA))
      self$`parent_id` <- this_object$`parent_id`
      self$`parent_type` <- this_object$`parent_type`
      self$`type` <- this_object$`type`
      self$`value` <- this_object$`value`
      self
    },

    #' @description
    #' Validate JSON input with respect to Keyword and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `id`
      if (!is.null(input_json$`id`)) {
        if (!(is.character(input_json$`id`) && length(input_json$`id`) == 1)) {
          stop(paste("Error! Invalid data for `id`. Must be a string:", input_json$`id`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for Keyword: the required field `id` is missing."))
      }
      # check the required field `match_type`
      if (!is.null(input_json$`match_type`)) {
        stopifnot(R6::is.R6(input_json$`match_type`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for Keyword: the required field `match_type` is missing."))
      }
      # check the required field `parent_id`
      if (!is.null(input_json$`parent_id`)) {
        if (!(is.character(input_json$`parent_id`) && length(input_json$`parent_id`) == 1)) {
          stop(paste("Error! Invalid data for `parent_id`. Must be a string:", input_json$`parent_id`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for Keyword: the required field `parent_id` is missing."))
      }
      # check the required field `value`
      if (!is.null(input_json$`value`)) {
        if (!(is.character(input_json$`value`) && length(input_json$`value`) == 1)) {
          stop(paste("Error! Invalid data for `value`. Must be a string:", input_json$`value`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for Keyword: the required field `value` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of Keyword
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `id` is null
      if (is.null(self$`id`)) {
        return(FALSE)
      }

      if (!str_detect(self$`id`, "^\\d+$")) {
        return(FALSE)
      }

      # check if the required `parent_id` is null
      if (is.null(self$`parent_id`)) {
        return(FALSE)
      }

      if (!str_detect(self$`parent_id`, "^\\d+$")) {
        return(FALSE)
      }

      # check if the required `value` is null
      if (is.null(self$`value`)) {
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
      # check if the required `id` is null
      if (is.null(self$`id`)) {
        invalid_fields["id"] <- "Non-nullable required field `id` cannot be null."
      }

      if (!str_detect(self$`id`, "^\\d+$")) {
        invalid_fields["id"] <- "Invalid value for `id`, must conform to the pattern ^\\d+$."
      }

      # check if the required `parent_id` is null
      if (is.null(self$`parent_id`)) {
        invalid_fields["parent_id"] <- "Non-nullable required field `parent_id` cannot be null."
      }

      if (!str_detect(self$`parent_id`, "^\\d+$")) {
        invalid_fields["parent_id"] <- "Invalid value for `parent_id`, must conform to the pattern ^\\d+$."
      }

      # check if the required `value` is null
      if (is.null(self$`value`)) {
        invalid_fields["value"] <- "Non-nullable required field `value` cannot be null."
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
# Keyword$unlock()
#
## Below is an example to define the print function
# Keyword$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# Keyword$lock()

