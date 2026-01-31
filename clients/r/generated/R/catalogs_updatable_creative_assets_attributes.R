#' Create a new CatalogsUpdatableCreativeAssetsAttributes
#'
#' @description
#' CatalogsUpdatableCreativeAssetsAttributes Class
#'
#' @docType class
#' @title CatalogsUpdatableCreativeAssetsAttributes
#' @description CatalogsUpdatableCreativeAssetsAttributes Class
#' @format An \code{R6Class} generator object
#' @field android_deep_link Link to the creative assets page. character [optional]
#' @field custom_label_0 Custom grouping of creative assets. character [optional]
#' @field custom_label_1 Custom grouping of creative assets. character [optional]
#' @field custom_label_2 Custom grouping of creative assets. character [optional]
#' @field custom_label_3 Custom grouping of creative assets. character [optional]
#' @field custom_label_4 Custom grouping of creative assets. character [optional]
#' @field description Brief description of the creative assets. character [optional]
#' @field google_product_category The categorization of the product based on the standardized Google Product Taxonomy. This is a set taxonomy. Both the text values and numeric codes are accepted. character [optional]
#' @field ios_deep_link IOS deep link to the creative assets page. character [optional]
#' @field link Link to the creative assets page. character [optional]
#' @field title The name of the creative assets. character [optional]
#' @field visibility Visibility of the creative assets. Must be one of the following values (upper or lowercase): ‘visible’, ‘hidden’. character [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
CatalogsUpdatableCreativeAssetsAttributes <- R6::R6Class(
  "CatalogsUpdatableCreativeAssetsAttributes",
  public = list(
    `android_deep_link` = NULL,
    `custom_label_0` = NULL,
    `custom_label_1` = NULL,
    `custom_label_2` = NULL,
    `custom_label_3` = NULL,
    `custom_label_4` = NULL,
    `description` = NULL,
    `google_product_category` = NULL,
    `ios_deep_link` = NULL,
    `link` = NULL,
    `title` = NULL,
    `visibility` = NULL,

    #' @description
    #' Initialize a new CatalogsUpdatableCreativeAssetsAttributes class.
    #'
    #' @param android_deep_link Link to the creative assets page.
    #' @param custom_label_0 Custom grouping of creative assets.
    #' @param custom_label_1 Custom grouping of creative assets.
    #' @param custom_label_2 Custom grouping of creative assets.
    #' @param custom_label_3 Custom grouping of creative assets.
    #' @param custom_label_4 Custom grouping of creative assets.
    #' @param description Brief description of the creative assets.
    #' @param google_product_category The categorization of the product based on the standardized Google Product Taxonomy. This is a set taxonomy. Both the text values and numeric codes are accepted.
    #' @param ios_deep_link IOS deep link to the creative assets page.
    #' @param link Link to the creative assets page.
    #' @param title The name of the creative assets.
    #' @param visibility Visibility of the creative assets. Must be one of the following values (upper or lowercase): ‘visible’, ‘hidden’.
    #' @param ... Other optional arguments.
    initialize = function(`android_deep_link` = NULL, `custom_label_0` = NULL, `custom_label_1` = NULL, `custom_label_2` = NULL, `custom_label_3` = NULL, `custom_label_4` = NULL, `description` = NULL, `google_product_category` = NULL, `ios_deep_link` = NULL, `link` = NULL, `title` = NULL, `visibility` = NULL, ...) {
      if (!is.null(`android_deep_link`)) {
        if (!(is.character(`android_deep_link`) && length(`android_deep_link`) == 1)) {
          stop(paste("Error! Invalid data for `android_deep_link`. Must be a string:", `android_deep_link`))
        }
        self$`android_deep_link` <- `android_deep_link`
      }
      if (!is.null(`custom_label_0`)) {
        if (!(is.character(`custom_label_0`) && length(`custom_label_0`) == 1)) {
          stop(paste("Error! Invalid data for `custom_label_0`. Must be a string:", `custom_label_0`))
        }
        self$`custom_label_0` <- `custom_label_0`
      }
      if (!is.null(`custom_label_1`)) {
        if (!(is.character(`custom_label_1`) && length(`custom_label_1`) == 1)) {
          stop(paste("Error! Invalid data for `custom_label_1`. Must be a string:", `custom_label_1`))
        }
        self$`custom_label_1` <- `custom_label_1`
      }
      if (!is.null(`custom_label_2`)) {
        if (!(is.character(`custom_label_2`) && length(`custom_label_2`) == 1)) {
          stop(paste("Error! Invalid data for `custom_label_2`. Must be a string:", `custom_label_2`))
        }
        self$`custom_label_2` <- `custom_label_2`
      }
      if (!is.null(`custom_label_3`)) {
        if (!(is.character(`custom_label_3`) && length(`custom_label_3`) == 1)) {
          stop(paste("Error! Invalid data for `custom_label_3`. Must be a string:", `custom_label_3`))
        }
        self$`custom_label_3` <- `custom_label_3`
      }
      if (!is.null(`custom_label_4`)) {
        if (!(is.character(`custom_label_4`) && length(`custom_label_4`) == 1)) {
          stop(paste("Error! Invalid data for `custom_label_4`. Must be a string:", `custom_label_4`))
        }
        self$`custom_label_4` <- `custom_label_4`
      }
      if (!is.null(`description`)) {
        if (!(is.character(`description`) && length(`description`) == 1)) {
          stop(paste("Error! Invalid data for `description`. Must be a string:", `description`))
        }
        self$`description` <- `description`
      }
      if (!is.null(`google_product_category`)) {
        if (!(is.character(`google_product_category`) && length(`google_product_category`) == 1)) {
          stop(paste("Error! Invalid data for `google_product_category`. Must be a string:", `google_product_category`))
        }
        self$`google_product_category` <- `google_product_category`
      }
      if (!is.null(`ios_deep_link`)) {
        if (!(is.character(`ios_deep_link`) && length(`ios_deep_link`) == 1)) {
          stop(paste("Error! Invalid data for `ios_deep_link`. Must be a string:", `ios_deep_link`))
        }
        self$`ios_deep_link` <- `ios_deep_link`
      }
      if (!is.null(`link`)) {
        if (!(is.character(`link`) && length(`link`) == 1)) {
          stop(paste("Error! Invalid data for `link`. Must be a string:", `link`))
        }
        self$`link` <- `link`
      }
      if (!is.null(`title`)) {
        if (!(is.character(`title`) && length(`title`) == 1)) {
          stop(paste("Error! Invalid data for `title`. Must be a string:", `title`))
        }
        self$`title` <- `title`
      }
      if (!is.null(`visibility`)) {
        if (!(is.character(`visibility`) && length(`visibility`) == 1)) {
          stop(paste("Error! Invalid data for `visibility`. Must be a string:", `visibility`))
        }
        self$`visibility` <- `visibility`
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
    #' @return CatalogsUpdatableCreativeAssetsAttributes as a base R list.
    #' @examples
    #' # convert array of CatalogsUpdatableCreativeAssetsAttributes (x) to a data frame
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
    #' Convert CatalogsUpdatableCreativeAssetsAttributes to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      CatalogsUpdatableCreativeAssetsAttributesObject <- list()
      if (!is.null(self$`android_deep_link`)) {
        CatalogsUpdatableCreativeAssetsAttributesObject[["android_deep_link"]] <-
          self$`android_deep_link`
      }
      if (!is.null(self$`custom_label_0`)) {
        CatalogsUpdatableCreativeAssetsAttributesObject[["custom_label_0"]] <-
          self$`custom_label_0`
      }
      if (!is.null(self$`custom_label_1`)) {
        CatalogsUpdatableCreativeAssetsAttributesObject[["custom_label_1"]] <-
          self$`custom_label_1`
      }
      if (!is.null(self$`custom_label_2`)) {
        CatalogsUpdatableCreativeAssetsAttributesObject[["custom_label_2"]] <-
          self$`custom_label_2`
      }
      if (!is.null(self$`custom_label_3`)) {
        CatalogsUpdatableCreativeAssetsAttributesObject[["custom_label_3"]] <-
          self$`custom_label_3`
      }
      if (!is.null(self$`custom_label_4`)) {
        CatalogsUpdatableCreativeAssetsAttributesObject[["custom_label_4"]] <-
          self$`custom_label_4`
      }
      if (!is.null(self$`description`)) {
        CatalogsUpdatableCreativeAssetsAttributesObject[["description"]] <-
          self$`description`
      }
      if (!is.null(self$`google_product_category`)) {
        CatalogsUpdatableCreativeAssetsAttributesObject[["google_product_category"]] <-
          self$`google_product_category`
      }
      if (!is.null(self$`ios_deep_link`)) {
        CatalogsUpdatableCreativeAssetsAttributesObject[["ios_deep_link"]] <-
          self$`ios_deep_link`
      }
      if (!is.null(self$`link`)) {
        CatalogsUpdatableCreativeAssetsAttributesObject[["link"]] <-
          self$`link`
      }
      if (!is.null(self$`title`)) {
        CatalogsUpdatableCreativeAssetsAttributesObject[["title"]] <-
          self$`title`
      }
      if (!is.null(self$`visibility`)) {
        CatalogsUpdatableCreativeAssetsAttributesObject[["visibility"]] <-
          self$`visibility`
      }
      return(CatalogsUpdatableCreativeAssetsAttributesObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of CatalogsUpdatableCreativeAssetsAttributes
    #'
    #' @param input_json the JSON input
    #' @return the instance of CatalogsUpdatableCreativeAssetsAttributes
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`android_deep_link`)) {
        self$`android_deep_link` <- this_object$`android_deep_link`
      }
      if (!is.null(this_object$`custom_label_0`)) {
        self$`custom_label_0` <- this_object$`custom_label_0`
      }
      if (!is.null(this_object$`custom_label_1`)) {
        self$`custom_label_1` <- this_object$`custom_label_1`
      }
      if (!is.null(this_object$`custom_label_2`)) {
        self$`custom_label_2` <- this_object$`custom_label_2`
      }
      if (!is.null(this_object$`custom_label_3`)) {
        self$`custom_label_3` <- this_object$`custom_label_3`
      }
      if (!is.null(this_object$`custom_label_4`)) {
        self$`custom_label_4` <- this_object$`custom_label_4`
      }
      if (!is.null(this_object$`description`)) {
        self$`description` <- this_object$`description`
      }
      if (!is.null(this_object$`google_product_category`)) {
        self$`google_product_category` <- this_object$`google_product_category`
      }
      if (!is.null(this_object$`ios_deep_link`)) {
        self$`ios_deep_link` <- this_object$`ios_deep_link`
      }
      if (!is.null(this_object$`link`)) {
        self$`link` <- this_object$`link`
      }
      if (!is.null(this_object$`title`)) {
        self$`title` <- this_object$`title`
      }
      if (!is.null(this_object$`visibility`)) {
        self$`visibility` <- this_object$`visibility`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return CatalogsUpdatableCreativeAssetsAttributes in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of CatalogsUpdatableCreativeAssetsAttributes
    #'
    #' @param input_json the JSON input
    #' @return the instance of CatalogsUpdatableCreativeAssetsAttributes
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`android_deep_link` <- this_object$`android_deep_link`
      self$`custom_label_0` <- this_object$`custom_label_0`
      self$`custom_label_1` <- this_object$`custom_label_1`
      self$`custom_label_2` <- this_object$`custom_label_2`
      self$`custom_label_3` <- this_object$`custom_label_3`
      self$`custom_label_4` <- this_object$`custom_label_4`
      self$`description` <- this_object$`description`
      self$`google_product_category` <- this_object$`google_product_category`
      self$`ios_deep_link` <- this_object$`ios_deep_link`
      self$`link` <- this_object$`link`
      self$`title` <- this_object$`title`
      self$`visibility` <- this_object$`visibility`
      self
    },

    #' @description
    #' Validate JSON input with respect to CatalogsUpdatableCreativeAssetsAttributes and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of CatalogsUpdatableCreativeAssetsAttributes
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
# CatalogsUpdatableCreativeAssetsAttributes$unlock()
#
## Below is an example to define the print function
# CatalogsUpdatableCreativeAssetsAttributes$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# CatalogsUpdatableCreativeAssetsAttributes$lock()

