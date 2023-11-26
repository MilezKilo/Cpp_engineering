#include "pch.h"
#include "CppUnitTest.h"
#include "C:\\Users\\frost\\OneDrive\\Рабочий стол\\МТУСИ\\5 семестр\\Инженерия разработки программного обеспечения\\C++\\Quadratic eqution\\ConsoleApplication1\\ConsoleApplication1\\quadraticEquation.cpp"

using namespace Microsoft::VisualStudio::CppUnitTestFramework;
using namespace std;

namespace UnitTest1 {
	TEST_CLASS(UnitTest1) {

	public:
		
		TEST_METHOD(TestMethod1) {
			auto roots = quadraticEqution(6, 1, 9);
			auto rootOne = get<0>(roots);
			Assert::AreEqual(rootOne, 1.0f);
		}

		TEST_METHOD(TestMethod2) {
			auto roots = quadraticEqution(1, 6, 9);
			\\
			Assert::AreEqual(rootOne, -3.0f);
		}

		TEST_METHOD(TestMethod3) {
			auto roots = quadraticEqution(1, 9, 6);
			auto rootOne = get<0>(roots);
			auto rootTwo = get<1>(roots);
			Assert::AreEqual(rootOne, -5.225082874298096f);
			Assert::AreEqual(rootTwo, -12.774917602539062f);
		}
	};
}