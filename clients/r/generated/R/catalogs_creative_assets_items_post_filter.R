#' Create a new CatalogsCreativeAssetsItemsPostFilter
#'
#' @description
#' CatalogsCreativeAssetsItemsPostFilter Class
#'
#' @docType class
#' @title CatalogsCreativeAssetsItemsPostFilter
#' @description CatalogsCreativeAssetsItemsPostFilter Class
#' @format An \code{R6Class} generator object
#' @field catalog_type  character
#' @field creative_assets_ids  list(character)
#' @field catalog_id Catalog id pertaining to the creative assets item. If not provided, default to oldest creative assets catalog character [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
CatalogsCreativeAssetsItemsPostFilter <- R6::R6Class(
  "CatalogsCreativeAssetsItemsPostFilter",
  public = list(
    `catalog_type` = NULL,
    `creative_assets_ids` = NULL,
    `catalog_id` = NULL,

    #' @description
    #' Initialize a new CatalogsCreativeAssetsItemsPostFilter class.
    #'
    #' @param catalog_type catalog_type
    #' @param creative_assets_ids creative_assets_ids
    #' @param catalog_id Catalog id pertaining to the creative assets item. If not provided, default to oldest creative assets catalog
    #' @param ... Other optional arguments.
    initialize = function(`catalog_type`, `creative_assets_ids`, `catalog_id` = NULL, ...) {
      if (!missing(`catalog_type`)) {
        if (!(`catalog_type` %in% c("CREATIVE_ASSETS"))) {
          stop(paste("Error! \"", `catalog_type`, "\" cannot be assigned to `catalog_type`. Must be \"CREATIVE_ASSETS\".", sep = ""))
        }
        if (!(is.character(`catalog_type`) && length(`catalog_type`) == 1)) {
          stop(paste("Error! Invalid data for `catalog_type`. Must be a string:", `catalog_type`))
        }
        self$`catalog_type` <- `catalog_type`
      }
      if (!missing(`creative_assets_ids`)) {
        stopifnot(is.vector(`creative_assets_ids`), length(`creative_assets_ids`) != 0)
        sapply(`creative_assets_ids`, function(x) stopifnot(is.character(x)))
        self$`creative_assets_ids` <- `creative_assets_ids`
      }
      if (!is.null(`catalog_id`)) {
        if (!(is.character(`catalog_id`) && length(`catalog_id`) == 1)) {
          stop(paste("Error! Invalid data for `catalog_id`. Must be a string:", `catalog_id`))
        }
        self$`catalog_id` <- `catalog_id`
      }
    },

    #' @description
    #' To JSON String
    #'
    #' @return CatalogsCreativeAssetsItemsPostFilter in JSON format
    toJSON = function() {
      CatalogsCreativeAssetsItemsPostFilterObject <- list()
      if (!is.null(self$`catalog_type`)) {
        CatalogsCreativeAssetsItemsPostFilterObject[["catalog_type"]] <-
          self$`catalog_type`
      }
      if (!is.null(self$`creative_assets_ids`)) {
        CatalogsCreativeAssetsItemsPostFilterObject[["creative_assets_ids"]] <-
          self$`creative_assets_ids`
      }
      if (!is.null(self$`catalog_id`)) {
        CatalogsCreativeAssetsItemsPostFilterObject[["catalog_id"]] <-
          self$`catalog_id`
      }
      CatalogsCreativeAssetsItemsPostFilterObject
    },

    #' @description
    #' Deserialize JSON string into an instance of CatalogsCreativeAssetsItemsPostFilter
    #'
    #' @param input_json the JSON input
    #' @return the instance of CatalogsCreativeAssetsItemsPostFilter
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`catalog_type`)) {
        if (!is.null(this_object$`catalog_type`) && !(this_object$`catalog_type` %in% c("CREATIVE_ASSETS"))) {
          stop(paste("Error! \"", this_object$`catalog_type`, "\" cannot be assigned to `catalog_type`. Must be \"CREATIVE_ASSETS\".", sep = ""))
        }
        self$`catalog_type` <- this_object$`catalog_type`
      }
      if (!is.null(this_object$`creative_assets_ids`)) {
        self$`creative_assets_ids` <- ApiClient$new()$deserializeObj(this_object$`creative_assets_ids`, "array[character]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`catalog_id`)) {
        self$`catalog_id` <- this_object$`catalog_id`
      }
      self
    },

    #' @description
    #' To JSON String
    #'
    #' @return CatalogsCreativeAssetsItemsPostFilter in JSON format
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
        if (!is.null(self$`creative_assets_ids`)) {
          sprintf(
          '"creative_assets_ids":
             [%s]
          ',
          paste(unlist(lapply(self$`creative_assets_ids`, function(x) paste0('"', x, '"'))), collapse = ",")
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

    #' @description
    #' Deserialize JSON string into an instance of CatalogsCreativeAssetsItemsPostFilter
    #'
    #' @param input_json the JSON input
    #' @return the instance of CatalogsCreativeAssetsItemsPostFilter
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`catalog_type`) && !(this_object$`catalog_type` %in% c("CREATIVE_ASSETS"))) {
        stop(paste("Error! \"", this_object$`catalog_type`, "\" cannot be assigned to `catalog_type`. Must be \"CREATIVE_ASSETS\".", sep = ""))
      }
      self$`catalog_type` <- this_object$`catalog_type`
      self$`creative_assets_ids` <- ApiClient$new()$deserializeObj(this_object$`creative_assets_ids`, "array[character]", loadNamespace("openapi"))
      self$`catalog_id` <- this_object$`catalog_id`
      self
    },

    #' @description
    #' Validate JSON input with respect to CatalogsCreativeAssetsItemsPostFilter and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `catalog_type`
      if (!is.null(input_json$`catalog_type`)) {
        if (!(is.character(input_json$`catalog_type`) && length(input_json$`catalog_type`) == 1)) {
          stop(paste("Error! Invalid data for `catalog_type`. Must be a string:", input_json$`catalog_type`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CatalogsCreativeAssetsItemsPostFilter: the required field `catalog_type` is missing."))
      }
      # check the required field `creative_assets_ids`
      if (!is.null(input_json$`creative_assets_ids`)) {
        stopifnot(is.vector(input_json$`creative_assets_ids`), length(input_json$`creative_assets_ids`) != 0)
        tmp <- sapply(input_json$`creative_assets_ids`, function(x) stopifnot(is.character(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CatalogsCreativeAssetsItemsPostFilter: the required field `creative_assets_ids` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of CatalogsCreativeAssetsItemsPostFilter
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `catalog_type` is null
      if (is.null(self$`catalog_type`)) {
        return(FALSE)
      }

      # check if the required `creative_assets_ids` is null
      if (is.null(self$`creative_assets_ids`)) {
        return(FALSE)
      }

      if (length(self$`creative_assets_ids`) > 1000) {
        return(FALSE)
      }
      if (length(self$`creative_assets_ids`) < 1) {
        return(FALSE)
      }

      if (!str_detect(self$`catalog_id`, "^\\d+$")) {
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
      # check if the required `catalog_type` is null
      if (is.null(self$`catalog_type`)) {
        invalid_fields["catalog_type"] <- "Non-nullable required field `catalog_type` cannot be null."
      }

      # check if the required `creative_assets_ids` is null
      if (is.null(self$`creative_assets_ids`)) {
        invalid_fields["creative_assets_ids"] <- "Non-nullable required field `creative_assets_ids` cannot be null."
      }

      if (length(self$`creative_assets_ids`) > 1000) {
        invalid_fields["creative_assets_ids"] <- "Invalid length for `creative_assets_ids`, number of items must be less than or equal to 1000."
      }
      if (length(self$`creative_assets_ids`) < 1) {
        invalid_fields["creative_assets_ids"] <- "Invalid length for ``, number of items must be greater than or equal to 1."
      }

      if (!str_detect(self$`catalog_id`, "^\\d+$")) {
        invalid_fields["catalog_id"] <- "Invalid value for `catalog_id`, must conform to the pattern ^\\d+$."
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
# CatalogsCreativeAssetsItemsPostFilter$unlock()
#
## Below is an example to define the print function
# CatalogsCreativeAssetsItemsPostFilter$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# CatalogsCreativeAssetsItemsPostFilter$lock()

