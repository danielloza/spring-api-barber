package com.formacionbdi.springboot.generic.auth;

public class JwtConfig {
	
	public static final String RSA_PRIVADA = "-----BEGIN RSA PRIVATE KEY-----\r\n"
			+ "MIIEpAIBAAKCAQEApbqcRSm3giC27B6jaB5EmSkg1rU8xlry2FQkS+hl80mv1EDD\r\n"
			+ "5dLNSOdoYQCpNXGJKRvoKt9HlVCnK0mRoeXRlhff9pQ50PODPs2QkRHfr8L6KZLE\r\n"
			+ "nt6iohCB7I7rSZBr56Kbi0STaBJO+0cCCHHq+9JGWKXhBLdmuu5IfY+z4woTQbSm\r\n"
			+ "h/s7T4Ge+UoY10nWfgm/j9rBw8QUt2Cj/6BGTImxQhq19VPCOTlwgzbsgPHpCRyt\r\n"
			+ "OFRMNImvh9BmPTE+bjoIfxo7V1LiQSv3587koXKYdm8d+775yx2HZOE37ZvQiXcD\r\n"
			+ "OcZC/ZfX2Wd+F9C9bidUH//BBivBxgrGxWxBOwIDAQABAoIBAQCKKkpPytinjviR\r\n"
			+ "X3WhvuI3wjcTaSNSxs4Alh1wfz5Hlp4U2S24c4cbiXjWrgNjf9T2xcJHw7/c9tF3\r\n"
			+ "YC0eiQezFxJrcuXEks9PU3d7yifvUyDV+fsb68YwUIzQl9IGkXW0Njdw4un1cJYS\r\n"
			+ "HP/P5JEgAg0NqLUxBmmJ3E/pBh3VX+ALgP9nabkwX7ImrzmhMVfP++iiYUmex1Ij\r\n"
			+ "mgAa1rvHEonmRDee24iBJdzEdmm4x7Z5hASlCvAjAvFrKaudZT5hmdCtwUnJzWpM\r\n"
			+ "4nSWkMcFt6HyO6Fv0qtl1WJ/JhwuS2hdhBcBExaVa1wYFzQRobu/wIpfHZ46tfcF\r\n"
			+ "FkUlyTdJAoGBANjGdjMk+8PHFPomdC8LEAIf9Z7CN+3h28Po2Wfq+W3TU4LeIYqp\r\n"
			+ "0Lr4AHx8WG26eo+1xBb8a9IUQlbe44E6DoKz33OZ7rBmMRDpYB914CTSOw6F81BS\r\n"
			+ "PQ6iUM0gHNbN3nZfWY5M1asyqhsvoTMCIBfR7wADYX8CTk23FOAKNcr3AoGBAMO3\r\n"
			+ "kIH+fBCWhzelSoOvc9q5YYiskP12A/SjpWyvDYK+jhveqWsT8jVJTGrE5/8ZmTR2\r\n"
			+ "wt3Z49oGGcEzmc2ycXR2ckeH3lVBYRIz11PN0oQ8bqMH3ISHefdgcNDea2fMg3qX\r\n"
			+ "zyQwf8mEZzqRqpxdRVfbdpCotrp8gW/KK/wMx8bdAoGAHPSVgUtlXcdP5AIS7t25\r\n"
			+ "a689LdGfiuTqaAbIU3stih/6PbbSICWCvha2aepqHW4VRPDwmmlpNYyDN/tZxD8v\r\n"
			+ "BQJlzJk5KtLbpvilYE5sfD6gqNX3pDj38uZ3iI7Li13AY2tlGP7mY5HG6w63p4qX\r\n"
			+ "Itdl50iMU1zJfNQBs9NpUA0CgYEAwngAB5q07cqUOs9rdeN9K4TuC97kBmUgUxHT\r\n"
			+ "ymU5+IKdM8YP8wyTqyzU2HYkyw5Fc6LZx5S8WSOcraM3HPNE1mLm9HplibL34B1Q\r\n"
			+ "xL2LgseFa0rha3It14alMnT+pdnJfqOfOCdUogiEhea9brcissSnT9/ECRKzjj+F\r\n"
			+ "auHME6UCgYBzKQCxBxdqDH4QEb2jSyflZ7O5HlLVMjQDMcgjKo2izaLIQ/fl2ZVj\r\n"
			+ "uOiY5t3uECZrJBzslH2iMg4W4ZNwzyhp8yr3nuHUdD8cu5U08nUMQl2tdMLOK7ne\r\n"
			+ "r8Z5bp0trnx04SoLYMNcsE34nBUIjenozW3ixoy/nKej26eqETbtxQ==\r\n"
			+ "-----END RSA PRIVATE KEY-----";
	
	public static final String RSA_PUBLICA = "-----BEGIN PUBLIC KEY-----\r\n"
			+ "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEApbqcRSm3giC27B6jaB5E\r\n"
			+ "mSkg1rU8xlry2FQkS+hl80mv1EDD5dLNSOdoYQCpNXGJKRvoKt9HlVCnK0mRoeXR\r\n"
			+ "lhff9pQ50PODPs2QkRHfr8L6KZLEnt6iohCB7I7rSZBr56Kbi0STaBJO+0cCCHHq\r\n"
			+ "+9JGWKXhBLdmuu5IfY+z4woTQbSmh/s7T4Ge+UoY10nWfgm/j9rBw8QUt2Cj/6BG\r\n"
			+ "TImxQhq19VPCOTlwgzbsgPHpCRytOFRMNImvh9BmPTE+bjoIfxo7V1LiQSv3587k\r\n"
			+ "oXKYdm8d+775yx2HZOE37ZvQiXcDOcZC/ZfX2Wd+F9C9bidUH//BBivBxgrGxWxB\r\n"
			+ "OwIDAQAB\r\n"
			+ "-----END PUBLIC KEY-----";
}
