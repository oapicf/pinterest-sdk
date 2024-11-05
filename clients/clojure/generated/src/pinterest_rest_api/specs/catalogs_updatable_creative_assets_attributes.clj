(ns pinterest-rest-api.specs.catalogs-updatable-creative-assets-attributes
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def catalogs-updatable-creative-assets-attributes-data
  {
   (ds/opt :title) string?
   (ds/opt :description) string?
   (ds/opt :link) string?
   (ds/opt :ios_deep_link) string?
   (ds/opt :android_deep_link) string?
   (ds/opt :google_product_category) string?
   (ds/opt :custom_label_0) string?
   (ds/opt :custom_label_1) string?
   (ds/opt :custom_label_2) string?
   (ds/opt :custom_label_3) string?
   (ds/opt :custom_label_4) string?
   (ds/opt :visibility) string?
   })

(def catalogs-updatable-creative-assets-attributes-spec
  (ds/spec
    {:name ::catalogs-updatable-creative-assets-attributes
     :spec catalogs-updatable-creative-assets-attributes-data}))
