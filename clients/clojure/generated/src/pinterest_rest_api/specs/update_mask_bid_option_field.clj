(ns pinterest-rest-api.specs.update-mask-bid-option-field
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def update-mask-bid-option-field-data
  {
   })

(def update-mask-bid-option-field-spec
  (ds/spec
    {:name ::update-mask-bid-option-field
     :spec update-mask-bid-option-field-data}))
