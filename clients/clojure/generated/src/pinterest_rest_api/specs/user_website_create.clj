(ns pinterest-rest-api.specs.user-website-create
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.website-verification-method :refer :all]
            )
  (:import (java.io File)))


(def user-website-create-data
  {
   (ds/opt :verification_method) website-verification-method-spec
   (ds/opt :website) string?
   })

(def user-website-create-spec
  (ds/spec
    {:name ::user-website-create
     :spec user-website-create-data}))
