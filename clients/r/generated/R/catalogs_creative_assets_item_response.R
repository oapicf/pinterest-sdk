#' Create a new CatalogsCreativeAssetsItemResponse
#'
#' @description
#' Object describing a hotel record
#'
#' @docType class
#' @title CatalogsCreativeAssetsItemResponse
#' @description CatalogsCreativeAssetsItemResponse Class
#' @format An \code{R6Class} generator object
#' @field attributes  \link{CatalogsCreativeAssetsAttributes} [optional]
#' @field catalog_type  \link{CatalogsType}
#' @field creative_assets_id The catalog creative assets id in the merchant namespace character [optional]
#' @field pins The pins mapped to the item list(\link{Pin}) [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
CatalogsCreativeAssetsItemResponse <- R6::R6Class(
  "CatalogsCreativeAssetsItemResponse",
  public = list(
    `attributes` = NULL,
    `catalog_type` = NULL,
    `creative_assets_id` = NULL,
    `pins` = NULL,

    #' @description
    #' Initialize a new CatalogsCreativeAssetsItemResponse class.
    #'
    #' @param catalog_type catalog_type
    #' @param attributes attributes
    #' @param creative_assets_id The catalog creative assets id in the merchant namespace
    #' @param pins The pins mapped to the item
    #' @param ... Other optional arguments.
    initialize = function(`catalog_type`, `attributes` = NULL, `creative_assets_id` = NULL, `pins` = NULL, ...) {
      if (!missing(`catalog_type`)) {
        if (!(`catalog_type` %in% c())) {
          stop(paste("Error! \"", `catalog_type`, "\" cannot be assigned to `catalog_type`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`catalog_type`))
        self$`catalog_type` <- `catalog_type`
      }
      if (!is.null(`attributes`)) {
        stopifnot(R6::is.R6(`attributes`))
        self$`attributes` <- `attributes`
      }
      if (!is.null(`creative_assets_id`)) {
        if (!(is.character(`creative_assets_id`) && length(`creative_assets_id`) == 1)) {
          stop(paste("Error! Invalid data for `creative_assets_id`. Must be a string:", `creative_assets_id`))
        }
        self$`creative_assets_id` <- `creative_assets_id`
      }
      if (!is.null(`pins`)) {
        stopifnot(is.vector(`pins`), length(`pins`) != 0)
        sapply(`pins`, function(x) stopifnot(R6::is.R6(x)))
        self$`pins` <- `pins`
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
    #' @return CatalogsCreativeAssetsItemResponse as a base R list.
    #' @examples
    #' # convert array of CatalogsCreativeAssetsItemResponse (x) to a data frame
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
    #' Convert CatalogsCreativeAssetsItemResponse to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      CatalogsCreativeAssetsItemResponseObject <- list()
      if (!is.null(self$`attributes`)) {
        CatalogsCreativeAssetsItemResponseObject[["attributes"]] <-
          self$`attributes`$toSimpleType()
      }
      if (!is.null(self$`catalog_type`)) {
        CatalogsCreativeAssetsItemResponseObject[["catalog_type"]] <-
          self$`catalog_type`$toSimpleType()
      }
      if (!is.null(self$`creative_assets_id`)) {
        CatalogsCreativeAssetsItemResponseObject[["creative_assets_id"]] <-
          self$`creative_assets_id`
      }
      if (!is.null(self$`pins`)) {
        CatalogsCreativeAssetsItemResponseObject[["pins"]] <-
          lapply(self$`pins`, function(x) x$toSimpleType())
      }
      return(CatalogsCreativeAssetsItemResponseObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of CatalogsCreativeAssetsItemResponse
    #'
    #' @param input_json the JSON input
    #' @return the instance of CatalogsCreativeAssetsItemResponse
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`attributes`)) {
        `attributes_object` <- CatalogsCreativeAssetsAttributes$new()
        `attributes_object`$fromJSON(jsonlite::toJSON(this_object$`attributes`, auto_unbox = TRUE, digits = NA))
        self$`attributes` <- `attributes_object`
      }
      if (!is.null(this_object$`catalog_type`)) {
        `catalog_type_object` <- CatalogsType$new()
        `catalog_type_object`$fromJSON(jsonlite::toJSON(this_object$`catalog_type`, auto_unbox = TRUE, digits = NA))
        self$`catalog_type` <- `catalog_type_object`
      }
      if (!is.null(this_object$`creative_assets_id`)) {
        self$`creative_assets_id` <- this_object$`creative_assets_id`
      }
      if (!is.null(this_object$`pins`)) {
        self$`pins` <- ApiClient$new()$deserializeObj(this_object$`pins`, "array[Pin]", loadNamespace("openapi"))
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return CatalogsCreativeAssetsItemResponse in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of CatalogsCreativeAssetsItemResponse
    #'
    #' @param input_json the JSON input
    #' @return the instance of CatalogsCreativeAssetsItemResponse
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`attributes` <- CatalogsCreativeAssetsAttributes$new()$fromJSON(jsonlite::toJSON(this_object$`attributes`, auto_unbox = TRUE, digits = NA))
      self$`catalog_type` <- CatalogsType$new()$fromJSON(jsonlite::toJSON(this_object$`catalog_type`, auto_unbox = TRUE, digits = NA))
      self$`creative_assets_id` <- this_object$`creative_assets_id`
      self$`pins` <- ApiClient$new()$deserializeObj(this_object$`pins`, "array[Pin]", loadNamespace("openapi"))
      self
    },

    #' @description
    #' Validate JSON input with respect to CatalogsCreativeAssetsItemResponse and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `catalog_type`
      if (!is.null(input_json$`catalog_type`)) {
        stopifnot(R6::is.R6(input_json$`catalog_type`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CatalogsCreativeAssetsItemResponse: the required field `catalog_type` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of CatalogsCreativeAssetsItemResponse
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

      if (length(self$`pins`) > 11) {
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

      if (length(self$`pins`) > 11) {
        invalid_fields["pins"] <- "Invalid length for `pins`, number of items must be less than or equal to 11."
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
# CatalogsCreativeAssetsItemResponse$unlock()
#
## Below is an example to define the print function
# CatalogsCreativeAssetsItemResponse$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# CatalogsCreativeAssetsItemResponse$lock()

