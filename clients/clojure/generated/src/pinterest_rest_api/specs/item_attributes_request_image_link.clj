(ns pinterest-rest-api.specs.item-attributes-request-image-link
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def item-attributes-request-image-link-data
  {
   })

(def item-attributes-request-image-link-spec
  (ds/spec
    {:name ::item-attributes-request-image-link
     :spec item-attributes-request-image-link-data}))
