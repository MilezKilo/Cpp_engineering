#include "pch.h"
#include "CppUnitTest.h"

using namespace Microsoft::VisualStudio::CppUnitTestFramework;

namespace UnitTest1 {
	TEST_CLASS(UnitTest1) {
	public:
		
		TEST_METHOD(TestMethod1) {
			
			float num1 = 2.0f;
			float num2 = 3.0f;

			float result = num1 + num2;

			Assert::AreEqual(result, 5.0f);
			
		}
		
		TEST_METHOD(TestMethod2) {
			float num1 = 5.0f;
			float num2 = 2.0f;

			float result = num1 - num2;

			Assert::AreEqual(result, 3.0f);
		}

		TEST_METHOD(TestMethod3) {
			float num1 = 5.0f;
			float num2 = 7.0f;

			float result = num1 * num2;

			Assert::AreEqual(result, 35.0f);
		}
		
	};
}
