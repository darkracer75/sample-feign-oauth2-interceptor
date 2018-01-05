#!/usr/bin/env bash
stubby -d mocks.yml -l localhost -s 8090 -t 7090 -a 5090 -w