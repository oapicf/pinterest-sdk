#' Create a new CatalogsRetailFilterValuesMap
#'
#' @description
#' A map of filter attributes to their available values.
#'
#' @docType class
#' @title CatalogsRetailFilterValuesMap
#' @description CatalogsRetailFilterValuesMap Class
#' @format An \code{R6Class} generator object
#' @field ad_image_tags  list(character) [optional]
#' @field ad_video_tags  list(character) [optional]
#' @field availability  list(character) [optional]
#' @field brand  list(character) [optional]
#' @field condition  list(character) [optional]
#' @field custom_label_0  list(character) [optional]
#' @field custom_label_1  list(character) [optional]
#' @field custom_label_2  list(character) [optional]
#' @field custom_label_3  list(character) [optional]
#' @field custom_label_4  list(character) [optional]
#' @field gender  list(character) [optional]
#' @field google_product_category_0  list(character) [optional]
#' @field google_product_category_1  list(character) [optional]
#' @field google_product_category_2  list(character) [optional]
#' @field google_product_category_3  list(character) [optional]
#' @field google_product_category_4  list(character) [optional]
#' @field google_product_category_5  list(character) [optional]
#' @field google_product_category_6  list(character) [optional]
#' @field media_type  list(character) [optional]
#' @field product_type_0  list(character) [optional]
#' @field product_type_1  list(character) [optional]
#' @field product_type_2  list(character) [optional]
#' @field product_type_3  list(character) [optional]
#' @field product_type_4  list(character) [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
CatalogsRetailFilterValuesMap <- R6::R6Class(
  "CatalogsRetailFilterValuesMap",
  public = list(
    `ad_image_tags` = NULL,
    `ad_video_tags` = NULL,
    `availability` = NULL,
    `brand` = NULL,
    `condition` = NULL,
    `custom_label_0` = NULL,
    `custom_label_1` = NULL,
    `custom_label_2` = NULL,
    `custom_label_3` = NULL,
    `custom_label_4` = NULL,
    `gender` = NULL,
    `google_product_category_0` = NULL,
    `google_product_category_1` = NULL,
    `google_product_category_2` = NULL,
    `google_product_category_3` = NULL,
    `google_product_category_4` = NULL,
    `google_product_category_5` = NULL,
    `google_product_category_6` = NULL,
    `media_type` = NULL,
    `product_type_0` = NULL,
    `product_type_1` = NULL,
    `product_type_2` = NULL,
    `product_type_3` = NULL,
    `product_type_4` = NULL,

    #' @description
    #' Initialize a new CatalogsRetailFilterValuesMap class.
    #'
    #' @param ad_image_tags ad_image_tags
    #' @param ad_video_tags ad_video_tags
    #' @param availability availability
    #' @param brand brand
    #' @param condition condition
    #' @param custom_label_0 custom_label_0
    #' @param custom_label_1 custom_label_1
    #' @param custom_label_2 custom_label_2
    #' @param custom_label_3 custom_label_3
    #' @param custom_label_4 custom_label_4
    #' @param gender gender
    #' @param google_product_category_0 google_product_category_0
    #' @param google_product_category_1 google_product_category_1
    #' @param google_product_category_2 google_product_category_2
    #' @param google_product_category_3 google_product_category_3
    #' @param google_product_category_4 google_product_category_4
    #' @param google_product_category_5 google_product_category_5
    #' @param google_product_category_6 google_product_category_6
    #' @param media_type media_type
    #' @param product_type_0 product_type_0
    #' @param product_type_1 product_type_1
    #' @param product_type_2 product_type_2
    #' @param product_type_3 product_type_3
    #' @param product_type_4 product_type_4
    #' @param ... Other optional arguments.
    initialize = function(`ad_image_tags` = NULL, `ad_video_tags` = NULL, `availability` = NULL, `brand` = NULL, `condition` = NULL, `custom_label_0` = NULL, `custom_label_1` = NULL, `custom_label_2` = NULL, `custom_label_3` = NULL, `custom_label_4` = NULL, `gender` = NULL, `google_product_category_0` = NULL, `google_product_category_1` = NULL, `google_product_category_2` = NULL, `google_product_category_3` = NULL, `google_product_category_4` = NULL, `google_product_category_5` = NULL, `google_product_category_6` = NULL, `media_type` = NULL, `product_type_0` = NULL, `product_type_1` = NULL, `product_type_2` = NULL, `product_type_3` = NULL, `product_type_4` = NULL, ...) {
      if (!is.null(`ad_image_tags`)) {
        stopifnot(is.vector(`ad_image_tags`), length(`ad_image_tags`) != 0)
        sapply(`ad_image_tags`, function(x) stopifnot(is.character(x)))
        self$`ad_image_tags` <- `ad_image_tags`
      }
      if (!is.null(`ad_video_tags`)) {
        stopifnot(is.vector(`ad_video_tags`), length(`ad_video_tags`) != 0)
        sapply(`ad_video_tags`, function(x) stopifnot(is.character(x)))
        self$`ad_video_tags` <- `ad_video_tags`
      }
      if (!is.null(`availability`)) {
        stopifnot(is.vector(`availability`), length(`availability`) != 0)
        sapply(`availability`, function(x) stopifnot(is.character(x)))
        self$`availability` <- `availability`
      }
      if (!is.null(`brand`)) {
        stopifnot(is.vector(`brand`), length(`brand`) != 0)
        sapply(`brand`, function(x) stopifnot(is.character(x)))
        self$`brand` <- `brand`
      }
      if (!is.null(`condition`)) {
        stopifnot(is.vector(`condition`), length(`condition`) != 0)
        sapply(`condition`, function(x) stopifnot(is.character(x)))
        self$`condition` <- `condition`
      }
      if (!is.null(`custom_label_0`)) {
        stopifnot(is.vector(`custom_label_0`), length(`custom_label_0`) != 0)
        sapply(`custom_label_0`, function(x) stopifnot(is.character(x)))
        self$`custom_label_0` <- `custom_label_0`
      }
      if (!is.null(`custom_label_1`)) {
        stopifnot(is.vector(`custom_label_1`), length(`custom_label_1`) != 0)
        sapply(`custom_label_1`, function(x) stopifnot(is.character(x)))
        self$`custom_label_1` <- `custom_label_1`
      }
      if (!is.null(`custom_label_2`)) {
        stopifnot(is.vector(`custom_label_2`), length(`custom_label_2`) != 0)
        sapply(`custom_label_2`, function(x) stopifnot(is.character(x)))
        self$`custom_label_2` <- `custom_label_2`
      }
      if (!is.null(`custom_label_3`)) {
        stopifnot(is.vector(`custom_label_3`), length(`custom_label_3`) != 0)
        sapply(`custom_label_3`, function(x) stopifnot(is.character(x)))
        self$`custom_label_3` <- `custom_label_3`
      }
      if (!is.null(`custom_label_4`)) {
        stopifnot(is.vector(`custom_label_4`), length(`custom_label_4`) != 0)
        sapply(`custom_label_4`, function(x) stopifnot(is.character(x)))
        self$`custom_label_4` <- `custom_label_4`
      }
      if (!is.null(`gender`)) {
        stopifnot(is.vector(`gender`), length(`gender`) != 0)
        sapply(`gender`, function(x) stopifnot(is.character(x)))
        self$`gender` <- `gender`
      }
      if (!is.null(`google_product_category_0`)) {
        stopifnot(is.vector(`google_product_category_0`), length(`google_product_category_0`) != 0)
        sapply(`google_product_category_0`, function(x) stopifnot(is.character(x)))
        self$`google_product_category_0` <- `google_product_category_0`
      }
      if (!is.null(`google_product_category_1`)) {
        stopifnot(is.vector(`google_product_category_1`), length(`google_product_category_1`) != 0)
        sapply(`google_product_category_1`, function(x) stopifnot(is.character(x)))
        self$`google_product_category_1` <- `google_product_category_1`
      }
      if (!is.null(`google_product_category_2`)) {
        stopifnot(is.vector(`google_product_category_2`), length(`google_product_category_2`) != 0)
        sapply(`google_product_category_2`, function(x) stopifnot(is.character(x)))
        self$`google_product_category_2` <- `google_product_category_2`
      }
      if (!is.null(`google_product_category_3`)) {
        stopifnot(is.vector(`google_product_category_3`), length(`google_product_category_3`) != 0)
        sapply(`google_product_category_3`, function(x) stopifnot(is.character(x)))
        self$`google_product_category_3` <- `google_product_category_3`
      }
      if (!is.null(`google_product_category_4`)) {
        stopifnot(is.vector(`google_product_category_4`), length(`google_product_category_4`) != 0)
        sapply(`google_product_category_4`, function(x) stopifnot(is.character(x)))
        self$`google_product_category_4` <- `google_product_category_4`
      }
      if (!is.null(`google_product_category_5`)) {
        stopifnot(is.vector(`google_product_category_5`), length(`google_product_category_5`) != 0)
        sapply(`google_product_category_5`, function(x) stopifnot(is.character(x)))
        self$`google_product_category_5` <- `google_product_category_5`
      }
      if (!is.null(`google_product_category_6`)) {
        stopifnot(is.vector(`google_product_category_6`), length(`google_product_category_6`) != 0)
        sapply(`google_product_category_6`, function(x) stopifnot(is.character(x)))
        self$`google_product_category_6` <- `google_product_category_6`
      }
      if (!is.null(`media_type`)) {
        stopifnot(is.vector(`media_type`), length(`media_type`) != 0)
        sapply(`media_type`, function(x) stopifnot(is.character(x)))
        self$`media_type` <- `media_type`
      }
      if (!is.null(`product_type_0`)) {
        stopifnot(is.vector(`product_type_0`), length(`product_type_0`) != 0)
        sapply(`product_type_0`, function(x) stopifnot(is.character(x)))
        self$`product_type_0` <- `product_type_0`
      }
      if (!is.null(`product_type_1`)) {
        stopifnot(is.vector(`product_type_1`), length(`product_type_1`) != 0)
        sapply(`product_type_1`, function(x) stopifnot(is.character(x)))
        self$`product_type_1` <- `product_type_1`
      }
      if (!is.null(`product_type_2`)) {
        stopifnot(is.vector(`product_type_2`), length(`product_type_2`) != 0)
        sapply(`product_type_2`, function(x) stopifnot(is.character(x)))
        self$`product_type_2` <- `product_type_2`
      }
      if (!is.null(`product_type_3`)) {
        stopifnot(is.vector(`product_type_3`), length(`product_type_3`) != 0)
        sapply(`product_type_3`, function(x) stopifnot(is.character(x)))
        self$`product_type_3` <- `product_type_3`
      }
      if (!is.null(`product_type_4`)) {
        stopifnot(is.vector(`product_type_4`), length(`product_type_4`) != 0)
        sapply(`product_type_4`, function(x) stopifnot(is.character(x)))
        self$`product_type_4` <- `product_type_4`
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
    #' @return CatalogsRetailFilterValuesMap as a base R list.
    #' @examples
    #' # convert array of CatalogsRetailFilterValuesMap (x) to a data frame
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
    #' Convert CatalogsRetailFilterValuesMap to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      CatalogsRetailFilterValuesMapObject <- list()
      if (!is.null(self$`ad_image_tags`)) {
        CatalogsRetailFilterValuesMapObject[["ad_image_tags"]] <-
          self$`ad_image_tags`
      }
      if (!is.null(self$`ad_video_tags`)) {
        CatalogsRetailFilterValuesMapObject[["ad_video_tags"]] <-
          self$`ad_video_tags`
      }
      if (!is.null(self$`availability`)) {
        CatalogsRetailFilterValuesMapObject[["availability"]] <-
          self$`availability`
      }
      if (!is.null(self$`brand`)) {
        CatalogsRetailFilterValuesMapObject[["brand"]] <-
          self$`brand`
      }
      if (!is.null(self$`condition`)) {
        CatalogsRetailFilterValuesMapObject[["condition"]] <-
          self$`condition`
      }
      if (!is.null(self$`custom_label_0`)) {
        CatalogsRetailFilterValuesMapObject[["custom_label_0"]] <-
          self$`custom_label_0`
      }
      if (!is.null(self$`custom_label_1`)) {
        CatalogsRetailFilterValuesMapObject[["custom_label_1"]] <-
          self$`custom_label_1`
      }
      if (!is.null(self$`custom_label_2`)) {
        CatalogsRetailFilterValuesMapObject[["custom_label_2"]] <-
          self$`custom_label_2`
      }
      if (!is.null(self$`custom_label_3`)) {
        CatalogsRetailFilterValuesMapObject[["custom_label_3"]] <-
          self$`custom_label_3`
      }
      if (!is.null(self$`custom_label_4`)) {
        CatalogsRetailFilterValuesMapObject[["custom_label_4"]] <-
          self$`custom_label_4`
      }
      if (!is.null(self$`gender`)) {
        CatalogsRetailFilterValuesMapObject[["gender"]] <-
          self$`gender`
      }
      if (!is.null(self$`google_product_category_0`)) {
        CatalogsRetailFilterValuesMapObject[["google_product_category_0"]] <-
          self$`google_product_category_0`
      }
      if (!is.null(self$`google_product_category_1`)) {
        CatalogsRetailFilterValuesMapObject[["google_product_category_1"]] <-
          self$`google_product_category_1`
      }
      if (!is.null(self$`google_product_category_2`)) {
        CatalogsRetailFilterValuesMapObject[["google_product_category_2"]] <-
          self$`google_product_category_2`
      }
      if (!is.null(self$`google_product_category_3`)) {
        CatalogsRetailFilterValuesMapObject[["google_product_category_3"]] <-
          self$`google_product_category_3`
      }
      if (!is.null(self$`google_product_category_4`)) {
        CatalogsRetailFilterValuesMapObject[["google_product_category_4"]] <-
          self$`google_product_category_4`
      }
      if (!is.null(self$`google_product_category_5`)) {
        CatalogsRetailFilterValuesMapObject[["google_product_category_5"]] <-
          self$`google_product_category_5`
      }
      if (!is.null(self$`google_product_category_6`)) {
        CatalogsRetailFilterValuesMapObject[["google_product_category_6"]] <-
          self$`google_product_category_6`
      }
      if (!is.null(self$`media_type`)) {
        CatalogsRetailFilterValuesMapObject[["media_type"]] <-
          self$`media_type`
      }
      if (!is.null(self$`product_type_0`)) {
        CatalogsRetailFilterValuesMapObject[["product_type_0"]] <-
          self$`product_type_0`
      }
      if (!is.null(self$`product_type_1`)) {
        CatalogsRetailFilterValuesMapObject[["product_type_1"]] <-
          self$`product_type_1`
      }
      if (!is.null(self$`product_type_2`)) {
        CatalogsRetailFilterValuesMapObject[["product_type_2"]] <-
          self$`product_type_2`
      }
      if (!is.null(self$`product_type_3`)) {
        CatalogsRetailFilterValuesMapObject[["product_type_3"]] <-
          self$`product_type_3`
      }
      if (!is.null(self$`product_type_4`)) {
        CatalogsRetailFilterValuesMapObject[["product_type_4"]] <-
          self$`product_type_4`
      }
      return(CatalogsRetailFilterValuesMapObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of CatalogsRetailFilterValuesMap
    #'
    #' @param input_json the JSON input
    #' @return the instance of CatalogsRetailFilterValuesMap
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`ad_image_tags`)) {
        self$`ad_image_tags` <- ApiClient$new()$deserializeObj(this_object$`ad_image_tags`, "array[character]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`ad_video_tags`)) {
        self$`ad_video_tags` <- ApiClient$new()$deserializeObj(this_object$`ad_video_tags`, "array[character]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`availability`)) {
        self$`availability` <- ApiClient$new()$deserializeObj(this_object$`availability`, "array[character]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`brand`)) {
        self$`brand` <- ApiClient$new()$deserializeObj(this_object$`brand`, "array[character]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`condition`)) {
        self$`condition` <- ApiClient$new()$deserializeObj(this_object$`condition`, "array[character]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`custom_label_0`)) {
        self$`custom_label_0` <- ApiClient$new()$deserializeObj(this_object$`custom_label_0`, "array[character]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`custom_label_1`)) {
        self$`custom_label_1` <- ApiClient$new()$deserializeObj(this_object$`custom_label_1`, "array[character]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`custom_label_2`)) {
        self$`custom_label_2` <- ApiClient$new()$deserializeObj(this_object$`custom_label_2`, "array[character]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`custom_label_3`)) {
        self$`custom_label_3` <- ApiClient$new()$deserializeObj(this_object$`custom_label_3`, "array[character]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`custom_label_4`)) {
        self$`custom_label_4` <- ApiClient$new()$deserializeObj(this_object$`custom_label_4`, "array[character]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`gender`)) {
        self$`gender` <- ApiClient$new()$deserializeObj(this_object$`gender`, "array[character]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`google_product_category_0`)) {
        self$`google_product_category_0` <- ApiClient$new()$deserializeObj(this_object$`google_product_category_0`, "array[character]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`google_product_category_1`)) {
        self$`google_product_category_1` <- ApiClient$new()$deserializeObj(this_object$`google_product_category_1`, "array[character]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`google_product_category_2`)) {
        self$`google_product_category_2` <- ApiClient$new()$deserializeObj(this_object$`google_product_category_2`, "array[character]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`google_product_category_3`)) {
        self$`google_product_category_3` <- ApiClient$new()$deserializeObj(this_object$`google_product_category_3`, "array[character]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`google_product_category_4`)) {
        self$`google_product_category_4` <- ApiClient$new()$deserializeObj(this_object$`google_product_category_4`, "array[character]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`google_product_category_5`)) {
        self$`google_product_category_5` <- ApiClient$new()$deserializeObj(this_object$`google_product_category_5`, "array[character]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`google_product_category_6`)) {
        self$`google_product_category_6` <- ApiClient$new()$deserializeObj(this_object$`google_product_category_6`, "array[character]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`media_type`)) {
        self$`media_type` <- ApiClient$new()$deserializeObj(this_object$`media_type`, "array[character]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`product_type_0`)) {
        self$`product_type_0` <- ApiClient$new()$deserializeObj(this_object$`product_type_0`, "array[character]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`product_type_1`)) {
        self$`product_type_1` <- ApiClient$new()$deserializeObj(this_object$`product_type_1`, "array[character]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`product_type_2`)) {
        self$`product_type_2` <- ApiClient$new()$deserializeObj(this_object$`product_type_2`, "array[character]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`product_type_3`)) {
        self$`product_type_3` <- ApiClient$new()$deserializeObj(this_object$`product_type_3`, "array[character]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`product_type_4`)) {
        self$`product_type_4` <- ApiClient$new()$deserializeObj(this_object$`product_type_4`, "array[character]", loadNamespace("openapi"))
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return CatalogsRetailFilterValuesMap in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of CatalogsRetailFilterValuesMap
    #'
    #' @param input_json the JSON input
    #' @return the instance of CatalogsRetailFilterValuesMap
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`ad_image_tags` <- ApiClient$new()$deserializeObj(this_object$`ad_image_tags`, "array[character]", loadNamespace("openapi"))
      self$`ad_video_tags` <- ApiClient$new()$deserializeObj(this_object$`ad_video_tags`, "array[character]", loadNamespace("openapi"))
      self$`availability` <- ApiClient$new()$deserializeObj(this_object$`availability`, "array[character]", loadNamespace("openapi"))
      self$`brand` <- ApiClient$new()$deserializeObj(this_object$`brand`, "array[character]", loadNamespace("openapi"))
      self$`condition` <- ApiClient$new()$deserializeObj(this_object$`condition`, "array[character]", loadNamespace("openapi"))
      self$`custom_label_0` <- ApiClient$new()$deserializeObj(this_object$`custom_label_0`, "array[character]", loadNamespace("openapi"))
      self$`custom_label_1` <- ApiClient$new()$deserializeObj(this_object$`custom_label_1`, "array[character]", loadNamespace("openapi"))
      self$`custom_label_2` <- ApiClient$new()$deserializeObj(this_object$`custom_label_2`, "array[character]", loadNamespace("openapi"))
      self$`custom_label_3` <- ApiClient$new()$deserializeObj(this_object$`custom_label_3`, "array[character]", loadNamespace("openapi"))
      self$`custom_label_4` <- ApiClient$new()$deserializeObj(this_object$`custom_label_4`, "array[character]", loadNamespace("openapi"))
      self$`gender` <- ApiClient$new()$deserializeObj(this_object$`gender`, "array[character]", loadNamespace("openapi"))
      self$`google_product_category_0` <- ApiClient$new()$deserializeObj(this_object$`google_product_category_0`, "array[character]", loadNamespace("openapi"))
      self$`google_product_category_1` <- ApiClient$new()$deserializeObj(this_object$`google_product_category_1`, "array[character]", loadNamespace("openapi"))
      self$`google_product_category_2` <- ApiClient$new()$deserializeObj(this_object$`google_product_category_2`, "array[character]", loadNamespace("openapi"))
      self$`google_product_category_3` <- ApiClient$new()$deserializeObj(this_object$`google_product_category_3`, "array[character]", loadNamespace("openapi"))
      self$`google_product_category_4` <- ApiClient$new()$deserializeObj(this_object$`google_product_category_4`, "array[character]", loadNamespace("openapi"))
      self$`google_product_category_5` <- ApiClient$new()$deserializeObj(this_object$`google_product_category_5`, "array[character]", loadNamespace("openapi"))
      self$`google_product_category_6` <- ApiClient$new()$deserializeObj(this_object$`google_product_category_6`, "array[character]", loadNamespace("openapi"))
      self$`media_type` <- ApiClient$new()$deserializeObj(this_object$`media_type`, "array[character]", loadNamespace("openapi"))
      self$`product_type_0` <- ApiClient$new()$deserializeObj(this_object$`product_type_0`, "array[character]", loadNamespace("openapi"))
      self$`product_type_1` <- ApiClient$new()$deserializeObj(this_object$`product_type_1`, "array[character]", loadNamespace("openapi"))
      self$`product_type_2` <- ApiClient$new()$deserializeObj(this_object$`product_type_2`, "array[character]", loadNamespace("openapi"))
      self$`product_type_3` <- ApiClient$new()$deserializeObj(this_object$`product_type_3`, "array[character]", loadNamespace("openapi"))
      self$`product_type_4` <- ApiClient$new()$deserializeObj(this_object$`product_type_4`, "array[character]", loadNamespace("openapi"))
      self
    },

    #' @description
    #' Validate JSON input with respect to CatalogsRetailFilterValuesMap and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of CatalogsRetailFilterValuesMap
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
# CatalogsRetailFilterValuesMap$unlock()
#
## Below is an example to define the print function
# CatalogsRetailFilterValuesMap$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# CatalogsRetailFilterValuesMap$lock()

