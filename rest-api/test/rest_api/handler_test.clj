;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; This code is being developed for the TANGO Project: http://tango-project.eu
;;
;; Copyright: Roi Sucasas Font, Atos Research and Innovation, 2017.
;;
;; This code is licensed under a GNU General Public License, version 3 license.
;; Please, refer to the LICENSE.TXT file for more information
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
(ns rest-api.handler-test
  (:require [clojure.test :refer :all]))
            ;[ring.mock.request :as mock]
            ;[rest-api.handler :refer :all]))

(deftest test-01
  (testing "Test (1=1): " (is (= 1 1))))

;
;(deftest test-app
;  (testing "main route"
;    (let [response (app (mock/request :get "/"))]
;      (is (= (:status response) 200))
;      (is (= (:body response) "Service running..."))))
;
;  (testing "not-found route"
;    (let [response (app (mock/request :get "/invalid"))]
;      (is (= (:status response) 404)))))
