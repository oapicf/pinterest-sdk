#' Create a new CatalogsRetailItemsFilter
#'
#' @description
#' CatalogsRetailItemsFilter Class
#'
#' @docType class
#' @title CatalogsRetailItemsFilter
#' @description CatalogsRetailItemsFilter Class
#' @format An \code{R6Class} generator object
#' @field catalog_type  character
#' @field item_ids  list(character)
#' @field catalog_id Catalog id pertaining to the retail item. If not provided, default to oldest retail catalog character [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
CatalogsRetailItemsFilter <- R6::R6Class(
  "CatalogsRetailItemsFilter",
  public = list(
    `catalog_type` = NULL,
    `item_ids` = NULL,
    `catalog_id` = NULL,
    #' Initialize a new CatalogsRetailItemsFilter class.
    #'
    #' @description
    #' Initialize a new CatalogsRetailItemsFilter class.
    #'
    #' @param catalog_type catalog_type
    #' @param item_ids item_ids
    #' @param catalog_id Catalog id pertaining to the retail item. If not provided, default to oldest retail catalog
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`catalog_type`, `item_ids`, `catalog_id` = NULL, ...) {
      if (!missing(`catalog_type`)) {
        if (!(`catalog_type` %in% c("RETAIL"))) {
          stop(paste("Error! \"", `catalog_type`, "\" cannot be assigned to `catalog_type`. Must be \"RETAIL\".", sep = ""))
        }
        if (!(is.character(`catalog_type`) && length(`catalog_type`) == 1)) {
          stop(paste("Error! Invalid data for `catalog_type`. Must be a string:", `catalog_type`))
        }
        self$`catalog_type` <- `catalog_type`
      }
      if (!missing(`item_ids`)) {
        stopifnot(is.vector(`item_ids`), length(`item_ids`) != 0)
        sapply(`item_ids`, function(x) stopifnot(is.character(x)))
        self$`item_ids` <- `item_ids`
      }
      if (!is.null(`catalog_id`)) {
        if (!(is.character(`catalog_id`) && length(`catalog_id`) == 1)) {
          stop(paste("Error! Invalid data for `catalog_id`. Must be a string:", `catalog_id`))
        }
        self$`catalog_id` <- `catalog_id`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return CatalogsRetailItemsFilter in JSON format
    #' @export
    toJSON = function() {
      CatalogsRetailItemsFilterObject <- list()
      if (!is.null(self$`catalog_type`)) {
        CatalogsRetailItemsFilterObject[["catalog_type"]] <-
          self$`catalog_type`
      }
      if (!is.null(self$`item_ids`)) {
        CatalogsRetailItemsFilterObject[["item_ids"]] <-
          self$`item_ids`
      }
      if (!is.null(self$`catalog_id`)) {
        CatalogsRetailItemsFilterObject[["catalog_id"]] <-
          self$`catalog_id`
      }
      CatalogsRetailItemsFilterObject
    },
    #' Deserialize JSON string into an instance of CatalogsRetailItemsFilter
    #'
    #' @description
    #' Deserialize JSON string into an instance of CatalogsRetailItemsFilter
    #'
    #' @param input_json the JSON input
    #' @return the instance of CatalogsRetailItemsFilter
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`catalog_type`)) {
        if (!is.null(this_object$`catalog_type`) && !(this_object$`catalog_type` %in% c("RETAIL"))) {
          stop(paste("Error! \"", this_object$`catalog_type`, "\" cannot be assigned to `catalog_type`. Must be \"RETAIL\".", sep = ""))
        }
        self$`catalog_type` <- this_object$`catalog_type`
      }
      if (!is.null(this_object$`item_ids`)) {
        self$`item_ids` <- ApiClient$new()$deserializeObj(this_object$`item_ids`, "array[character]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`catalog_id`)) {
        self$`catalog_id` <- this_object$`catalog_id`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return CatalogsRetailItemsFilter in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`catalog_type`)) {
          sprintf(
          '"catalog_type":
            "%s"
                    ',
          self$`catalog_type`
          )
        },
        if (!is.null(self$`item_ids`)) {
          sprintf(
          '"item_ids":
             [%s]
          ',
          paste(unlist(lapply(self$`item_ids`, function(x) paste0('"', x, '"'))), collapse = ",")
          )
        },
        if (!is.null(self$`catalog_id`)) {
          sprintf(
          '"catalog_id":
            "%s"
                    ',
          self$`catalog_id`
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of CatalogsRetailItemsFilter
    #'
    #' @description
    #' Deserialize JSON string into an instance of CatalogsRetailItemsFilter
    #'
    #' @param input_json the JSON input
    #' @return the instance of CatalogsRetailItemsFilter
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`catalog_type`) && !(this_object$`catalog_type` %in% c("RETAIL"))) {
        stop(paste("Error! \"", this_object$`catalog_type`, "\" cannot be assigned to `catalog_type`. Must be \"RETAIL\".", sep = ""))
      }
      self$`catalog_type` <- this_object$`catalog_type`
      self$`item_ids` <- ApiClient$new()$deserializeObj(this_object$`item_ids`, "array[character]", loadNamespace("openapi"))
      self$`catalog_id` <- this_object$`catalog_id`
      self
    },
    #' Validate JSON input with respect to CatalogsRetailItemsFilter
    #'
    #' @description
    #' Validate JSON input with respect to CatalogsRetailItemsFilter and throw an exception if invalid
    #'
    #' @param input the JSON input
    #' @export
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `catalog_type`
      if (!is.null(input_json$`catalog_type`)) {
        if (!(is.character(input_json$`catalog_type`) && length(input_json$`catalog_type`) == 1)) {
          stop(paste("Error! Invalid data for `catalog_type`. Must be a string:", input_json$`catalog_type`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CatalogsRetailItemsFilter: the required field `catalog_type` is missing."))
      }
      # check the required field `item_ids`
      if (!is.null(input_json$`item_ids`)) {
        stopifnot(is.vector(input_json$`item_ids`), length(input_json$`item_ids`) != 0)
        tmp <- sapply(input_json$`item_ids`, function(x) stopifnot(is.character(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CatalogsRetailItemsFilter: the required field `item_ids` is missing."))
      }
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of CatalogsRetailItemsFilter
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
      # check if the required `catalog_type` is null
      if (is.null(self$`catalog_type`)) {
        return(FALSE)
      }

      # check if the required `item_ids` is null
      if (is.null(self$`item_ids`)) {
        return(FALSE)
      }

      if (length(self$`item_ids`) > 100) {
        return(FALSE)
      }
      if (length(self$`item_ids`) < 1) {
        return(FALSE)
      }

      if (!str_detect(self$`catalog_id`, "^\\d+$")) {
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
      # check if the required `catalog_type` is null
      if (is.null(self$`catalog_type`)) {
        invalid_fields["catalog_type"] <- "Non-nullable required field `catalog_type` cannot be null."
      }

      # check if the required `item_ids` is null
      if (is.null(self$`item_ids`)) {
        invalid_fields["item_ids"] <- "Non-nullable required field `item_ids` cannot be null."
      }

      if (length(self$`item_ids`) > 100) {
        invalid_fields["item_ids"] <- "Invalid length for `item_ids`, number of items must be less than or equal to 100."
      }
      if (length(self$`item_ids`) < 1) {
        invalid_fields["item_ids"] <- "Invalid length for ``, number of items must be greater than or equal to 1."
      }

      if (!str_detect(self$`catalog_id`, "^\\d+$")) {
        invalid_fields["catalog_id"] <- "Invalid value for `catalog_id`, must conform to the pattern ^\\d+$."
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
# CatalogsRetailItemsFilter$unlock()
#
## Below is an example to define the print function
# CatalogsRetailItemsFilter$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# CatalogsRetailItemsFilter$lock()

