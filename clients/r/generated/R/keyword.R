#' Create a new Keyword
#'
#' @description
#' Keyword Class
#'
#' @docType class
#' @title Keyword
#' @description Keyword Class
#' @format An \code{R6Class} generator object
#' @field bid </p><strong>Note:</strong> bid field has been deprecated. Input will not be set and field will return null. Keyword custom bid in microcurrency - null if inherited from parent ad group. integer [optional]
#' @field match_type  \link{MatchTypeResponse}
#' @field value Keyword value (120 chars max). character
#' @field archived  character [optional]
#' @field id Keyword ID . character [optional]
#' @field parent_id Keyword parent entity ID (advertiser, campaign, ad group). character [optional]
#' @field parent_type Parent entity type character [optional]
#' @field type Always keyword character [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
Keyword <- R6::R6Class(
  "Keyword",
  public = list(
    `bid` = NULL,
    `match_type` = NULL,
    `value` = NULL,
    `archived` = NULL,
    `id` = NULL,
    `parent_id` = NULL,
    `parent_type` = NULL,
    `type` = NULL,

    #' @description
    #' Initialize a new Keyword class.
    #'
    #' @param match_type match_type
    #' @param value Keyword value (120 chars max).
    #' @param bid </p><strong>Note:</strong> bid field has been deprecated. Input will not be set and field will return null. Keyword custom bid in microcurrency - null if inherited from parent ad group.
    #' @param archived archived
    #' @param id Keyword ID .
    #' @param parent_id Keyword parent entity ID (advertiser, campaign, ad group).
    #' @param parent_type Parent entity type
    #' @param type Always keyword
    #' @param ... Other optional arguments.
    initialize = function(`match_type`, `value`, `bid` = NULL, `archived` = NULL, `id` = NULL, `parent_id` = NULL, `parent_type` = NULL, `type` = NULL, ...) {
      if (!missing(`match_type`)) {
        if (!(`match_type` %in% c())) {
          stop(paste("Error! \"", `match_type`, "\" cannot be assigned to `match_type`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`match_type`))
        self$`match_type` <- `match_type`
      }
      if (!missing(`value`)) {
        if (!(is.character(`value`) && length(`value`) == 1)) {
          stop(paste("Error! Invalid data for `value`. Must be a string:", `value`))
        }
        self$`value` <- `value`
      }
      if (!is.null(`bid`)) {
        if (!(is.numeric(`bid`) && length(`bid`) == 1)) {
          stop(paste("Error! Invalid data for `bid`. Must be an integer:", `bid`))
        }
        self$`bid` <- `bid`
      }
      if (!is.null(`archived`)) {
        if (!(is.logical(`archived`) && length(`archived`) == 1)) {
          stop(paste("Error! Invalid data for `archived`. Must be a boolean:", `archived`))
        }
        self$`archived` <- `archived`
      }
      if (!is.null(`id`)) {
        if (!(is.character(`id`) && length(`id`) == 1)) {
          stop(paste("Error! Invalid data for `id`. Must be a string:", `id`))
        }
        self$`id` <- `id`
      }
      if (!is.null(`parent_id`)) {
        if (!(is.character(`parent_id`) && length(`parent_id`) == 1)) {
          stop(paste("Error! Invalid data for `parent_id`. Must be a string:", `parent_id`))
        }
        self$`parent_id` <- `parent_id`
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
    #' To JSON String
    #'
    #' @return Keyword in JSON format
    toJSON = function() {
      KeywordObject <- list()
      if (!is.null(self$`bid`)) {
        KeywordObject[["bid"]] <-
          self$`bid`
      }
      if (!is.null(self$`match_type`)) {
        KeywordObject[["match_type"]] <-
          self$`match_type`$toJSON()
      }
      if (!is.null(self$`value`)) {
        KeywordObject[["value"]] <-
          self$`value`
      }
      if (!is.null(self$`archived`)) {
        KeywordObject[["archived"]] <-
          self$`archived`
      }
      if (!is.null(self$`id`)) {
        KeywordObject[["id"]] <-
          self$`id`
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
      KeywordObject
    },

    #' @description
    #' Deserialize JSON string into an instance of Keyword
    #'
    #' @param input_json the JSON input
    #' @return the instance of Keyword
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`bid`)) {
        self$`bid` <- this_object$`bid`
      }
      if (!is.null(this_object$`match_type`)) {
        `match_type_object` <- MatchTypeResponse$new()
        `match_type_object`$fromJSON(jsonlite::toJSON(this_object$`match_type`, auto_unbox = TRUE, digits = NA))
        self$`match_type` <- `match_type_object`
      }
      if (!is.null(this_object$`value`)) {
        self$`value` <- this_object$`value`
      }
      if (!is.null(this_object$`archived`)) {
        self$`archived` <- this_object$`archived`
      }
      if (!is.null(this_object$`id`)) {
        self$`id` <- this_object$`id`
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
      self
    },

    #' @description
    #' To JSON String
    #'
    #' @return Keyword in JSON format
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`bid`)) {
          sprintf(
          '"bid":
            %d
                    ',
          self$`bid`
          )
        },
        if (!is.null(self$`match_type`)) {
          sprintf(
          '"match_type":
          %s
          ',
          jsonlite::toJSON(self$`match_type`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`value`)) {
          sprintf(
          '"value":
            "%s"
                    ',
          self$`value`
          )
        },
        if (!is.null(self$`archived`)) {
          sprintf(
          '"archived":
            %s
                    ',
          tolower(self$`archived`)
          )
        },
        if (!is.null(self$`id`)) {
          sprintf(
          '"id":
            "%s"
                    ',
          self$`id`
          )
        },
        if (!is.null(self$`parent_id`)) {
          sprintf(
          '"parent_id":
            "%s"
                    ',
          self$`parent_id`
          )
        },
        if (!is.null(self$`parent_type`)) {
          sprintf(
          '"parent_type":
            "%s"
                    ',
          self$`parent_type`
          )
        },
        if (!is.null(self$`type`)) {
          sprintf(
          '"type":
            "%s"
                    ',
          self$`type`
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },

    #' @description
    #' Deserialize JSON string into an instance of Keyword
    #'
    #' @param input_json the JSON input
    #' @return the instance of Keyword
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`bid` <- this_object$`bid`
      self$`match_type` <- MatchTypeResponse$new()$fromJSON(jsonlite::toJSON(this_object$`match_type`, auto_unbox = TRUE, digits = NA))
      self$`value` <- this_object$`value`
      self$`archived` <- this_object$`archived`
      self$`id` <- this_object$`id`
      self$`parent_id` <- this_object$`parent_id`
      self$`parent_type` <- this_object$`parent_type`
      self$`type` <- this_object$`type`
      self
    },

    #' @description
    #' Validate JSON input with respect to Keyword and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `match_type`
      if (!is.null(input_json$`match_type`)) {
        stopifnot(R6::is.R6(input_json$`match_type`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for Keyword: the required field `match_type` is missing."))
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
      # check if the required `value` is null
      if (is.null(self$`value`)) {
        return(FALSE)
      }

      if (!str_detect(self$`id`, "^\\d+$")) {
        return(FALSE)
      }

      if (!str_detect(self$`parent_id`, "^\\d+$")) {
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
      # check if the required `value` is null
      if (is.null(self$`value`)) {
        invalid_fields["value"] <- "Non-nullable required field `value` cannot be null."
      }

      if (!str_detect(self$`id`, "^\\d+$")) {
        invalid_fields["id"] <- "Invalid value for `id`, must conform to the pattern ^\\d+$."
      }

      if (!str_detect(self$`parent_id`, "^\\d+$")) {
        invalid_fields["parent_id"] <- "Invalid value for `parent_id`, must conform to the pattern ^\\d+$."
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

