#include <iostream>
using namespace std;

struct Student {
    int roll;
    char name[50];
    float marks;
};

int main() {
    Student s[5];

    for (int i = 0; i < 5; i++) {
        cout << "\nEnter details of student " << i + 1 << endl;

        cout << "Roll number: ";
        cin >> s[i].roll;

        cout << "Name: ";
        cin >> s[i].name;

        cout << "Marks: ";
        cin >> s[i].marks;
    }

    cout << "\n--- Student Details ---\n";
    for (int i = 0; i < 5; i++) {
        cout << "\nStudent " << i + 1 << endl;
        cout << "Roll number: " << s[i].roll << endl;
        cout << "Name: " << s[i].name << endl;
        cout << "Marks: " << s[i].marks << endl;
    }

    return 0;
}
