#' Create a new CatalogsProductMetadata
#'
#' @description
#' Product metadata entity
#'
#' @docType class
#' @title CatalogsProductMetadata
#' @description CatalogsProductMetadata Class
#' @format An \code{R6Class} generator object
#' @field item_id The user-created unique ID that represents the product. character
#' @field item_group_id The parent ID of the product. character
#' @field availability  \link{NonNullableProductAvailabilityType}
#' @field price The price of the product. numeric
#' @field sale_price The discounted price of the product. numeric
#' @field currency  \link{NonNullableCatalogsCurrency}
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
CatalogsProductMetadata <- R6::R6Class(
  "CatalogsProductMetadata",
  public = list(
    `item_id` = NULL,
    `item_group_id` = NULL,
    `availability` = NULL,
    `price` = NULL,
    `sale_price` = NULL,
    `currency` = NULL,
    #' Initialize a new CatalogsProductMetadata class.
    #'
    #' @description
    #' Initialize a new CatalogsProductMetadata class.
    #'
    #' @param item_id The user-created unique ID that represents the product.
    #' @param item_group_id The parent ID of the product.
    #' @param availability availability
    #' @param price The price of the product.
    #' @param sale_price The discounted price of the product.
    #' @param currency currency
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`item_id`, `item_group_id`, `availability`, `price`, `sale_price`, `currency`, ...) {
      if (!missing(`item_id`)) {
        if (!(is.character(`item_id`) && length(`item_id`) == 1)) {
          stop(paste("Error! Invalid data for `item_id`. Must be a string:", `item_id`))
        }
        self$`item_id` <- `item_id`
      }
      if (!missing(`item_group_id`)) {
        if (!(is.character(`item_group_id`) && length(`item_group_id`) == 1)) {
          stop(paste("Error! Invalid data for `item_group_id`. Must be a string:", `item_group_id`))
        }
        self$`item_group_id` <- `item_group_id`
      }
      if (!missing(`availability`)) {
        if (!(`availability` %in% c())) {
          stop(paste("Error! \"", `availability`, "\" cannot be assigned to `availability`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`availability`))
        self$`availability` <- `availability`
      }
      if (!missing(`price`)) {
        self$`price` <- `price`
      }
      if (!missing(`sale_price`)) {
        self$`sale_price` <- `sale_price`
      }
      if (!missing(`currency`)) {
        if (!(`currency` %in% c())) {
          stop(paste("Error! \"", `currency`, "\" cannot be assigned to `currency`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`currency`))
        self$`currency` <- `currency`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return CatalogsProductMetadata in JSON format
    #' @export
    toJSON = function() {
      CatalogsProductMetadataObject <- list()
      if (!is.null(self$`item_id`)) {
        CatalogsProductMetadataObject[["item_id"]] <-
          self$`item_id`
      }
      if (!is.null(self$`item_group_id`)) {
        CatalogsProductMetadataObject[["item_group_id"]] <-
          self$`item_group_id`
      }
      if (!is.null(self$`availability`)) {
        CatalogsProductMetadataObject[["availability"]] <-
          self$`availability`$toJSON()
      }
      if (!is.null(self$`price`)) {
        CatalogsProductMetadataObject[["price"]] <-
          self$`price`
      }
      if (!is.null(self$`sale_price`)) {
        CatalogsProductMetadataObject[["sale_price"]] <-
          self$`sale_price`
      }
      if (!is.null(self$`currency`)) {
        CatalogsProductMetadataObject[["currency"]] <-
          self$`currency`$toJSON()
      }
      CatalogsProductMetadataObject
    },
    #' Deserialize JSON string into an instance of CatalogsProductMetadata
    #'
    #' @description
    #' Deserialize JSON string into an instance of CatalogsProductMetadata
    #'
    #' @param input_json the JSON input
    #' @return the instance of CatalogsProductMetadata
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`item_id`)) {
        self$`item_id` <- this_object$`item_id`
      }
      if (!is.null(this_object$`item_group_id`)) {
        self$`item_group_id` <- this_object$`item_group_id`
      }
      if (!is.null(this_object$`availability`)) {
        `availability_object` <- NonNullableProductAvailabilityType$new()
        `availability_object`$fromJSON(jsonlite::toJSON(this_object$`availability`, auto_unbox = TRUE, digits = NA))
        self$`availability` <- `availability_object`
      }
      if (!is.null(this_object$`price`)) {
        self$`price` <- this_object$`price`
      }
      if (!is.null(this_object$`sale_price`)) {
        self$`sale_price` <- this_object$`sale_price`
      }
      if (!is.null(this_object$`currency`)) {
        `currency_object` <- NonNullableCatalogsCurrency$new()
        `currency_object`$fromJSON(jsonlite::toJSON(this_object$`currency`, auto_unbox = TRUE, digits = NA))
        self$`currency` <- `currency_object`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return CatalogsProductMetadata in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`item_id`)) {
          sprintf(
          '"item_id":
            "%s"
                    ',
          self$`item_id`
          )
        },
        if (!is.null(self$`item_group_id`)) {
          sprintf(
          '"item_group_id":
            "%s"
                    ',
          self$`item_group_id`
          )
        },
        if (!is.null(self$`availability`)) {
          sprintf(
          '"availability":
          %s
          ',
          jsonlite::toJSON(self$`availability`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`price`)) {
          sprintf(
          '"price":
            %d
                    ',
          self$`price`
          )
        },
        if (!is.null(self$`sale_price`)) {
          sprintf(
          '"sale_price":
            %d
                    ',
          self$`sale_price`
          )
        },
        if (!is.null(self$`currency`)) {
          sprintf(
          '"currency":
          %s
          ',
          jsonlite::toJSON(self$`currency`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of CatalogsProductMetadata
    #'
    #' @description
    #' Deserialize JSON string into an instance of CatalogsProductMetadata
    #'
    #' @param input_json the JSON input
    #' @return the instance of CatalogsProductMetadata
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`item_id` <- this_object$`item_id`
      self$`item_group_id` <- this_object$`item_group_id`
      self$`availability` <- NonNullableProductAvailabilityType$new()$fromJSON(jsonlite::toJSON(this_object$`availability`, auto_unbox = TRUE, digits = NA))
      self$`price` <- this_object$`price`
      self$`sale_price` <- this_object$`sale_price`
      self$`currency` <- NonNullableCatalogsCurrency$new()$fromJSON(jsonlite::toJSON(this_object$`currency`, auto_unbox = TRUE, digits = NA))
      self
    },
    #' Validate JSON input with respect to CatalogsProductMetadata
    #'
    #' @description
    #' Validate JSON input with respect to CatalogsProductMetadata and throw an exception if invalid
    #'
    #' @param input the JSON input
    #' @export
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `item_id`
      if (!is.null(input_json$`item_id`)) {
        if (!(is.character(input_json$`item_id`) && length(input_json$`item_id`) == 1)) {
          stop(paste("Error! Invalid data for `item_id`. Must be a string:", input_json$`item_id`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CatalogsProductMetadata: the required field `item_id` is missing."))
      }
      # check the required field `item_group_id`
      if (!is.null(input_json$`item_group_id`)) {
        if (!(is.character(input_json$`item_group_id`) && length(input_json$`item_group_id`) == 1)) {
          stop(paste("Error! Invalid data for `item_group_id`. Must be a string:", input_json$`item_group_id`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CatalogsProductMetadata: the required field `item_group_id` is missing."))
      }
      # check the required field `availability`
      if (!is.null(input_json$`availability`)) {
        stopifnot(R6::is.R6(input_json$`availability`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CatalogsProductMetadata: the required field `availability` is missing."))
      }
      # check the required field `price`
      if (!is.null(input_json$`price`)) {
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CatalogsProductMetadata: the required field `price` is missing."))
      }
      # check the required field `sale_price`
      if (!is.null(input_json$`sale_price`)) {
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CatalogsProductMetadata: the required field `sale_price` is missing."))
      }
      # check the required field `currency`
      if (!is.null(input_json$`currency`)) {
        stopifnot(R6::is.R6(input_json$`currency`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CatalogsProductMetadata: the required field `currency` is missing."))
      }
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of CatalogsProductMetadata
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
      # check if the required `item_id` is null
      if (is.null(self$`item_id`)) {
        return(FALSE)
      }

      # check if the required `availability` is null
      if (is.null(self$`availability`)) {
        return(FALSE)
      }

      # check if the required `price` is null
      if (is.null(self$`price`)) {
        return(FALSE)
      }

      # check if the required `currency` is null
      if (is.null(self$`currency`)) {
        return(FALSE)
      }

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
      # check if the required `item_id` is null
      if (is.null(self$`item_id`)) {
        invalid_fields["item_id"] <- "Non-nullable required field `item_id` cannot be null."
      }

      # check if the required `availability` is null
      if (is.null(self$`availability`)) {
        invalid_fields["availability"] <- "Non-nullable required field `availability` cannot be null."
      }

      # check if the required `price` is null
      if (is.null(self$`price`)) {
        invalid_fields["price"] <- "Non-nullable required field `price` cannot be null."
      }

      # check if the required `currency` is null
      if (is.null(self$`currency`)) {
        invalid_fields["currency"] <- "Non-nullable required field `currency` cannot be null."
      }

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
# CatalogsProductMetadata$unlock()
#
## Below is an example to define the print function
# CatalogsProductMetadata$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# CatalogsProductMetadata$lock()

